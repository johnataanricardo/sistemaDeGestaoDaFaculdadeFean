package br.com.fean.si.poo3.service;

import br.com.fean.si.poo3.dto.UsuarioDTO;
import br.com.fean.si.poo3.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    public void add(Usuario usuario);

    public void remove(Long id);

    public void update(Usuario usuario);

    public List<UsuarioDTO> usuarios();

//    public UsuarioDTO findById(Long id);
    public Usuario findById(Long id);
}
