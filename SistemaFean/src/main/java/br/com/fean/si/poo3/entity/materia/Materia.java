package br.com.fean.si.poo3.entity.materia;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Materia {

    private Long id;

    @Size(min = 3, max = 50, message = "Campo requerido entre {min} e {max} caracteres.")
    private String nome;
    private String descricao;
    private Categoria categoria;

    @NotNull(message = "O campo	'carga horária' é requerido.")
//    @Range(min = 10, max = 10000, message = "A carga horário deve ser de no mínimo {min}.")
    private Integer cargaHoraria;

    public Materia() {
    }

    public Materia(Long id, String nome, String descricao, Categoria categoria, Integer cargaHoraria) {
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

    public void setCargaHoraria(Integer cargaHoria) {
        this.cargaHoraria = cargaHoria;
    }

}
