package br.com.fean.si.poo3.dao.sala;

import br.com.fean.si.poo3.entity.sala.Sala;

import java.util.List;

public interface SalaDAO {

    public void add(Sala sala);

    public void remove(Long id);

    public void update(Sala sala);

    public List<Sala> salas();

    public Sala findById(Long id);

}
