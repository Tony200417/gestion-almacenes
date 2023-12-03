/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gestion.almacenes.dao;

import gestion.almacenes.dao.entities.Insumo;
import java.util.List;

/**
 *
 * @author cbaciliod
 */
public interface IInsumo {

    public String insumoCreate(Insumo usuario);

    public List<Insumo> insumoRead();

    public String insumoUpdate(Insumo usuario);

    public String insumoDelete(String idDni);

    public Insumo insumoGet(String idDni);

    public String getMessage();

}
