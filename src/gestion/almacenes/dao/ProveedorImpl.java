/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.almacenes.dao;

import gestion.almacenes.dao.entities.Proveedor;
import gestion.almacenes.db.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bacilio
 */
public class ProveedorImpl implements IProveedor {

    private final Database database;
    private String message;

    public ProveedorImpl() {
        database = new Database();
    }

    @Override
    public String proveedorCreate(Proveedor proveedor) {

        StringBuilder QUERY_INSERT = new StringBuilder();
        QUERY_INSERT.append("INSERT INTO PROVEEDORES ");
        QUERY_INSERT.append("(RUC, RAZON_SACIAL, CELULAR, EMAIL, DIRECCION, FECHA_REGISTRO, FECHA_ACTUALIZACION) ");
        QUERY_INSERT.append("VALUES (?,?,?,?,?,?.?);");

        try (Connection conn = database.getConnection(); PreparedStatement st = conn.prepareStatement(QUERY_INSERT.toString());) {
            st.setString(1, proveedor.getRuc());
            st.setString(2, proveedor.getRazonSocial());
            st.setString(3, proveedor.getCelular());
            st.setString(4, proveedor.getEmail());
            st.setString(5, proveedor.getDireccion());
            //st.setString(6, proveedor.getFechaReg());
            //st.setString(7, proveedor.getFechaAct());

            int rows = st.executeUpdate();

            if (rows == 0) {
                message = "0 filas afectadas";
            } else {
                message = "Proveedor registrado";
            }
            System.out.println("QUERY_INSERT " + message);
        } catch (Exception e) {
            message = e.getMessage();
        }

        return message;
    }

    @Override
    public List<Proveedor> proveedorRead() {
        List<Proveedor> proveedores = new ArrayList<>();
        final String QUERY_SELECT = "SELECT * FROM PROVEEDORES";
        try (
                Connection conn = database.getConnection(); PreparedStatement ps = conn.prepareStatement(QUERY_SELECT); ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setRuc(rs.getString("RUC"));
                proveedor.setRazonSocial(rs.getString("RAZON_SACIAL"));
                proveedor.setCelular(rs.getString("CELULAR"));
                proveedor.setEmail(rs.getString("EMAIL"));
                proveedor.setDireccion(rs.getString("DIRECCION"));
                //proveedor.setFechaReg(rs.getString("FECHA_REGISTRO"));
                //proveedor.setFechaAct(rs.getString("FECHA_ACTUALIZACION"));
                proveedores.add(proveedor);
            }
        } catch (Exception e) {
            message = e.getMessage();
        }
        return proveedores;
    }

    @Override
    public String proveedorUpdate(Proveedor proveedor) {

        StringBuilder QUERY_UPDATE = new StringBuilder();
        QUERY_UPDATE.append("UPDATE PROVEEDORES SET ");
        //QUERY_UPDATE.append("RAZON_SACIAL = ?, ");
        QUERY_UPDATE.append("CELULAR = ?, ");
        QUERY_UPDATE.append("EMAIL = ?, ");
        QUERY_UPDATE.append("DIRECCIÓN = ?, ");
        QUERY_UPDATE.append("FECHA_REGISTRO = ? ");
        QUERY_UPDATE.append("FECHA_ACTUALIZACION = ?, ");
        QUERY_UPDATE.append("WHERE RUC = ?;");

        try (
                Connection conn = database.getConnection(); PreparedStatement ps = conn.prepareStatement(QUERY_UPDATE.toString());) {
            ps.setString(1, proveedor.getCelular());
            ps.setString(2, proveedor.getEmail());
            //ps.setString(3, usuario.getUsuario());
            ps.setString(3, proveedor.getDireccion());
           // ps.setString(4, proveedor.getFechaReg());
            //ps.setString(5, proveedor.getFechaAct());
            ps.setString(6, proveedor.getRuc());

            int rows = ps.executeUpdate();
            if (rows == 0) {
                message = "0 filas afectadas";
            } else {
                message = "Proveedor actualizado";
            }
            System.out.println("QUERY_INSERT " + message);
        } catch (Exception e) {
            message = e.getMessage();
        }
        return message;
    }

    @Override
    public String proveedorDelete(String idruc) {
        final String QUERY_DELETE = "DELETE FROM PROVEEDORES WHERE RUC = ?;";
        try (
                Connection conn = database.getConnection(); PreparedStatement ps = conn.prepareStatement(QUERY_DELETE);) {

            ps.setString(1, idruc);
            int rows = ps.executeUpdate();
            if (rows == 0) {
                message = "0 filas afectadas";
            } else {
                message = "Proveedor eliminado";
            }
        } catch (Exception e) {
            message = e.getMessage();
        }
        return message;
    }

    @Override
    public Proveedor proveedorGet(String idruc) {
        StringBuilder QUERY_SELECT = new StringBuilder();
        QUERY_SELECT.append("SELECT RUC, RAZON_SACIAL, CELULAR, EMAIL, DIRECCION, FECHA_REGISTRO, FECHA_ACTUALIZACION ");
        QUERY_SELECT.append("FROM PROVEEDORES ");
        QUERY_SELECT.append("WHERE RUC = ?");

        Proveedor proveedor = null;
        try (
                Connection conn = database.getConnection(); PreparedStatement ps = conn.prepareStatement(QUERY_SELECT.toString());) {
            ps.setString(1, idruc);

            try (ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                    proveedor = new Proveedor();
                    proveedor.setRuc(rs.getString("RUC"));
                    proveedor.setRazonSocial(rs.getString("RAZON_SACIAL"));
                    proveedor.setCelular(rs.getString("CELULAR"));
                    proveedor.setEmail(rs.getString("EMAIL"));
                    proveedor.setDireccion(rs.getString("DIRECCION"));
                    //proveedor.setFechaReg(rs.getString("FECHA_REGISTRO"));
                    //proveedor.setFechaAct(rs.getString("FECHA_ACTUALIZACION"));

                }
            } catch (Exception e) {
                message = e.getMessage();
            }

        } catch (Exception e) {
            message = e.getMessage();
        }
        return proveedor;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
