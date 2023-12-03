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
        List <Usuario> usuarios = new ArrayList<>();
        final String QUERY_SELECT = "SELECT * FROM USUARIOS";
        try (
                //1.-OBTENER LA CONEXION A BASE DE DATOS
                Connection conn = database.getConnection(); //2.-PREPARAR LA CONSULTA
                 PreparedStatement ps = conn.prepareStatement(QUERY_SELECT); //3.-EJECUTAR LA CONSULTA
                 ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Usuario usuario = new Usuario();
                
                usuario.setNombre(QUERY_SELECT);
                usuario.setApellidos(rs.getString("APELLIDOS"));
                
                usuarios.add(usuario);
                
                System.out.println("USUARIOS " + usuario.getApellidos());
                
            }
        } catch (Exception e) {
            
        }
        
        System.out.println("CANTIDAD " + usuarios.size());
        return usuarios;
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
