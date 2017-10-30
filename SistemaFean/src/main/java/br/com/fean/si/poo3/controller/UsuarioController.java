package br.com.fean.si.poo3.controller;

import br.com.fean.si.poo3.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Johnatan on 30/10/2017.
 */
@Controller
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;


}
