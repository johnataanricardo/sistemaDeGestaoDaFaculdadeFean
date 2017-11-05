package br.com.fean.si.poo3.conversor.materia;

import br.com.fean.si.poo3.entity.materia.Categoria;
import org.springframework.core.convert.converter.Converter;

public class CategoriaConverter implements Converter<String, Categoria>{

    @Override
    public Categoria convert(String texto) {
        String categoria = String.valueOf(texto.charAt(1)).toLowerCase();
        return categoria.equals(String.valueOf(Categoria.OBRIGATORIA.getDescricao().charAt(1))) ? Categoria.OBRIGATORIA : Categoria.OPTATIVA;
    }
}
