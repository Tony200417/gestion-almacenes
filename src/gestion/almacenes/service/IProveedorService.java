/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gestion.almacenes.service;

import gestion.almacenes.dao.entities.Proveedor;
import java.util.List;

/**
 *
 * @author cbaciliod
 */
public interface IProveedorService {

    public String proveedorCreate(Proveedor proveedor);

    public List<Proveedor> proveedorRead();

    public String proveedorUpdate(Proveedor proveedor);

    public String proveedorDelete(String idruc);

    public Proveedor proveedorGet(String idruc);
}
