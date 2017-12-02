package br.com.fean.si.poo3.dao.curso;

import br.com.fean.si.poo3.entity.curso.Curso;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CursoDAOImpl implements CursoDAO {

    private static List<Curso> cursos;

    public CursoDAOImpl() {
        criarListaCurso();
    }

    private List<Curso> criarListaCurso() {
        if (cursos == null) {
            cursos = new LinkedList<>();
            cursos.add(new Curso(1L, "Sistemas de Informação", "Sistemas de Informação", "Tecnologia", 8, Boolean.TRUE, 72));
            cursos.add(new Curso(2L, "Contabilidade", "Contabilidade", "Administração de Empresas", 8, Boolean.TRUE, 72));
            cursos.add(new Curso(3L, "Administração", "Administração", "Administração de Empresas", 8, Boolean.TRUE, 72));
            cursos.add(new Curso(4L, "Design", "Design", "Desenho", 8, Boolean.TRUE, 72));
        }
        return cursos;
    }

    @Override
    public void add(Curso curso) {
        long posicao = cursos.size();
        curso.setId(posicao + 1);
        cursos.add(curso);
    }

    @Override
    public void remove(Long id) {
        cursos.removeIf((cursos) -> cursos.getId().equals(id));
    }

    @Override
    public void update(Curso curso) {
        cursos.stream().filter((course) -> course.getId().equals(curso.getId()))
                .forEach((courses) -> {
                    courses.setNome(curso.getNome());
                    courses.setDescricao(curso.getDescricao());
                    courses.setAreaDeAtuacao(curso.getAreaDeAtuacao());
                    courses.setTempoDeDuracao(curso.getTempoDeDuracao());
                    courses.setEstagioSupervisionado(curso.getEstagioSupervisionado());
                    courses.setQuantidadeDeCreditos(curso.getQuantidadeDeCreditos());
                });
    }

    @Override
    public List<Curso> cursos() {
        return cursos;
    }

    @Override
    public Curso findById(Long id) {
        return cursos.stream()
                .filter((curso) -> curso.getId().equals(id))
                .collect(Collectors.toList())
                .get(0);
    }
}
