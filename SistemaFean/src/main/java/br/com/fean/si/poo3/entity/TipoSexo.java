package br.com.fean.si.poo3.entity;

/**
 * Created by Johnatan on 30/10/2017.
 */
public enum TipoSexo {
    FEMININO('F'), MASCULINO('M');

    private char desc;

    TipoSexo(char desc){
        this.desc = desc;
    }

    public char getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

