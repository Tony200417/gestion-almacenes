/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.almacenes.service.impl;

import gestion.almacenes.dao.IUsuario;
import gestion.almacenes.dao.UsuarioImpl;
import gestion.almacenes.dao.entities.Usuario;
import gestion.almacenes.service.IUsuarioService;

/**
 *
 * @author cbaciliod
 */
public class UsuarioService implements IUsuarioService{

    private final IUsuario iUsuario;
    public UsuarioService(){
        iUsuario = new UsuarioImpl();
    }
    
    @Override
    public String usuarioCreate(Usuario usuario) {
       return iUsuario.usuarioCreate(usuario);
    }
    
}
