package br.com.fean.si.poo3.dao.usuario;

import br.com.fean.si.poo3.entity.usuario.Usuario;

import java.util.List;

public interface UsuarioDAO {

    public void add(Usuario usuario);

    public void remove(Long id);

    public void update(Usuario usuario);

    public List<Usuario> usuarios();

    public Usuario findById(Long id);
}
