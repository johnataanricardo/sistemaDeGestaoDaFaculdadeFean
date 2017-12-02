package br.com.fean.si.poo3.entity.matricula;

import br.com.fean.si.poo3.entity.curso.Curso;
import br.com.fean.si.poo3.entity.endereco.Endereco;
import br.com.fean.si.poo3.entity.usuario.Usuario;

public class Matricula {

    private Long idMatriculaAluno;
    private Usuario usuario;
    private Endereco endereco;
    private Curso curso;

    public Matricula() {
    }

    public Matricula(Long idMatriculaAluno, Usuario usuario, Endereco endereco, Curso curso) {
        this.idMatriculaAluno = idMatriculaAluno;
        this.usuario = usuario;
        this.endereco = endereco;
        this.curso = curso;
    }

    public Long getIdMatriculaAluno() {
        return idMatriculaAluno;
    }

    public void setIdMatriculaAluno(Long idMatriculaAluno) {
        this.idMatriculaAluno = idMatriculaAluno;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
