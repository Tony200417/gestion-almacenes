/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gestion.almacenes.datos;

import gestion.almacenes.dao.entities.Insumo;
import gestion.almacenes.dao.entities.InsumoSale;
import java.util.List;

/**
 *
 * @author cbaciliod
 */
public interface IInsumoSale {

    public String insumoSaleCreate(InsumoSale insumoSale);

    public List<InsumoSale> insumoSaleRead();

    public String insumoSaleUpdate(InsumoSale insumoSale);

    public String insumoSaleDelete(String idInsumoSale);

    public Insumo insumoSaleGet(String idInsumoSale);

    public String getMessage();
}
