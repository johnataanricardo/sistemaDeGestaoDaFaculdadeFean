package br.com.fean.si.poo3.dao.matricula;

import br.com.fean.si.poo3.entity.matricula.Matricula;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MatriculaDAOImpl implements MatriculaDAO {

    private static List<Matricula> matriculas;

    public MatriculaDAOImpl() {
        matriculas = new LinkedList<>();
    }

    @Override
    public void add(Matricula matricula) {
        long posicao = matriculas.size();
        matricula.setIdMatriculaAluno(posicao + 1);
        matriculas.add(matricula);
    }

    @Override
    public void remove(Long id) {
        matriculas.removeIf((materias) -> materias.getIdMatriculaAluno().equals(id));
    }

    @Override
    public void update(Matricula cadastro) {
        matriculas.stream().filter((matricula) -> matricula.getIdMatriculaAluno().equals(cadastro.getIdMatriculaAluno()))
                .forEach((matricula) -> {
                    matricula.setUsuario(cadastro.getUsuario());
                    matricula.setEndereco(cadastro.getEndereco());
                    matricula.setCurso(cadastro.getCurso());
                });
    }

    @Override
    public List<Matricula> matriculas() {
        return matriculas;
    }

    @Override
    public Matricula findById(Long id) {
        return matriculas.stream()
                .filter((matricula) -> matricula.getIdMatriculaAluno().equals(id))
                .collect(Collectors.toList())
                .get(0);
    }
}
