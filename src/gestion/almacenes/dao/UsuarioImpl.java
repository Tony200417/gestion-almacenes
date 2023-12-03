/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.almacenes.dao;

import gestion.almacenes.dao.entities.Usuario;
import gestion.almacenes.db.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cbaciliod
 */
public class UsuarioImpl implements IUsuario {

    private final Database database;
    private String message;

    public UsuarioImpl() {
        database = new Database();
    }

    @Override

    public String usuarioCreate(Usuario usuario) {

        StringBuilder QUERY_INSERT = new StringBuilder();
        QUERY_INSERT.append("INSERT INTO USUARIOS ");
        QUERY_INSERT.append("(NOMBRE, APELLIDOS, USUARIO, PASSWORD, CELULAR, DNI) ");
        QUERY_INSERT.append("VALUES (?,?,?,?,?,?);");

        try (Connection conn = database.getConnection(); PreparedStatement st = conn.prepareStatement(QUERY_INSERT.toString());) {
            st.setString(1, usuario.getNombre());
            st.setString(2, usuario.getApellidos());
            st.setString(3, usuario.getUsuario());
            st.setString(4, usuario.getPassword());
            st.setString(5, usuario.getCelular());
            st.setString(6, usuario.getDni());

            int rows = st.executeUpdate();

            if (rows == 0) {
                message = "0 filas afectadas";
            } else {
                message = "Usuario registrado";
            }
            System.out.println("QUERY_INSERT " + message);
        } catch (Exception e) {
            message = e.getMessage();
        }

        return message;
    }

    @Override
    public List<Usuario> usuarioRead() {
        List<Usuario> usuarios = new ArrayList<>();
        final String QUERY_SELECT = "SELECT * FROM USUARIOS";
        try (
                Connection conn = database.getConnection(); PreparedStatement ps = conn.prepareStatement(QUERY_SELECT); ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setNombre(rs.getString("NOMBRE"));
                usuario.setApellidos(rs.getString("APELLIDOS"));
                usuario.setCelular(rs.getString("CELULAR"));
                usuario.setDni(rs.getString("DNI"));
                usuario.setUsuario(rs.getString("USUARIO"));
                usuario.setPassword(rs.getString("PASSWORD"));
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            message = e.getMessage();
        }
        return usuarios;
    }

    @Override
    public String usuarioUpdate(Usuario usuario) {

        StringBuilder QUERY_UPDATE = new StringBuilder();
        QUERY_UPDATE.append("UPDATE USUARIOS SET ");
        QUERY_UPDATE.append("NOMBRE = ?, ");
        QUERY_UPDATE.append("APELLIDOS = ?, ");
        //QUERY_UPDATE.append("USUARIO = ?, ");
        QUERY_UPDATE.append("PASSWORD = ?, ");
        QUERY_UPDATE.append("CELULAR = ? ");
        //QUERY_UPDATE.append("DNI = ?, ");
        QUERY_UPDATE.append("WHERE DNI = ?;");

        try (
                Connection conn = database.getConnection(); PreparedStatement ps = conn.prepareStatement(QUERY_UPDATE.toString());) {
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellidos());
            //ps.setString(3, usuario.getUsuario());
            ps.setString(3, usuario.getPassword());
            ps.setString(4, usuario.getCelular());
            //ps.setString(6, usuario.getDni());
            ps.setString(5, usuario.getDni());

            int rows = ps.executeUpdate();
            if (rows == 0) {
                message = "0 filas afectadas";
            } else {
                message = "Usuario actualizado";
            }
            System.out.println("QUERY_INSERT " + message);
        } catch (Exception e) {
            message = e.getMessage();
        }
        return message;
    }

    @Override
    public String usuarioDelete(String idDni) {
        final String QUERY_DELETE = "DELETE FROM USUARIOS WHERE DNI = ?;";
        try (
                Connection conn = database.getConnection(); PreparedStatement ps = conn.prepareStatement(QUERY_DELETE);) {

            ps.setString(1, idDni);
            int rows = ps.executeUpdate();
            if (rows == 0) {
                message = "0 filas afectadas";
            } else {
                message = "Usuario eliminado";
            }
        } catch (Exception e) {
            message = e.getMessage();
        }
        return message;
    }

    @Override
    public Usuario usuarioGet(String idDni) {
        StringBuilder QUERY_SELECT = new StringBuilder();
        QUERY_SELECT.append("SELECT DNI, NOMBRE, APELLIDOS, USUARIO, PASSWORD, CELULAR ");
        QUERY_SELECT.append("FROM USUARIOS ");
        QUERY_SELECT.append("WHERE DNI = ?");

        Usuario usuario = null;
        try (
                Connection conn = database.getConnection(); PreparedStatement ps = conn.prepareStatement(QUERY_SELECT.toString());) {
            ps.setString(1, idDni);

            try (ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                    usuario = new Usuario();
                    usuario.setNombre(rs.getString("NOMBRE"));
                    usuario.setApellidos(rs.getString("APELLIDOS"));
                    usuario.setCelular(rs.getString("CELULAR"));
                    usuario.setDni(rs.getString("DNI"));
                    usuario.setUsuario(rs.getString("USUARIO"));
                    usuario.setPassword(rs.getString("PASSWORD"));
                }
            } catch (Exception e) {
                message = e.getMessage();
            }

        } catch (Exception e) {
            message = e.getMessage();
        }
        return usuario;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
