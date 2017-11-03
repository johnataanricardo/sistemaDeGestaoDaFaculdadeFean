package br.com.fean.si.poo3.entity;

public enum Perfil {
    ALUNO("ALUNO"), PROFESSOR("PROFESSOR"), GESTOR("GESTOR");

    private String descricao;

    Perfil(String descricao) {
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
