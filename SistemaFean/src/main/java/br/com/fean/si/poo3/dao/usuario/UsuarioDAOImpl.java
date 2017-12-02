package br.com.fean.si.poo3.dao.usuario;

import br.com.fean.si.poo3.entity.usuario.Perfil;
import br.com.fean.si.poo3.entity.usuario.TipoSexo;
import br.com.fean.si.poo3.entity.usuario.Usuario;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

    private static List<Usuario> user;

    public UsuarioDAOImpl() {
        criarListaUsuario();
    }

    private List<Usuario> criarListaUsuario() {
        if (user == null) {
            user = new LinkedList<>();
            user.add(new Usuario(1L, "Jovem do Java", LocalDate.of(1992, 5, 10), "java", "java123", "java@java.com", TipoSexo.MASCULINO, Perfil.ALUNO, "(48) 99999-9999"));
            user.add(new Usuario(2L, "Jovem do Python", LocalDate.of(1993, 6, 18), "python", "python123", "python@python.com", TipoSexo.MASCULINO, Perfil.PROFESSOR, "(48) 99999-9999"));
            user.add(new Usuario(3L, "Jovem do PHP", LocalDate.of(1994, 7, 5), "php", "php123", "php@php.com", TipoSexo.FEMININO, Perfil.GESTOR, "(48) 99999-9999"));
            user.add(new Usuario(4L, "Jovem do Ruby", LocalDate.of(1994, 7, 5), "ruby", "ruby123", "ruby@ruby.com", TipoSexo.FEMININO, Perfil.GESTOR, "(48) 99999-9999"));
            user.add(new Usuario(5L, "Jovem do Vue", LocalDate.of(1994, 7, 5), "vue", "vue123", "vue@vue.com", TipoSexo.FEMININO, Perfil.GESTOR, "(48) 99999-9999"));
            user.add(new Usuario(6L, "Jovem do React", LocalDate.of(1994, 7, 5), "react", "react123", "react@react.com", TipoSexo.FEMININO, Perfil.GESTOR, "(48) 99999-9999"));
            user.add(new Usuario(7L, "Jovem do JavaScript", LocalDate.of(1994, 7, 5), "javascript", "javascript123", "javascript@javascript.com", TipoSexo.FEMININO, Perfil.GESTOR, "(48) 99999-9999"));
            user.add(new Usuario(8L, "Jovem do C++", LocalDate.of(1994, 7, 5), "cmaismais", "cmaismais123", "cmaismais@cmaismais.com", TipoSexo.FEMININO, Perfil.GESTOR, "(48) 99999-9999"));
            user.add(new Usuario(9L, "Jovem do C#", LocalDate.of(1994, 7, 5), "ccharpe", "ccharpe123", "ccharpe@ccharpe.com", TipoSexo.FEMININO, Perfil.GESTOR, "(48) 99999-9999"));
            user.add(new Usuario(10L, "Jovem do Node.js", LocalDate.of(1994, 7, 5), "nodejs", "nodejs123", "nodejs@nodejs.com", TipoSexo.FEMININO, Perfil.GESTOR, "(48) 99999-9999"));
            user.add(new Usuario(11L, "Jovem do HTML", LocalDate.of(1994, 7, 5), "html", "html123", "html@html.com", TipoSexo.FEMININO, Perfil.GESTOR, "(48) 99999-9999"));
            user.add(new Usuario(11L, "Jovem do CSS", LocalDate.of(1994, 7, 5), "css", "css123", "css@css.com", TipoSexo.FEMININO, Perfil.GESTOR, "(48) 99999-9999"));
        }
        return user;
    }

    @Override
    public Usuario add(Usuario usuario) {
        long posicao = user.size();
        usuario.setId(posicao + 1);
        user.add(usuario);
        return usuario;
    }

    @Override
    public void remove(Long id) {
        user.removeIf((user) -> user.getId().equals(id));
    }

    @Override
    public void update(Usuario usuario) {
        user.stream().filter((user) -> user.getId().equals(usuario.getId()))
                .forEach((user) -> {
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
                .filter((user) -> user.getId().equals(id))
                .collect(Collectors.toList())
                .get(0);
    }
}
