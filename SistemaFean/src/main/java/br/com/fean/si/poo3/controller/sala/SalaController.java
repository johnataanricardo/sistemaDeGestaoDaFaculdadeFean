package br.com.fean.si.poo3.controller.sala;

import br.com.fean.si.poo3.dto.sala.SalaMateriaDTO;
import br.com.fean.si.poo3.entity.sala.Sala;
import br.com.fean.si.poo3.entity.sala.TipoCategoria;
import br.com.fean.si.poo3.service.materia.MateriaService;
import br.com.fean.si.poo3.service.sala.SalaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("sala")
public class SalaController {

    @Autowired
    private SalaServiceImpl salaService;

    @Autowired
    private MateriaService materiaService;

    @GetMapping("/todos")
    public ModelAndView listaTodos(ModelMap model){
        model.addAttribute("salas", salaService.salas());
        return new ModelAndView("/sala/salas", model);
    }

    @GetMapping("/cadastro")
    public String cadastro(@ModelAttribute("sala") SalaMateriaDTO salaMateriaDTO, ModelMap model){
        model.addAttribute("categorias", TipoCategoria.values());
        model.addAttribute("materias", materiaService.materias());
        return "sala/cadastro";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("sala") SalaMateriaDTO salaMateriaDTO, BindingResult result, RedirectAttributes attr){
        if (result.hasErrors()) {
            return "/sala/cadastro";
        }
        salaService.add(salaMateriaDTO);
        attr.addFlashAttribute("message", "Sala salva com sucesso!");
        return "redirect:/sala/todos";
    }

    @GetMapping("/update/{id}")
    public ModelAndView preUpdate(@PathVariable("id") Long id, ModelMap model){
        SalaMateriaDTO salaMateriaDTO = salaService.findById(id);
        model.addAttribute("sala", salaMateriaDTO);
        model.addAttribute("materias", materiaService.materias());
        return new ModelAndView("/sala/cadastro", model);

    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute("sala") SalaMateriaDTO salaMateriaDTO, BindingResult result, RedirectAttributes attr){
        if (result.hasErrors()) {
            return new ModelAndView("/sala/cadastro");
        }

        salaService.update(salaMateriaDTO);
        attr.addAttribute("message", "Sala alterada com sucesso!");
        return new ModelAndView("redirect:/sala/todos");
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id, RedirectAttributes attr){
        salaService.remove(id);
        attr.addFlashAttribute("message", "Sala deletada com Sucesso!");
        return "redirect:/sala/todos";
    }
    
}
