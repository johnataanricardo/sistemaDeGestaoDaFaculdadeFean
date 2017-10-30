package br.com.fean.si.poo3.service;

import br.com.fean.si.poo3.dao.UsuarioDAOImpl;
import br.com.fean.si.poo3.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Johnatan on 30/10/2017.
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

    //depois colocar DTO

    @Autowired
    private UsuarioDAOImpl dao;

    @Override
    public void add(Usuario usuario) {
        dao.add(usuario);
    }

    @Override
    public void remove(Usuario usuario) {
        dao.remove(usuario);
    }

    @Override
    public void update(Usuario usuario) {
        dao.update(usuario);
    }

    @Override
    public List<Usuario> usuarios() {
        return dao.usuarios();
    }

    @Override
    public Usuario findById(Integer id) {
        return null;
    }

}
