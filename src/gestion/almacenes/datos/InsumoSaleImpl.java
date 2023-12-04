/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.almacenes.datos;

import gestion.almacenes.dao.entities.Insumo;
import gestion.almacenes.dao.entities.InsumoEntra;
import gestion.almacenes.dao.entities.InsumoSale;
import gestion.almacenes.db.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Bacilio
 */
public class InsumoSaleImpl implements IInsumoSale {

    private final Database database;
    private String message;

    public InsumoSaleImpl() {
        database = new Database();
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String insumoSaleCreate(InsumoSale insumoSale) {
        StringBuilder QUERY_INSERT = new StringBuilder();
        QUERY_INSERT.append("INSERT INTO INSUMO_SALIENTE ");
        QUERY_INSERT.append("(ID_INSUMO, ID_SALE, CANTIDAD, FECHA_REGISTRO) ");
        QUERY_INSERT.append("VALUES (?,?,?,sysdate());");

        try (Connection conn = database.getConnection(); PreparedStatement st = conn.prepareStatement(QUERY_INSERT.toString());) {
            st.setString(1, insumoSale.getInsumoId());
            st.setString(2, insumoSale.getId());
            st.setInt(3, insumoSale.getCantidad());
            int rows = st.executeUpdate();

            if (rows == 0) {
                message = "0 filas afectadas";
            } else {
                message = "Insumo saliente registrado";
            }
        } catch (Exception e) {
            message = e.getMessage();
        }

        return message;
    }

    @Override
    public List<InsumoSale> insumoSaleRead() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String insumoSaleUpdate(InsumoSale insumoSale) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String insumoSaleDelete(String idInsumoSale) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Insumo insumoSaleGet(String idInsumoSale) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
