package br.com.fean.si.poo3.dao;

import br.com.fean.si.poo3.entity.Perfil;
import br.com.fean.si.poo3.entity.TipoSexo;
import br.com.fean.si.poo3.entity.Usuario;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

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
            user.add(new Usuario(1L, "Jovem do Java", LocalDate.of(1992, 5, 10), "java", "java123","java@java.com", TipoSexo.MASCULINO, Perfil.ALUNO, "(48)99999-9999"));
            user.add(new Usuario(2L, "Jovem do Python", LocalDate.of(1993, 6, 18), "python", "python123","python@python.com", TipoSexo.MASCULINO, Perfil.PROFESSOR, "(48)99999-9999"));
            user.add(new Usuario(3L, "Jovem do C", LocalDate.of(1994, 7, 5), "jovemc", "jovemc123","python@python.com", TipoSexo.FEMININO, Perfil.GESTOR, "(48)99999-9999"));
        }
        return user;
    }

    @Override
    public void add(Usuario usuario) {
        long posicao = user.size();
        usuario.setId(posicao + 1);
        System.out.println(usuario.getId());
        user.add(usuario);
    }

    @Override
    public void remove(Long id) {
        user.removeIf( (user) -> user.getId().equals(id));
    }

    @Override
    public void update(Usuario usuario) {
        user.stream().filter( (user)  -> user.getId().equals(usuario.getId()))
                     .forEach( (user) ->{
                                      user.setNome(usuario.getNome());
                                      user.setDtNascimento(usuario.getDtNascimento());
                                      user.setUsuario(usuario.getUsuario()); // Tirar Depois, não pode ser mudado o nome de usuario
                                      user.setSenha(usuario.getSenha());
                                      user.setEmail(usuario.getEmail());
                                      user.setSexo(usuario.getSexo());
                                      user.setPerfil(usuario.getPerfil());
                                      user.setTelefone(usuario.getTelefone());
                     });
    }

    @Override
    public List<Usuario> usuarios() {
        return user;
    }

    @Override
    public Usuario findById(Long id) {
        return user.stream()
                            .filter( (user) -> user.getId().equals(id))
                            .collect(Collectors.toList())
                            .get(0);
    }
}
