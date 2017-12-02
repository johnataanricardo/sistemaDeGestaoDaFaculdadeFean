package br.com.fean.si.poo3.dao.curso;

import br.com.fean.si.poo3.entity.curso.Curso;

import java.util.List;

public interface CursoDAO {

    public void add(Curso curso);

    public void remove(Long id);

    public void update(Curso curso);

    public List<Curso> cursos();

    public Curso findById(Long id);

}
