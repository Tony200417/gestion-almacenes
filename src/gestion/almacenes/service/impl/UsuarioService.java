/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.almacenes.service.impl;

import gestion.almacenes.dao.IUsuario;
import gestion.almacenes.dao.UsuarioImpl;
import gestion.almacenes.dao.entities.Usuario;
import gestion.almacenes.service.IUsuarioService;
import java.util.List;

/**
 *
 * @author cbaciliod
 */
public class UsuarioService implements IUsuarioService {

    private final IUsuario iUsuario;

    public UsuarioService() {
        iUsuario = new UsuarioImpl();
    }

    @Override
    public String usuarioCreate(Usuario usuario) {
        return iUsuario.usuarioCreate(usuario);
    }

    @Override
    public List<Usuario> usuarioRead() {
        return iUsuario.usuarioRead();
    }

    @Override
    public String usuarioUpdate(Usuario usuario) {
        return iUsuario.usuarioUpdate(usuario);
    }

    @Override
    public String usuarioDelete(String dni) {
        return iUsuario.usuarioDelete(dni);
    }

    @Override
    public Usuario usuarioGet(String dni) {
        return iUsuario.usuarioGet(dni);
    }

}
