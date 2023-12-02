/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.almacenes.dao;

import gestion.almacenes.dao.entities.Usuario;
import java.util.List;

/**
 *
 * @author Bacilio Transancciones a base de datos: INSERT UPDATE DELETE SELECT
 * CRUD [CREATE-READ-UPADTE-DELETE]
 *
 */
public interface IUsuario {

    /**
     * Metodo para registrar un usuario con todos sus paramateros
     * @param usuario
     * @return String
     */
    public String usuarioCreate(Usuario usuario);

    public List<Usuario> usuarioRead();

    public String usuarioUpdate(Usuario usuario);

    public String usuarioDelete(String idDni);

    public Usuario usuarioGet(String idDni);

    public String getMessage();
}
