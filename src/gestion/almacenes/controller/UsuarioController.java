/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.almacenes.controller;

import gestion.almacenes.datos.IUsuario;
import gestion.almacenes.datos.UsuarioImpl;
import gestion.almacenes.dao.entities.Usuario;
import java.util.Date;
import java.util.List;

/**
 *
 * @author cbaciliod
 */
public class UsuarioController implements IUsuarioController {

    private final IUsuario iUsuario;

    public UsuarioController() {
        iUsuario = new UsuarioImpl();
    }

    @Override
    public String usuarioCreate(Usuario usuario) {
        usuario.setFechaRegistro(new Date());
        return iUsuario.usuarioCreate(usuario);
    }

    @Override
    public List<Usuario> usuarioRead() {
        return iUsuario.usuarioRead();
    }

    @Override
    public String usuarioUpdate(Usuario usuario) {
        usuario.setFechaActualizar(new Date());
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
