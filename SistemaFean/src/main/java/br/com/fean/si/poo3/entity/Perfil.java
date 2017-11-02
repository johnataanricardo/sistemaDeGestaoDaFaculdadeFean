package br.com.fean.si.poo3.entity;

/**
 * Created by Johnatan on 30/10/2017.
 */
public enum Perfil {
    ALUNO("Aluno"), PROFESSOR("Professor"), GESTOR("Gestor");

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
