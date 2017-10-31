package br.com.fean.si.poo3.controller;

import br.com.fean.si.poo3.entity.Perfil;
import br.com.fean.si.poo3.entity.TipoSexo;
import br.com.fean.si.poo3.entity.Usuario;
import br.com.fean.si.poo3.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import javax.validation.Valid;

/**
 * Created by Johnatan on 30/10/2017.
 */



@Controller
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @GetMapping("/todos")
    public ModelAndView listaTodos(ModelMap model){
       model.addAttribute("usuarios", usuarioServiceImpl.usuarios());
       return new ModelAndView("/user/list",model);
    }

    @GetMapping("/cadastro")
    public String cadastro(@ModelAttribute("usuario") Usuario usuario, ModelMap model){
        model.addAttribute("sexos", TipoSexo.values());
        model.addAttribute("perfis", Perfil.values());
        return "user/add";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult result, RedirectAttributes attr){
        if(result.hasErrors()){
            return "/user/add";
        }
        usuarioServiceImpl.add(usuario);
        attr.addFlashAttribute("message", "Usuário salvo com sucesso!");
        return "redirect:/usuario/todos";
    }

    @GetMapping("/update/{id}")
    public ModelAndView preUpdate(@PathVariable("id") Long id, ModelMap model) {
        Usuario usuario = usuarioServiceImpl.findById(id);
        model.addAttribute("usuario", usuario);
        return new ModelAndView("/user/add", model);
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute("usuario") Usuario usuario, BindingResult result, RedirectAttributes attr){
        if(result.hasErrors()) {
            return new ModelAndView("/user/add");
        }
        usuarioServiceImpl.update(usuario);
        attr.addAttribute("message", "Usuário Alterado com sucesso!");
        return new ModelAndView("redirect:/usuario/todos");
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id, RedirectAttributes attr){
        usuarioServiceImpl.remove(id);
        attr.addFlashAttribute("message", "Usuário deletado com Sucesso!");
        return "redirect:/usuario/todos";
    }

}
