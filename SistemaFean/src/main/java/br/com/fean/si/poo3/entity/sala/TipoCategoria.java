package br.com.fean.si.poo3.entity.sala;

public enum TipoCategoria {

    AULA("Tradicional"), ARTES("Artes"), PROVA("Prova"), AUDITORIO("Auditório");

    private String descricao;

    TipoCategoria(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
