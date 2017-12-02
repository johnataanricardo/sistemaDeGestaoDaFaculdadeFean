package br.com.fean.si.poo3.service.curso;

import br.com.fean.si.poo3.dao.curso.CursoDAO;
import br.com.fean.si.poo3.dto.curso.CursoDTO;
import br.com.fean.si.poo3.entity.curso.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoDAO cursoDAO;

    @Override
    public void add(Curso curso) {
        cursoDAO.add(curso);
    }

    @Override
    public void remove(Long id) {
        cursoDAO.remove(id);
    }

    @Override
    public void update(Curso curso) {
        cursoDAO.update(curso);
    }

    @Override
    public List<CursoDTO> cursos() {
        List<Curso> cursos = cursoDAO.cursos();
        List<CursoDTO> dtos = new LinkedList<>();
        cursos.forEach(curso -> {
            CursoDTO dto = new CursoDTO();
            dto.setId(curso.getId());
            dto.setNome(curso.getNome());
            dto.setDescricao(curso.getDescricao());
            dto.setAreaDeAtuacao(curso.getAreaDeAtuacao());
            dto.setTempoDeDuracao(curso.getTempoDeDuracao());
            dto.setEstagioSupervisionado(curso.getEstagioSupervisionado());
            dto.setQuantidadeDeCreditos(curso.getQuantidadeDeCreditos());
            dtos.add(dto);
        });
        return dtos;
    }

    @Override
    public CursoDTO findByIdDTO(Long id) {
        Curso curso = cursoDAO.findById(id);
        CursoDTO dto = new CursoDTO();
        dto.setId(curso.getId());
        dto.setNome(curso.getNome());
        dto.setDescricao(curso.getDescricao());
        dto.setAreaDeAtuacao(curso.getAreaDeAtuacao());
        dto.setTempoDeDuracao(curso.getTempoDeDuracao());
        dto.setEstagioSupervisionado(curso.getEstagioSupervisionado());
        dto.setQuantidadeDeCreditos(curso.getQuantidadeDeCreditos());
        return dto;
    }

    @Override
    public Curso findById(Long id) {
        Curso curso = cursoDAO.findById(id);
        return curso;
    }

}