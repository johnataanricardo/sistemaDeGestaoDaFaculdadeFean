package br.com.fean.si.poo3.conversor.usuario;

import br.com.fean.si.poo3.entity.usuario.TipoSexo;
import org.springframework.core.convert.converter.Converter;

public class TipoSexoConverter implements Converter<String, TipoSexo> {

    @Override
    public TipoSexo convert(String texto) {
        char tipo = texto.charAt(0);
        return tipo == TipoSexo.FEMININO.getDesc() ? TipoSexo.FEMININO : TipoSexo.MASCULINO;
    }
}
