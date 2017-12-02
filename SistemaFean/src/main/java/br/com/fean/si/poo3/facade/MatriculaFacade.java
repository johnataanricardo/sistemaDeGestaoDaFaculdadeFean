package br.com.fean.si.poo3.facade;

import br.com.fean.si.poo3.dto.matricula.MatriculaDTO;

public interface MatriculaFacade {

    public void realizarMatricula(MatriculaDTO matriculaDTO);

    public void atualizarMatricula(MatriculaDTO matriculaDTO);

}
