package br.com.fean.si.poo3.service.usuario;

import br.com.fean.si.poo3.dto.usuario.UsuarioDTO;
import br.com.fean.si.poo3.entity.usuario.Usuario;

import java.util.List;

public interface UsuarioService {

    public Usuario add(Usuario usuario);

    public void remove(Long id);

    public void update(Usuario usuario);

    public List<UsuarioDTO> usuarios();

//    public UsuarioDTO findById(Long id);
    public Usuario findById(Long id);
}
