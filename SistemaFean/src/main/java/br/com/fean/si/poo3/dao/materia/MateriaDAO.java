package br.com.fean.si.poo3.dao.materia;

import br.com.fean.si.poo3.entity.materia.Materia;

import java.util.List;

public interface MateriaDAO {

    public void add(Materia materia);

    public void remove(Long id);

    public void update(Materia materia);

    public List<Materia> materias();

    public Materia findById(Long id);

}
