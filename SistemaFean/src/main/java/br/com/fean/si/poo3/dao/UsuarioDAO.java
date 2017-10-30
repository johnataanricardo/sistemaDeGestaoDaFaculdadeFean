package br.com.fean.si.poo3.dao;

import br.com.fean.si.poo3.entity.Usuario;

import java.util.List;

/**
 * Created by Johnatan on 30/10/2017.
 */
public interface UsuarioDAO {

    public void add(Usuario usuario);

    public void remove(Usuario usuario);

    public void update(Usuario usuario);

    public List<Usuario> usuarios();

    public Usuario findById(Integer id);
}
