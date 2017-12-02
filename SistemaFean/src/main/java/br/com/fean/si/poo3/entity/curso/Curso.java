package br.com.fean.si.poo3.entity.curso;


import javax.validation.constraints.NotNull;

public class Curso {

    private Long id;
    @NotNull(message = "O campo	'nome' é requerido.")
    private String nome;
    @NotNull(message = "O campo	'descrição' é requerido.")
    private String descricao;
    private String areaDeAtuacao;
    @NotNull(message = "O campo	'Quantidade de Semestres' é requerido.")
    private Integer tempoDeDuracao;
    private Boolean estagioSupervisionado;
    @NotNull(message = "O campo	'Quantidade de Créditos' é requerido.")
    private Integer quantidadeDeCreditos;

    public Curso(){
    }

    public Curso(Long id, String nome, String descricao, String areaDeAtuacao, Integer tempoDeDuracao, Boolean estagioSupervisionado, Integer quantidadeDeCreditos) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.areaDeAtuacao = areaDeAtuacao;
        this.tempoDeDuracao = tempoDeDuracao;
        this.estagioSupervisionado = estagioSupervisionado;
        this.quantidadeDeCreditos = quantidadeDeCreditos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }

    public Integer getTempoDeDuracao() {
        return tempoDeDuracao;
    }

    public void setTempoDeDuracao(Integer tempoDeDuracao) {
        this.tempoDeDuracao = tempoDeDuracao;
    }

    public Boolean getEstagioSupervisionado() {
        return estagioSupervisionado;
    }

    public void setEstagioSupervisionado(Boolean estagioSupervisionado) {
        this.estagioSupervisionado = estagioSupervisionado;
    }

    public Integer getQuantidadeDeCreditos() {
        return quantidadeDeCreditos;
    }

    public void setQuantidadeDeCreditos(Integer quantidadeDeCreditos) {
        this.quantidadeDeCreditos = quantidadeDeCreditos;
    }

}
