package br.com.fean.si.poo3.entity.sala;


import br.com.fean.si.poo3.entity.materia.Materia;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Map;

public class Sala {

    private Long idSala;
    private Long numSala;
    private TipoCategoria categoria;
    @NotBlank
    private String qntCadeira;
    @NotBlank
    private String qntTomada;
    private String qntArCondicionado;
    private String qntJanela;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dtCriacao;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dtAlocado;
    private Map<String, Materia> materias;

    public Sala(){}

    public Sala(Long idSala, Long numSala, TipoCategoria categoria, String qntCadeira, String qntTomada, String qntArCondicionado,
                String qntJanela, LocalDate dtCriacao, LocalDate dtAlocado, Map<String, Materia> materias) {
        this.idSala = idSala;
        this.numSala = numSala;
        this.categoria = categoria;
        this.qntCadeira = qntCadeira;
        this.qntTomada = qntTomada;
        this.qntArCondicionado = qntArCondicionado;
        this.qntJanela = qntJanela;
        this.dtCriacao = dtCriacao;
        this.dtAlocado = dtAlocado;
        this.materias = materias;
    }

    public Long getIdSala() {
        return idSala;
    }

    public void setIdSala(Long idSala) {
        this.idSala = idSala;
    }

    public Long getNumSala() {
        return numSala;
    }

    public void setNumSala(Long numSala) {
        this.numSala = numSala;
    }

    public TipoCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoCategoria categoria) {
        this.categoria = categoria;
    }

    public String getQntCadeira() {
        return qntCadeira;
    }

    public void setQntCadeira(String qntCadeira) {
        this.qntCadeira = qntCadeira;
    }

    public String getQntTomada() {
        return qntTomada;
    }

    public void setQntTomada(String qntTomada) {
        this.qntTomada = qntTomada;
    }

    public String getQntArCondicionado() {
        return qntArCondicionado;
    }

    public void setQntArCondicionado(String qntArCondicionado) {
        this.qntArCondicionado = qntArCondicionado;
    }

    public String getQntJanela() {
        return qntJanela;
    }

    public void setQntJanela(String qntJanela) {
        this.qntJanela = qntJanela;
    }

    public LocalDate getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(LocalDate dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public LocalDate getDtAlocado() {
        return dtAlocado;
    }

    public void setDtAlocado(LocalDate dtAlocado) {
        this.dtAlocado = dtAlocado;
    }

    public Map<String, Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Map<String, Materia> materias) {
        this.materias = materias;
    }

}
