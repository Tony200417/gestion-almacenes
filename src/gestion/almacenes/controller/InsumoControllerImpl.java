/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.almacenes.controller;

import gestion.almacenes.datos.IInsumo;
import gestion.almacenes.datos.InsumoImpl;
import gestion.almacenes.dao.entities.Insumo;
import java.util.List;

/**
 *
 * @author cbaciliod
 */
public class InsumoControllerImpl implements IInsumoController {
    
    private final IInsumo iInsumo;
    
    public InsumoControllerImpl() {
        iInsumo = new InsumoImpl();
    }

    @Override
    public String insumoCreate(Insumo insumo) {
        return iInsumo.insumoCreate(insumo);
    }

    @Override
    public List<Insumo> insumoRead() {
        return iInsumo.insumoRead();
    }

    @Override
    public String insumoUpdate(Insumo insumo) {
        return iInsumo.insumoUpdate(insumo);
    }

    @Override
    public String insumoDelete(String idinsumo) {
        return iInsumo.insumoDelete(idinsumo);
    }

    @Override
    public Insumo insumoGet(String idinsumo) {
        return iInsumo.insumoGet(idinsumo);
    }

}
