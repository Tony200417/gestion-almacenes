/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.almacenes.dao;

import gestion.almacenes.dao.entities.Usuario;
import gestion.almacenes.db.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
            }else{
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String usuarioUpdate(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String usuarioDelete(String idDni) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario usuarioGet(String idDni) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getMessage() {
        return message;
    }

}
