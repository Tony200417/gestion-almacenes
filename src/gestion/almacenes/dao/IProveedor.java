/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.almacenes.dao;

import gestion.almacenes.dao.entities.Proveedor;
import java.util.List;

/**
 *
 * @author Bacilio
 */
public interface IProveedor {

    public String proveedorCreate(Proveedor razonSocial);

    public List<Proveedor> proveedorRead();

    public String proveedorUpdate(Proveedor razonSocial);

    public String proveedorDelete(String idruc);

    public Proveedor proveedorGet(String idruc);

    public String getMessage();
}
