package br.com.fean.si.poo3.entity;

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

