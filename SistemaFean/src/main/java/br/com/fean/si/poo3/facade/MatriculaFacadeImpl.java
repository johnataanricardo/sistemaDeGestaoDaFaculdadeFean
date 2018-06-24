package br.com.fean.si.poo3.facade;

import br.com.fean.si.poo3.dto.matricula.MatriculaDTO;
import br.com.fean.si.poo3.entity.curso.Curso;
import br.com.fean.si.poo3.entity.endereco.Endereco;
import br.com.fean.si.poo3.entity.matricula.Matricula;
import br.com.fean.si.poo3.entity.usuario.Usuario;
import br.com.fean.si.poo3.service.curso.CursoService;
import br.com.fean.si.poo3.service.matricula.MatriculaService;
import br.com.fean.si.poo3.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MatriculaFacadeImpl implements MatriculaFacade {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private CursoService cursoService;

    @Autowired
    private MatriculaService matriculaService;


    @Override
    public void realizarMatricula(MatriculaDTO matriculaDTO) {
        Matricula matricula = new Matricula();

        Usuario usuario = new Usuario();
        usuario.setNome(matriculaDTO.getNome());
        usuario.setDtNascimento(matriculaDTO.getDtNascimento());
        usuario.setUsuario(matriculaDTO.getUsuario());
        usuario.setSenha(matriculaDTO.getSenha());
        usuario.setEmail(matriculaDTO.getEmail());
        usuario.setSexo(matriculaDTO.getSexo());
        usuario.setPerfil(matriculaDTO.getPerfil());
        usuario.setTelefone(matriculaDTO.getTelefone());

        Endereco endereco = new Endereco();
        endereco.setEstado(matriculaDTO.getEstado());
        endereco.setCidade(matriculaDTO.getCidade());
        endereco.setBairro(matriculaDTO.getBairro());
        endereco.setRua(matriculaDTO.getRua());
        endereco.setCep(Long.valueOf(matriculaDTO.getCep()));
        endereco.setComplemento(matriculaDTO.getComplemento());
        endereco.setNumero(matriculaDTO.getNumero());

        Curso curso = cursoService.findById(matriculaDTO.getIdCurso());

        matricula.setUsuario(usuarioService.add(usuario));
        matricula.setEndereco(endereco);
        matricula.setCurso(curso);

        matriculaService.add(matricula);

    }

    @Override
    public void atualizarMatricula(MatriculaDTO matriculaDTO) {
        Matricula matricula = new Matricula();

        Usuario usuario = usuarioService.findById(matriculaDTO.getIdUsuario());

        Endereco endereco = new Endereco();
        endereco.setEstado(matriculaDTO.getEstado());
        endereco.setCidade(matriculaDTO.getCidade());
        endereco.setBairro(matriculaDTO.getBairro());
        endereco.setRua(matriculaDTO.getRua());
        endereco.setCep(matriculaDTO.getCep());
        endereco.setComplemento(matriculaDTO.getComplemento());
        endereco.setNumero(matriculaDTO.getNumero());

        Curso curso = cursoService.findById(matriculaDTO.getIdCurso());

        matricula.setIdMatriculaAluno(matriculaDTO.getIdMatriculaAluno());
        matricula.setUsuario(usuario);
        matricula.setEndereco(endereco);
        matricula.setCurso(curso);

        matriculaService.update(matricula);

    }


}
