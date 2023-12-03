/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gestion.almacenes.service;

import gestion.almacenes.dao.entities.Insumo;
import java.util.List;

/**
 *
 * @author cbaciliod
 */
public interface IInsumoService {

    public String insumoCreate(Insumo insumo);

    public List<Insumo> insumoRead();

    public String insumoUpdate(Insumo insumo);

    public String insumoDelete(String idinsumo);

    public Insumo insumoGet(String idinsumo);

}
