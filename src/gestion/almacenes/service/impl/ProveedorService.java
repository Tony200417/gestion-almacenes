/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.almacenes.service.impl;

import gestion.almacenes.dao.IProveedor;
import gestion.almacenes.dao.ProveedorImpl;
import gestion.almacenes.dao.entities.Proveedor;
import gestion.almacenes.service.IProveedorService;
import java.util.*;

/**
 *
 * @author Bacilio
 */
public class ProveedorService implements IProveedorService {

    private final IProveedor iProveedor;

    public ProveedorService() {
        iProveedor = new ProveedorImpl();
    }

    @Override
    public String proveedorCreate(Proveedor proveedor) {
        proveedor.setFechaReg(new Date());
        return iProveedor.proveedorCreate(proveedor);
    }

    @Override
    public List<Proveedor> proveedorRead() {
        return iProveedor.proveedorRead();
    }

    @Override
    public String proveedorUpdate(Proveedor proveedor) {
        proveedor.setFechaAct(new Date());
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
