/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.almacenes.db;

import gestion.almacenes.datos.IUsuario;
import gestion.almacenes.datos.UsuarioImpl;
import gestion.almacenes.dao.entities.Usuario;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cbaciliod La declaración de prueba con recursos
 */
public class Database {

    private Connection connection;

    public Connection getConnection() {
        return getConnectionDb();
    }

    //aplicacion ----driver---- base de datos
    private Connection getConnectionDb() {
        try {
            //final String URL_DATABASE = "jdbc:ucanaccess://D:\\2023\\bacsystem\\infrastructure\\docker\\apps\\java\\desktop\\gestion-almacenes\\database\\database.accdb";
            final String URL_DATABASE = "jdbc:ucanaccess://D:\\jose\\github\\java\\gestion-almacenes\\database\\database.accdb";
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            connection = DriverManager.getConnection(URL_DATABASE);
            if (connection != null) {
                System.out.println("CONECTADO");
            } else {
                System.out.println("NO CONECTADO");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    public static void main(String[] args) {
        Database database = new Database();
        database.selectRows();
        
                
    }

    private void insertRow() {
        Database database = new Database();
        final String QUERY_INSERT = "INSERT INTO PERSONA(name) VALUES ('JOSE')";

        try (
                //1.-OBTENER LA CONEXION A BASE DE DATOS
                Connection conn = database.getConnection(); //2.-PREPARAR LA CONSULTA
                 PreparedStatement ps = conn.prepareStatement(QUERY_INSERT);) {
            int row = ps.executeUpdate();
            System.out.println("ROWS " + row);
        } catch (Exception e) {
        }
    }

    private void selectRows() {
        Database database = new Database();
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
    }

    private void updateRow() {
        Database database = new Database();
        final String QUERY_UPDATE = "UPDATE PERSONA SET name = ? WHERE Id = ?";
        try (
                //1.-OBTENER LA CONEXION A BASE DE DATOS
                Connection conn = database.getConnection(); //2.-PREPARAR LA CONSULTA
                 PreparedStatement ps = conn.prepareStatement(QUERY_UPDATE);) {
            System.out.println("QUERY_UPDATE " + QUERY_UPDATE);
            ps.setString(1, "ROBERT");
            ps.setInt(2, 1);
            int row = ps.executeUpdate();
            System.out.println("ROWS " + row);
        } catch (Exception e) {
        }
    }

    private void deleteRow() {
        Database database = new Database();
        final String QUERY_DELETE = "DELETE FROM PERSONA WHERE Id = ?";
        try (
                //1.-OBTENER LA CONEXION A BASE DE DATOS
                Connection conn = database.getConnection(); //2.-PREPARAR LA CONSULTA
                 PreparedStatement ps = conn.prepareStatement(QUERY_DELETE);) {
            ps.setInt(1, 2);
            int row = ps.executeUpdate();
            System.out.println("ROWS " + row);
        } catch (Exception e) {
        }
    }

    public void demoIUsuario() {
        IUsuario iUsuario = new UsuarioImpl();
        Usuario usuario = new Usuario();
        usuario.setDni("44910166");
        usuario.setNombre("David");
        usuario.setApellidos("Bacilio");
        usuario.setUsuario("Admin");
        usuario.setPassword("123");
        usuario.setCelular("963258741");
        String result = iUsuario.usuarioCreate(usuario);
        System.out.println("result " + result);
    }

}
