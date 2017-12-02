package br.com.fean.si.poo3.service.curso;

import br.com.fean.si.poo3.dto.curso.CursoDTO;
import br.com.fean.si.poo3.entity.curso.Curso;

import java.util.List;

public interface CursoService {

    public void add(Curso curso);

    public void remove(Long id);

    public void update(Curso curso);

    public List<CursoDTO> cursos();

    public CursoDTO findByIdDTO(Long id);

    public Curso findById(Long id);

}
