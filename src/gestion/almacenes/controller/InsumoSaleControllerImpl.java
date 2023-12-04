/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.almacenes.controller;

import gestion.almacenes.dao.entities.InsumoSale;
import gestion.almacenes.datos.IInsumoSale;
import gestion.almacenes.datos.InsumoSaleImpl;

/**
 *
 * @author cbaciliod
 */
public class InsumoSaleControllerImpl implements IInsumoSaleController {

    private final IInsumoSale iInsumoSale;

    public InsumoSaleControllerImpl() {
        iInsumoSale = new InsumoSaleImpl();
    }

  

    @Override
    public String insumoSaleCreate(InsumoSale insumo) {
        return iInsumoSale.insumoSaleCreate(insumo);
    }

}
