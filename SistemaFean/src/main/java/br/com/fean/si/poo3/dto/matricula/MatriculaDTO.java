package br.com.fean.si.poo3.dto.matricula;

import br.com.fean.si.poo3.entity.usuario.Perfil;
import br.com.fean.si.poo3.entity.usuario.TipoSexo;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class MatriculaDTO {

    private Long idMatriculaAluno;
    private Long idUsuario;
    private String nome;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dtNascimento;
    private String usuario;
    private String senha;
    private String email;
    private TipoSexo sexo;
    private Perfil perfil;
    private String telefone;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private Long cep;
    private String complemento;
    private Integer numero;
    private Long idCurso;

    public MatriculaDTO () {
    }

    public MatriculaDTO(Long idMatriculaAluno, Long idUsuario, String nome, LocalDate dtNascimento, String usuario, String senha,
                        String email, TipoSexo sexo, Perfil perfil, String telefone, String estado, String cidade, String bairro,
                        String rua, Long cep, String complemento, Integer numero, Long idCurso) {
        this.idMatriculaAluno = idMatriculaAluno;
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
        this.sexo = sexo;
        this.perfil = perfil;
        this.telefone = telefone;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
        this.complemento = complemento;
        this.numero = numero;
        this.idCurso = idCurso;
    }

    public Long getIdMatriculaAluno() {
        return idMatriculaAluno;
    }

    public void setIdMatriculaAluno(Long idMatriculaAluno) {
        this.idMatriculaAluno = idMatriculaAluno;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoSexo getSexo() {
        return sexo;
    }

    public void setSexo(TipoSexo sexo) {
        this.sexo = sexo;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

}
