package br.com.fean.si.poo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//   /*  Utilizar na hora da implementação da sessão!
    @RequestMapping("/")
    public ModelAndView login () {
        ModelAndView view = new ModelAndView("login/login");
        return view;
    }

    @RequestMapping("/inicio")
    public ModelAndView inicio () {
        ModelAndView view = new ModelAndView("default/default");
        return view;
    }


//    */

    // Este redirecionamento é para testes do crud, não precisar fazer logon toda hora!
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView homePage () {
//        ModelAndView view = new ModelAndView("redirect:/usuario/todos");
//        return view;
//    }


}
