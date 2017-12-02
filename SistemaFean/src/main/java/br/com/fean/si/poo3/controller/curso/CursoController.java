package br.com.fean.si.poo3.controller.curso;

import br.com.fean.si.poo3.dto.curso.CursoDTO;
import br.com.fean.si.poo3.entity.curso.Curso;
import br.com.fean.si.poo3.service.curso.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("curso")
public class CursoController {
    
    @Autowired
    private CursoService cursoService;

    @GetMapping("/todos")
    public ModelAndView listaTodas(ModelMap model) {
        model.addAttribute("cursos", cursoService.cursos());
        return new ModelAndView("/curso/cursos", model);
    }

    @GetMapping("/cadastro")
    public String cadastro(@ModelAttribute("curso") Curso curso) {
        return "curso/cadastro";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("curso") Curso curso, BindingResult result, RedirectAttributes attr) {
        if (result.hasErrors()) {
            return "/curso/cadastro";
        }
        cursoService.add(curso);
        attr.addFlashAttribute("message", "Curso salvo com sucesso!");
        return "redirect:/curso/todos";
    }

    @GetMapping("/update/{id}")
    public ModelAndView preUpdate(@PathVariable("id") Long id, ModelMap model) {
        CursoDTO cursoDTO = cursoService.findByIdDTO(id);
        model.addAttribute("curso", cursoDTO);
        return new ModelAndView("/curso/cadastro", model);
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute("curso") Curso curso, BindingResult result, RedirectAttributes attr) {
        if (result.hasErrors()) {
            return new ModelAndView("/curso/cadastro");
        }
        cursoService.update(curso);
        attr.addAttribute("message", "Curso salvo com sucesso!");
        return new ModelAndView("redirect:/curso/todos");
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id, RedirectAttributes attr) {
        cursoService.remove(id);
        attr.addFlashAttribute("message", "Curso deletado com Sucesso!");
        return "redirect:/curso/todos";
    }
}
