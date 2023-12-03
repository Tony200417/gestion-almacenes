/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.almacenes.controller;

import gestion.almacenes.datos.IProveedor;
import gestion.almacenes.datos.ProveedorImpl;
import gestion.almacenes.dao.entities.Proveedor;
import java.util.*;

/**
 *
 * @author Bacilio
 */
public class ProveedorControllerImpl implements IProveedorController {

    private final IProveedor iProveedor;

    public ProveedorControllerImpl() {
        iProveedor = new ProveedorImpl();
    }

    @Override
    public String proveedorCreate(Proveedor proveedor) {    
        return iProveedor.proveedorCreate(proveedor);
    }

    @Override
    public List<Proveedor> proveedorRead() {
        return iProveedor.proveedorRead();
    }

    @Override
    public String proveedorUpdate(Proveedor proveedor) {       
        return iProveedor.proveedorUpdate(proveedor);
    }

    @Override
    public String proveedorDelete(String idruc) {
        return iProveedor.proveedorDelete(idruc);
    }

    @Override
    public Proveedor proveedorGet(String idruc) {
        return iProveedor.proveedorGet(idruc);
    }

}
