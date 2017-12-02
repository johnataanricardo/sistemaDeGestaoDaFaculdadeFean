package br.com.fean.si.poo3.entity.endereco;

public class Endereco {

    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private Long cep;
    private String complemento;
    private Integer numero;

    public Endereco(){
    }

    public Endereco(String estado, String cidade, String bairro, String rua, Long cep, String complemento, Integer numero) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
        this.complemento = complemento;
        this.numero = numero;
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

}
