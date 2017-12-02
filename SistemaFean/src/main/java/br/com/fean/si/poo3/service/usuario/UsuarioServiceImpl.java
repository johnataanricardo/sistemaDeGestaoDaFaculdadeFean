package br.com.fean.si.poo3.service.usuario;

import br.com.fean.si.poo3.dao.usuario.UsuarioDAO;
import br.com.fean.si.poo3.dto.usuario.UsuarioDTO;
import br.com.fean.si.poo3.entity.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDAO dao;

    @Override
    public Usuario add(Usuario usuario) {
        dao.add(usuario);
        return usuario;
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public void update(Usuario usuario) {
        dao.update(usuario);
    }

    @Override
    public List<UsuarioDTO> usuarios() {
        List<Usuario> usuarios = dao.usuarios();
        List<UsuarioDTO> dtos = new LinkedList<>();
        usuarios.forEach(usuario -> {
            UsuarioDTO dto = new UsuarioDTO();
            dto.setId(usuario.getId());
            dto.setNome(usuario.getNome());
            dto.setDtNascimento(usuario.getDtNascimento());
            dto.setEmail(usuario.getEmail());
            dto.setTelefone(usuario.getTelefone());
            dto.setPerfil(usuario.getPerfil());
            dtos.add(dto);
        });
        return dtos;
    }

    @Override
//    public UsuarioDTO findById(Long id) {
    public Usuario findById(Long id) { // DTO tem que ser implementado, está ocasionando problema ao mostrar a data na edição
        // do usuário verificar problema e corrigir
        Usuario usuario = dao.findById(id);
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(usuario.getId());
        dto.setNome(usuario.getNome());
        dto.setDtNascimento(usuario.getDtNascimento());
        dto.setUsuario(usuario.getUsuario());
        dto.setSenha(usuario.getSenha());
        dto.setEmail(usuario.getEmail());
        dto.setSexo(usuario.getSexo());
        dto.setPerfil(usuario.getPerfil());
        dto.setTelefone(usuario.getTelefone());
//        return dto;
        return usuario;
    }

}
