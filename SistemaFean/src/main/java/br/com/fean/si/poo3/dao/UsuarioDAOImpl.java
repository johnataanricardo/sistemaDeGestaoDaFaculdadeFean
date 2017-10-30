package br.com.fean.si.poo3.dao;

import br.com.fean.si.poo3.entity.Perfil;
import br.com.fean.si.poo3.entity.TipoSexo;
import br.com.fean.si.poo3.entity.Usuario;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Johnatan on 30/10/2017.
 */
@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

    private static List<Usuario> user;

    public UsuarioDAOImpl() {
        criarListaUsuario();
    }

    private List<Usuario> criarListaUsuario(){
        if(user == null) {
            user = new LinkedList<>();
            user.add(new Usuario(1L, "Jovem do Java", LocalDate.of(1992, 5, 10), "jovem", "java","java@java.com", TipoSexo.MASCULINO, Perfil.ALUNO, "(48)99999-9999"));
        }
        return user;
    }

    @Override
    public void add(Usuario usuario) {

    }

    @Override
    public void remove(Usuario usuario) {

    }

    @Override
    public void update(Usuario usuario) {

    }

    @Override
    public List<Usuario> usuarios() {
        return null;
    }

    @Override
    public Usuario findById(Integer id) {
        return null;
    }

}
