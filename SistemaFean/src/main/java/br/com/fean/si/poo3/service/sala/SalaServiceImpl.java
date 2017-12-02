package br.com.fean.si.poo3.service.sala;

import br.com.fean.si.poo3.dao.sala.SalaDAOImpl;

import br.com.fean.si.poo3.dto.sala.SalaMateriaDTO;
import br.com.fean.si.poo3.entity.materia.Materia;
import br.com.fean.si.poo3.entity.sala.Sala;
import br.com.fean.si.poo3.service.materia.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class SalaServiceImpl implements SalaService{

    @Autowired
    private SalaDAOImpl salaDao;

    @Autowired
    private MateriaService materiaService;

    @Override
    public void add(SalaMateriaDTO salaMateriaDTO) {
        Sala sala = DTOToEntity(salaMateriaDTO);
        salaDao.add(sala);
    }

    @Override
    public void remove(Long id) {
        salaDao.remove(id);
    }

    @Override
    public void update(SalaMateriaDTO salaMateriaDTO) {
        Sala sala = DTOToEntity(salaMateriaDTO);
        salaDao.update(sala);
    }

    @Override
    public List<SalaMateriaDTO> salas() {
        List<Sala> salas = salaDao.salas();
        List<SalaMateriaDTO> salaMateriaDTOS = new LinkedList<>();
        salas.forEach( sala -> {
            SalaMateriaDTO salaMateriaDTO = entityToDTO(sala);
            salaMateriaDTOS.add(salaMateriaDTO);
        });
        return salaMateriaDTOS;
    }

    @Override
    public SalaMateriaDTO findById(Long id) {
        return entityToDTO(salaDao.findById(id));
    }

    private Sala DTOToEntity(SalaMateriaDTO salaMateriaDTO) {
        Sala sala = new Sala();
        if (salaMateriaDTO.getIdSala() != null) {
            sala.setIdSala(salaMateriaDTO.getIdSala());
            sala.setNumSala(salaMateriaDTO.getNumSala());
        }
        sala.setCategoria(salaMateriaDTO.getCategoria());
        sala.setQntCadeira(salaMateriaDTO.getQntCadeira());
        sala.setQntTomada(salaMateriaDTO.getQntTomada());
        sala.setQntArCondicionado(salaMateriaDTO.getQntArCondicionado());
        sala.setQntJanela(salaMateriaDTO.getQntJanela());
        sala.setDtCriacao(salaMateriaDTO.getDtCriacao());
        sala.setDtAlocado(salaMateriaDTO.getDtAlocado());
        Map<String, Materia> materias = new HashMap<String, Materia>();
        materias.put("segunda", salaMateriaDTO.getSegunda() > 0 ? materiaService.findById(salaMateriaDTO.getSegunda()) : null);
        materias.put("terca", salaMateriaDTO.getTerca() > 0 ? materiaService.findById(salaMateriaDTO.getTerca()) : null);
        materias.put("quarta", salaMateriaDTO.getQuarta() > 0 ? materiaService.findById(salaMateriaDTO.getQuarta()) : null);
        materias.put("quinta", salaMateriaDTO.getQuinta() > 0 ? materiaService.findById(salaMateriaDTO.getQuinta()) : null);
        materias.put("sexta", salaMateriaDTO.getSexta() > 0 ? materiaService.findById(salaMateriaDTO.getSexta()) : null);
        sala.setMaterias(materias);
        return sala;
    }

    public SalaMateriaDTO entityToDTO(Sala sala) {
        SalaMateriaDTO salaMateriaDTO = new SalaMateriaDTO();
        salaMateriaDTO.setIdSala(sala.getIdSala());
        salaMateriaDTO.setNumSala(sala.getNumSala());
        salaMateriaDTO.setCategoria(sala.getCategoria());
        salaMateriaDTO.setQntCadeira(sala.getQntCadeira());
        salaMateriaDTO.setQntTomada(sala.getQntTomada());
        salaMateriaDTO.setQntArCondicionado(sala.getQntArCondicionado());
        salaMateriaDTO.setQntJanela(sala.getQntJanela());
        salaMateriaDTO.setDtCriacao(sala.getDtCriacao());
        salaMateriaDTO.setDtAlocado(sala.getDtAlocado());
        salaMateriaDTO.setSegunda(sala.getMaterias().get("segunda") != null ? sala.getMaterias().get("segunda").getId() : 0);
        salaMateriaDTO.setTerca(sala.getMaterias().get("terca") != null ? sala.getMaterias().get("terca").getId() : 0);
        salaMateriaDTO.setQuarta(sala.getMaterias().get("quarta") != null ? sala.getMaterias().get("quarta").getId() : 0);
        salaMateriaDTO.setQuinta(sala.getMaterias().get("quinta") != null ? sala.getMaterias().get("quinta").getId() : 0);
        salaMateriaDTO.setSexta(sala.getMaterias().get("sexta") != null ? sala.getMaterias().get("sexta").getId() : 0);
        return salaMateriaDTO;
    }

}
