/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gestion.almacenes.service;

import gestion.almacenes.dao.entities.Usuario;
import java.util.List;

/**
 *
 * @author cbaciliod
 */
public interface IUsuarioService {
    
    public String usuarioCreate(Usuario usuario);
    public List<Usuario> usuarioRead();
}
