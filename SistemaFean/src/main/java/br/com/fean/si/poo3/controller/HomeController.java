package br.com.fean.si.poo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by johnatan on 25/10/2017.
 */
@Controller
public class HomeController {

   /*  Utilizar na hora da implementação da sessão!
    @RequestMapping("/")
    public ModelAndView view () {
        ModelAndView view = new ModelAndView("usuarios/login");
        return view;
    }
    */

    // Este redirecionamento é para testes do crud, não precisar fazer logon toda hora!
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage () {
        return "redirect:/usuario/todos";
    }


}
