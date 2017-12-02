package br.com.fean.si.poo3.service.matricula;

import br.com.fean.si.poo3.dao.matricula.MatriculaDAO;
import br.com.fean.si.poo3.dto.matricula.MatriculaDTO;
import br.com.fean.si.poo3.entity.matricula.Matricula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class MatriculaServiceImpl implements MatriculaService {

    @Autowired
    private MatriculaDAO matriculaDAO;


    @Override
    public void add(Matricula matricula) {
        matriculaDAO.add(matricula);
    }

    @Override
    public void remove(Long id) {
        matriculaDAO.remove(id);
    }

    @Override
    public void update(Matricula matricula) {
        matriculaDAO.update(matricula);
    }

    @Override
    public List<MatriculaDTO> matriculas() {
        List<Matricula> matriculas = matriculaDAO.matriculas();
        List<MatriculaDTO> dtos = new LinkedList<>();
        matriculas.forEach(matricula -> {
            MatriculaDTO dto = new MatriculaDTO();
            dto.setIdMatriculaAluno(matricula.getIdMatriculaAluno());
            dto.setNome(matricula.getUsuario().getNome());
            dto.setSexo(matricula.getUsuario().getSexo());
            dto.setPerfil(matricula.getUsuario().getPerfil());
            dto.setDtNascimento(matricula.getUsuario().getDtNascimento());
            dto.setEmail(matricula.getUsuario().getEmail());
            dto.setTelefone(matricula.getUsuario().getTelefone());
            dto.setEstado(matricula.getEndereco().getEstado());
            dto.setCidade(matricula.getEndereco().getCidade());
            dto.setBairro(matricula.getEndereco().getBairro());
            dto.setRua(matricula.getEndereco().getRua());
            dto.setCep(matricula.getEndereco().getCep());
            dto.setComplemento(matricula.getEndereco().getComplemento());
            dto.setNumero(matricula.getEndereco().getNumero());
            dto.setIdCurso(matricula.getCurso().getId());
            dtos.add(dto);
        });
        return dtos;
    }

    @Override
    public MatriculaDTO findById(Long id) {
        Matricula matricula = matriculaDAO.findById(id);
        MatriculaDTO dto = new MatriculaDTO();
        dto.setIdMatriculaAluno(matricula.getIdMatriculaAluno());
        dto.setIdUsuario(matricula.getUsuario().getId());
        dto.setNome(matricula.getUsuario().getNome());
        dto.setSexo(matricula.getUsuario().getSexo());
        dto.setPerfil(matricula.getUsuario().getPerfil());
        dto.setDtNascimento(matricula.getUsuario().getDtNascimento());
        dto.setEmail(matricula.getUsuario().getEmail());
        dto.setTelefone(matricula.getUsuario().getTelefone());
        dto.setEstado(matricula.getEndereco().getEstado());
        dto.setCidade(matricula.getEndereco().getCidade());
        dto.setBairro(matricula.getEndereco().getBairro());
        dto.setRua(matricula.getEndereco().getRua());
        dto.setCep(matricula.getEndereco().getCep());
        dto.setComplemento(matricula.getEndereco().getComplemento());
        dto.setNumero(matricula.getEndereco().getNumero());
        dto.setIdCurso(matricula.getCurso().getId());
        return dto;
    }

}
