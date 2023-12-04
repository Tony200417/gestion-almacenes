/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.almacenes.datos;

import gestion.almacenes.dao.entities.Insumo;
import gestion.almacenes.dao.entities.InsumoEntra;
import gestion.almacenes.db.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Bacilio
 */
public class InsumoEntraImpl implements IInsumoEntra {

    private final Database database;
    private String message;

    public InsumoEntraImpl() {
        database = new Database();
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String insumoEntraCreate(InsumoEntra insumoEntra) {
        StringBuilder QUERY_INSERT = new StringBuilder();
        QUERY_INSERT.append("INSERT INTO INSUMO_ENTRANTE ");
        QUERY_INSERT.append("(ID_ENTRA, CANTIDAD, ID_INSUMO,FECHA_REGISTRO) ");
        QUERY_INSERT.append("VALUES (?,?,?,sysdate());");

        try (Connection conn = database.getConnection(); PreparedStatement st = conn.prepareStatement(QUERY_INSERT.toString());) {
            st.setString(1, insumoEntra.getId());
            st.setInt(2, insumoEntra.getCantidad());
            st.setString(3, insumoEntra.getInsumoId());
            int rows = st.executeUpdate();

            if (rows == 0) {
                message = "0 filas afectadas";
            } else {
                message = "Insumo entrante registrado";
            }
        } catch (Exception e) {
            message = e.getMessage();
        }

        return message;
    }

    @Override
    public List<InsumoEntra> insumoEntraRead() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String insumoEntraUpdate(InsumoEntra insumoEntra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String insumoEntraDelete(String idInsumoEntra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Insumo insumoEntraGet(String idInsumoEntra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
