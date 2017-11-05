package br.com.fean.si.poo3.dao.materia;

import br.com.fean.si.poo3.entity.materia.Categoria;
import br.com.fean.si.poo3.entity.materia.Materia;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MateriaDAOImpl implements MateriaDAO {

    private static List<Materia> materias;

    public MateriaDAOImpl() {
        criarListaMateria();
    }

    private List<Materia> criarListaMateria() {
        if (materias == null) {
            materias = new LinkedList<>();
            materias.add(new Materia(1L, "Algoritimos", "Algoritmos.", Categoria.OBRIGATORIA, 72));
            materias.add(new Materia(2L, "POOI", "POOI.", Categoria.OBRIGATORIA, 72));
            materias.add(new Materia(3L, "POOII", "POOII.", Categoria.OBRIGATORIA, 72));
            materias.add(new Materia(4L, "POOIII", "POOIII.", Categoria.OBRIGATORIA, 72));
            materias.add(new Materia(5L, "Estrutura de Dados", "Estrutura de Dados.", Categoria.OBRIGATORIA, 72));
            materias.add(new Materia(6L, "Engenharia de Software I", "Engenharia de Software I", Categoria.OBRIGATORIA, 72));
            materias.add(new Materia(7L, "Engenharia de Software II", "Engenharia de Software II", Categoria.OBRIGATORIA, 72));
            materias.add(new Materia(8L, "Modelagem de Processos", "Modelagem de Processos.", Categoria.OBRIGATORIA, 72));
            materias.add(new Materia(9L, "Contabilidade", "Contabilidade", Categoria.OBRIGATORIA, 72));
            materias.add(new Materia(10L, "Libras", "Libras.", Categoria.OPTATIVA, 72));
            materias.add(new Materia(11L, "Fundamentos de Sistemas I", "Fundamentos de Sistemas I.", Categoria.OBRIGATORIA, 72));
            materias.add(new Materia(12L, "Sistemas Operacionais", "Sistemas Operacionais.", Categoria.OBRIGATORIA, 72));
        }
        return materias;
    }

    @Override
    public void add(Materia materia) {
        long posicao = materias.size();
        materia.setId(posicao + 1);
        materias.add(materia);
    }

    @Override
    public void remove(Long id) {
        materias.removeIf((materias) -> materias.getId().equals(id));
    }

    @Override
    public void update(Materia materia) {
        materias.stream().filter((disciplina) -> disciplina.getId().equals(materia.getId()))
                .forEach((disciplina) -> {
                    disciplina.setNome(materia.getNome());
                    disciplina.setDescricao(materia.getDescricao());
                    disciplina.setCategoria(materia.getCategoria());
                    disciplina.setCargaHoraria(materia.getCargaHoraria());
                });
    }

    @Override
    public List<Materia> materias() {
        return materias;
    }

    @Override
    public Materia findById(Long id) {
        return materias.stream()
                .filter((materia) -> materia.getId().equals(id))
                .collect(Collectors.toList())
                .get(0);
    }

}
