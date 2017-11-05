package br.com.fean.si.poo3.controller.materia;

import br.com.fean.si.poo3.dto.materia.MateriaDTO;
import br.com.fean.si.poo3.entity.materia.Categoria;
import br.com.fean.si.poo3.entity.materia.Materia;
import br.com.fean.si.poo3.service.materia.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("materia")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @GetMapping("/todas")
    public ModelAndView listaTodas(ModelMap model) {
        model.addAttribute("materias", materiaService.materias());
        return new ModelAndView("/materia/materias", model);
    }

    @GetMapping("/cadastro")
    public String cadastro(@ModelAttribute("materia") Materia materia, ModelMap model) {
        model.addAttribute("categorias", Categoria.values());
        return "materia/cadastro";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("materia") Materia materia, BindingResult result, RedirectAttributes attr) {
        if (result.hasErrors()) {
            return "/materia/cadastro";
        }
        materiaService.add(materia);
        attr.addFlashAttribute("message", "Matéria salva com sucesso!");
        return "redirect:/materia/todas";
    }

    @GetMapping("/update/{id}")
    public ModelAndView preUpdate(@PathVariable("id") Long id, ModelMap model) {
        MateriaDTO materiaDTO = materiaService.findById(id);
        model.addAttribute("materia", materiaDTO);
        return new ModelAndView("/materia/cadastro", model);
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute("materia") Materia materia, BindingResult result, RedirectAttributes attr) {
        if (result.hasErrors()) {
            return new ModelAndView("/materia/cadastro");
        }
        materiaService.update(materia);
        attr.addAttribute("message", "Matéria Alterada com sucesso!");
        return new ModelAndView("redirect:/materia/todas");
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id, RedirectAttributes attr) {
        materiaService.remove(id);
        attr.addFlashAttribute("message", "Matéria deletada com Sucesso!");
        return "redirect:/materia/todas";
    }

}
