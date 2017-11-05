package br.com.fean.si.poo3.service.materia;

import br.com.fean.si.poo3.dto.materia.MateriaDTO;
import br.com.fean.si.poo3.dto.usuario.UsuarioDTO;
import br.com.fean.si.poo3.entity.materia.Materia;
import br.com.fean.si.poo3.entity.usuario.Usuario;

import java.util.List;

public interface MateriaService {

    public void add(Materia materia);

    public void remove(Long id);

    public void update(Materia materia);

    public List<MateriaDTO> materias();

    public MateriaDTO findById(Long id);
//    public Materia findById(Long id);

}
