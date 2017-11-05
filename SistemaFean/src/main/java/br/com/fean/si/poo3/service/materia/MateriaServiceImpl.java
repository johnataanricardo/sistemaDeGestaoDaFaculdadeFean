package br.com.fean.si.poo3.service.materia;

import br.com.fean.si.poo3.dao.materia.MateriaDAO;
import br.com.fean.si.poo3.dto.materia.MateriaDTO;
import br.com.fean.si.poo3.entity.materia.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class MateriaServiceImpl implements MateriaService {

    @Autowired
    private MateriaDAO materiaDAO;


    @Override
    public void add(Materia materia) {
        materiaDAO.add(materia);
    }

    @Override
    public void remove(Long id) {
        materiaDAO.remove(id);
    }

    @Override
    public void update(Materia materia) {
        materiaDAO.update(materia);
    }

    @Override
    public List<MateriaDTO> materias() {
        List<Materia> materias = materiaDAO.materias();
        List<MateriaDTO> dtos = new LinkedList<>();
        materias.forEach(materia -> {
            MateriaDTO dto = new MateriaDTO();
            dto.setId(materia.getId());
            dto.setNome(materia.getNome());
            dto.setDescricao(materia.getDescricao());
            dto.setCategoria(materia.getCategoria());
            dto.setCargaHoraria(materia.getCargaHoraria());
            dtos.add(dto);
        });
        return dtos;
    }

    @Override
    public MateriaDTO findById(Long id) {
        Materia materia = materiaDAO.findById(id);
        MateriaDTO dto = new MateriaDTO();
        dto.setId(materia.getId());
        dto.setNome(materia.getNome());
        dto.setDescricao(materia.getDescricao());
        dto.setCategoria(materia.getCategoria());
        dto.setCargaHoraria(materia.getCargaHoraria());
        return dto;
    }

}
