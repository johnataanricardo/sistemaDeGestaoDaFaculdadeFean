package br.com.fean.si.poo3.dto.materia;

import br.com.fean.si.poo3.entity.materia.Categoria;

public class MateriaDTO {

    private Long id;
    private String nome;
    private String descricao;
    private Categoria categoria;
    private Integer cargaHoraria;

    public MateriaDTO() {
    }

    public MateriaDTO(Long id, String nome, String descricao, Categoria categoria, Integer cargaHoraria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.cargaHoraria = cargaHoraria;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}
