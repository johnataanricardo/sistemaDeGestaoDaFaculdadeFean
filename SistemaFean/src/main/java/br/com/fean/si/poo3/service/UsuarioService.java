package br.com.fean.si.poo3.service;

import br.com.fean.si.poo3.entity.Usuario;

import java.util.List;

/**
 * Created by Johnatan on 30/10/2017.
 */
public interface UsuarioService {

    public void add(Usuario usuario);

    public void remove(Usuario id);

    public void update(Usuario usuario);

    public List<Usuario> usuarios();

    public Usuario findById(Integer id);

}
