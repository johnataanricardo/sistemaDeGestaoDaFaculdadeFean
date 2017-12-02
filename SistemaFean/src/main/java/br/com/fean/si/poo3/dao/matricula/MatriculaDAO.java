package br.com.fean.si.poo3.dao.matricula;

import br.com.fean.si.poo3.entity.matricula.Matricula;

import java.util.List;

public interface MatriculaDAO {

    public void add(Matricula matricula);

    public void remove(Long id);

    public void update(Matricula matricula);

    public List<Matricula> matriculas();

    public Matricula findById(Long id);

}
