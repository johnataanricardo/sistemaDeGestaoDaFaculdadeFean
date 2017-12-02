package br.com.fean.si.poo3.service.matricula;

import br.com.fean.si.poo3.dto.matricula.MatriculaDTO;
import br.com.fean.si.poo3.entity.matricula.Matricula;

import java.util.List;

public interface MatriculaService {

    public void add(Matricula matricula);

    public void remove(Long id);

    public void update(Matricula matricula);

    public List<MatriculaDTO> matriculas();

    public MatriculaDTO findById(Long id);
}
