package br.com.fean.si.poo3.conversor;

import br.com.fean.si.poo3.entity.Perfil;
import org.springframework.core.convert.converter.Converter;

public class PerfilConverter implements Converter<String, Perfil> {

    @Override
    public Perfil convert(String texto) {
        Perfil perfilEscolhido = null;
        if (texto.equals(Perfil.ALUNO.getDescricao())) {
            perfilEscolhido = Perfil.ALUNO;
        } else if (texto.equals(Perfil.PROFESSOR.getDescricao())) {
            perfilEscolhido = Perfil.PROFESSOR;
        } else {
            perfilEscolhido = Perfil.GESTOR;
        }
        return perfilEscolhido;
    }
}
