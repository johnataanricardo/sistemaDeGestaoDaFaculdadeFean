package br.com.fean.si.poo3.controller;

import br.com.fean.si.poo3.dto.UsuarioDTO;
import br.com.fean.si.poo3.entity.Perfil;
import br.com.fean.si.poo3.entity.TipoSexo;
import br.com.fean.si.poo3.entity.Usuario;
import br.com.fean.si.poo3.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping("/todos")
    public ModelAndView listaTodos(ModelMap model) {
        model.addAttribute("usuarios", service.usuarios());
        return new ModelAndView("/usuario/usuarios", model);
    }

    @GetMapping("/cadastro")
    public String cadastro(@ModelAttribute("usuario") Usuario usuario, ModelMap model) {
        model.addAttribute("sexos", TipoSexo.values());
        model.addAttribute("perfis", Perfil.values());
        return "usuario/cadastro";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult result, RedirectAttributes attr) {
        if (result.hasErrors()) {
            return "/usuario/cadastro";
        }
        service.add(usuario);
        attr.addFlashAttribute("message", "Usuário salvo com sucesso!");
        return "redirect:/usuario/todos";
    }

    @GetMapping("/update/{id}")
    public ModelAndView preUpdate(@PathVariable("id") Long id, ModelMap model) {
//        UsuarioDTO usuario = service.findById(id);
        Usuario usuario = service.findById(id);
        model.addAttribute("usuario", usuario);
        return new ModelAndView("/usuario/cadastro", model);
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute("usuario") Usuario usuario, BindingResult result, RedirectAttributes attr) {
        if (result.hasErrors()) {
            return new ModelAndView("/usuario/cadastro");
        }
        service.update(usuario);
        attr.addAttribute("message", "Usuário Alterado com sucesso!");
        return new ModelAndView("redirect:/usuario/todos");
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id, RedirectAttributes attr) {
        service.remove(id);
        attr.addFlashAttribute("message", "Usuário deletado com Sucesso!");
        return "redirect:/usuario/todos";
    }

}
