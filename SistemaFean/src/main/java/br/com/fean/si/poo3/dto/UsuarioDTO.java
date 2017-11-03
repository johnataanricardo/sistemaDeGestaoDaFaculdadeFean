package br.com.fean.si.poo3.dto;

import br.com.fean.si.poo3.entity.Perfil;
import br.com.fean.si.poo3.entity.TipoSexo;

import java.time.LocalDate;

public class UsuarioDTO {

    private Long id;
    private String nome;
    private LocalDate dtNascimento;
    private String usuario;
    private String senha;
    private String email;
    private TipoSexo sexo;
    private Perfil perfil;
    private String telefone;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Long id, String nome, LocalDate dtNascimento, String usuario, String senha, String email, TipoSexo sexo, Perfil perfil, String telefone) {
        this.id = id;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
        this.sexo = sexo;
        this.perfil = perfil;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    
}
