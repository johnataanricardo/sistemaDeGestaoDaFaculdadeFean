package br.com.fean.si.poo3.entity.materia;

public enum Categoria {
    OBRIGATORIA("Obrigatória"), OPTATIVA("Optativa");

    private String descricao;

    Categoria(String descricao) {
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
