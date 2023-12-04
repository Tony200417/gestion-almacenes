/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.almacenes.controller;

import gestion.almacenes.dao.entities.InsumoEntra;
import gestion.almacenes.datos.IInsumoEntra;
import gestion.almacenes.datos.InsumoEntraImpl;

/**
 *
 * @author cbaciliod
 */
public class InsumoEntraControllerImpl implements IInsumoEntraController {

    private final IInsumoEntra iInsumoEntra;

    public InsumoEntraControllerImpl() {
        iInsumoEntra = new InsumoEntraImpl();
    }

    @Override
    public String insumoEntraCreate(InsumoEntra insumoEntra) {
        return iInsumoEntra.insumoEntraCreate(insumoEntra);
    }

}
