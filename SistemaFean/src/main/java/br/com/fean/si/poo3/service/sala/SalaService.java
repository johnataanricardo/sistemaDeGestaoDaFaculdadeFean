package br.com.fean.si.poo3.service.sala;

import br.com.fean.si.poo3.dto.sala.SalaMateriaDTO;


import java.util.List;

public interface SalaService {

    public void add(SalaMateriaDTO salaMateriaDTO);

    public void remove(Long id);

    public void update(SalaMateriaDTO salaMateriaDTO);

    public List<SalaMateriaDTO> salas();

    public SalaMateriaDTO findById(Long id);

}
