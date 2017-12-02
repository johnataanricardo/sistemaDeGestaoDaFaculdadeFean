package br.com.fean.si.poo3.dto.sala;

import br.com.fean.si.poo3.entity.sala.TipoCategoria;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class SalaMateriaDTO {

    private Long idSala;
    private Long numSala;
    private TipoCategoria categoria;
    private String qntCadeira;
    private String qntTomada;
    private String qntArCondicionado;
    private String qntJanela;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dtCriacao;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dtAlocado;
    private Long segunda;
    private Long terca;
    private Long quarta;
    private Long quinta;
    private Long sexta;

    public SalaMateriaDTO() {
    }

    public SalaMateriaDTO(Long idSala, Long numSala, TipoCategoria categoria, String qntCadeira, String qntTomada,
                          String qntArCondicionado, String qntJanela, LocalDate dtCriacao, LocalDate dtAlocado, Long segunda,
                          Long terca, Long quarta, Long quinta, Long sexta) {
        this.idSala = idSala;
        this.numSala = numSala;
        this.categoria = categoria;
        this.qntCadeira = qntCadeira;
        this.qntTomada = qntTomada;
        this.qntArCondicionado = qntArCondicionado;
        this.qntJanela = qntJanela;
        this.dtCriacao = dtCriacao;
        this.dtAlocado = dtAlocado;
        this.segunda = segunda;
        this.terca = terca;
        this.quarta = quarta;
        this.quinta = quinta;
        this.sexta = sexta;
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

    public Long getSegunda() {
        return segunda;
    }

    public void setSegunda(Long segunda) {
        this.segunda = segunda;
    }

    public Long getTerca() {
        return terca;
    }

    public void setTerca(Long terca) {
        this.terca = terca;
    }

    public Long getQuarta() {
        return quarta;
    }

    public void setQuarta(Long quarta) {
        this.quarta = quarta;
    }

    public Long getQuinta() {
        return quinta;
    }

    public void setQuinta(Long quinta) {
        this.quinta = quinta;
    }

    public Long getSexta() {
        return sexta;
    }

    public void setSexta(Long sexta) {
        this.sexta = sexta;
    }

}
