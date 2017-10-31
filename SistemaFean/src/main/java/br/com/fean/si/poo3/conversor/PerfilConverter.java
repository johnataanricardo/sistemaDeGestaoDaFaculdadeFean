package br.com.fean.si.poo3.conversor;

import br.com.fean.si.poo3.entity.Perfil;
import org.springframework.core.convert.converter.Converter;

public class PerfilConverter implements Converter<String, Perfil>{

    @Override
    public Perfil convert(String texto) {
        String tipoPerfil = texto.toString();
        Perfil perfilEscolhido = null;
        if(tipoPerfil == Perfil.ALUNO.getDescricao()){
             perfilEscolhido = Perfil.ALUNO;
        }else if (tipoPerfil == Perfil.PROFESSOR.getDescricao()){
            perfilEscolhido = Perfil.PROFESSOR;
        }else{
            perfilEscolhido = Perfil.GESTOR;
        }
        return perfilEscolhido;
    }
}
