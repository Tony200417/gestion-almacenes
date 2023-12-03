/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.almacenes.dao;

import gestion.almacenes.dao.entities.Insumo;
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
public class InsumoImpl implements IInsumo {

    private final Database database;
    private String message;

    public InsumoImpl() {
        database = new Database();
    }

    @Override
    public String insumoCreate(Insumo insumo) {
        StringBuilder QUERY_INSERT = new StringBuilder();
        QUERY_INSERT.append("INSERT INTO INSUMOS ");
        QUERY_INSERT.append("(ID, PROVEDOR_ID, PRECIO, STOCK_INICIAL, SERIE, NOMBRE, TIPO) ");
        QUERY_INSERT.append("VALUES (?,?,?,?,?,?);");

        try (Connection conn = database.getConnection(); PreparedStatement st = conn.prepareStatement(QUERY_INSERT.toString());) {
            st.setString(1, insumo.getId());
            st.setString(2, insumo.getIdProveedor());
            st.setDouble(3, insumo.getPrecio());
            st.setDouble(4, insumo.getStockInicial());
            st.setString(5, insumo.getSerie());
            st.setString(6, insumo.getNombre());
            st.setString(6, insumo.getTipo());

            int rows = st.executeUpdate();

            if (rows == 0) {
                message = "0 filas afectadas";
            } else {
                message = "Insumo registrado";
            }
            System.out.println("QUERY_INSERT " + message);
        } catch (Exception e) {
            message = e.getMessage();
        }

        return message;
    }

    @Override
    public List<Insumo> insumoRead() {
        List<Insumo> insumos = new ArrayList<>();
        final String QUERY_SELECT = "SELECT * FROM INSUMOS";
        try (
                Connection conn = database.getConnection(); PreparedStatement ps = conn.prepareStatement(QUERY_SELECT); ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Insumo insumo = new Insumo();
                insumo.setId(rs.getString("ID"));
                insumo.setIdProveedor(rs.getString("PROVEDOR_ID"));
                insumo.setPrecio(rs.getDouble("PRECIO"));
                insumo.setStockInicial(rs.getDouble("STOCK_INICIAL"));
                insumo.setSerie(rs.getString("SERIE"));
                insumo.setNombre(rs.getString("NOMBRE"));
                insumo.setTipo(rs.getString("TIPO"));
                insumos.add(insumo);
            }
        } catch (Exception e) {
            message = e.getMessage();
        }
        return insumos;
    }

    @Override
    public String insumoUpdate(Insumo insumo) {

        StringBuilder QUERY_UPDATE = new StringBuilder();
        QUERY_UPDATE.append("UPDATE INSUMOS SET ");
        QUERY_UPDATE.append("ID = ?, ");
        QUERY_UPDATE.append("PROVEDOR_ID = ?, ");
        QUERY_UPDATE.append("PRECIO= ?, ");
        QUERY_UPDATE.append("STOCK_INICIAL = ?, ");
        QUERY_UPDATE.append("SERIE = ? ");
        QUERY_UPDATE.append("NOMBRE = ?, ");
        QUERY_UPDATE.append("TIPO = ?, ");
        QUERY_UPDATE.append("WHERE ID = ?;");

        try (
                Connection conn = database.getConnection(); PreparedStatement ps = conn.prepareStatement(QUERY_UPDATE.toString());) {
            ps.setString(1, insumo.getId());
            ps.setString(2, insumo.getIdProveedor());
            ps.setDouble(3, insumo.getPrecio());
            ps.setDouble(4, insumo.getStockInicial());
            ps.setString(5, insumo.getSerie());
            ps.setString(6, insumo.getNombre());
            ps.setString(7, insumo.getTipo());

            int rows = ps.executeUpdate();
            if (rows == 0) {
                message = "0 filas afectadas";
            } else {
                message = "Insumo actualizado";
            }
            System.out.println("QUERY_INSERT " + message);
        } catch (Exception e) {
            message = e.getMessage();
        }
        return message;
    }

    @Override
    public String insumoDelete(String idinsumo) {
        final String QUERY_DELETE = "DELETE FROM INSUMOS WHERE ID = ?;";
        try (
                Connection conn = database.getConnection(); PreparedStatement ps = conn.prepareStatement(QUERY_DELETE);) {

            ps.setString(1, idinsumo);
            int rows = ps.executeUpdate();
            if (rows == 0) {
                message = "0 filas afectadas";
            } else {
                message = "Insumos eliminado";
            }
        } catch (Exception e) {
            message = e.getMessage();
        }
        return message;
    }

    @Override
    public Insumo insumoGet(String idinsumo) {
        StringBuilder QUERY_SELECT = new StringBuilder();
        QUERY_SELECT.append("SELECT ID, PROVEDOR_ID, PRECIO, STOCK_INICIAL, SERIE, NOMBRE, TIPO");
        QUERY_SELECT.append("FROM INSUMOS ");
        QUERY_SELECT.append("WHERE ID = ?");

        Insumo insumo = null;
        try (
                Connection conn = database.getConnection(); PreparedStatement ps = conn.prepareStatement(QUERY_SELECT.toString());) {
            ps.setString(1, idinsumo);

            try (ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                    insumo = new Insumo();
                    insumo.setId(rs.getString("ID"));
                    insumo.setIdProveedor(rs.getString("PROVEDOR_ID"));
                    insumo.setPrecio(rs.getDouble("PRECIO"));
                    insumo.setStockInicial(rs.getDouble("STOCK_INICIAL"));
                    insumo.setSerie(rs.getString("SERIE"));
                    insumo.setNombre(rs.getString("NOMBRE"));
                    insumo.setTipo(rs.getString("TIPO"));
                }
            } catch (Exception e) {
                message = e.getMessage();
            }

        } catch (Exception e) {
            message = e.getMessage();
        }
        return insumo;
    }

}
