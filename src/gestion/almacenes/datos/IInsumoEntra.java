/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gestion.almacenes.datos;

import gestion.almacenes.dao.entities.Insumo;
import gestion.almacenes.dao.entities.InsumoEntra;
import java.util.List;

/**
 *
 * @author cbaciliod
 */
public interface IInsumoEntra {

public String insumoEntraCreate(InsumoEntra insumoEntra);

    public List<InsumoEntra> insumoEntraRead();

    public String insumoEntraUpdate(InsumoEntra insumoEntra);

    public String insumoEntraDelete(String idInsumoEntra);

    public Insumo insumoEntraGet(String idInsumoEntra);
 public String getMessage();
}
