/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.almacenes.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
            final String URL_DATABASE = "jdbc:ucanaccess://D:\\2023\\bacsystem\\infrastructure\\docker\\apps\\java\\desktop\\gestion-almacenes\\database\\database.accdb";
            //final String URL_DATABASE = "jdbc:ucanaccess://D:\\jose\\github\\java\\gestion-almacenes\\database\\database.accdb";
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
}
