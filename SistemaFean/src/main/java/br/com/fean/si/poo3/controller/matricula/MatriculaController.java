package br.com.fean.si.poo3.controller.matricula;

import br.com.fean.si.poo3.dto.matricula.MatriculaDTO;
import br.com.fean.si.poo3.entity.usuario.Perfil;
import br.com.fean.si.poo3.entity.usuario.TipoSexo;
import br.com.fean.si.poo3.facade.MatriculaFacade;
import br.com.fean.si.poo3.service.curso.CursoService;
import br.com.fean.si.poo3.service.matricula.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("matricula")
public class MatriculaController {

    @Autowired
    private MatriculaService matriculaService;

    @Autowired
    private CursoService cursoService;

    @Autowired
    private MatriculaFacade matriculaFacade;

    @GetMapping("/todas")
    public ModelAndView listaTodas(ModelMap model) {
        model.addAttribute("matriculas", matriculaService.matriculas());
        return new ModelAndView("/matricula/matriculas", model);
    }

    @GetMapping("/cadastro")
    public String cadastro(@ModelAttribute("matricula") MatriculaDTO matriculaDTO, ModelMap model) {
        model.addAttribute("sexos", TipoSexo.values());
        model.addAttribute("perfis", Perfil.values());
        model.addAttribute("cursos", cursoService.cursos());
        return "matricula/cadastro";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("matricula") MatriculaDTO matriculaDTO, BindingResult result, RedirectAttributes attr) {
        if (result.hasErrors()) {
            return "/matricula/cadastro";
        }
        matriculaFacade.realizarMatricula(matriculaDTO);
        attr.addFlashAttribute("message", "Matricula salva com sucesso!");
        return "redirect:/matricula/todas";
    }

    @GetMapping("/update/{id}")
    public ModelAndView preUpdate(@PathVariable("id") Long id, ModelMap model) {
        MatriculaDTO matriculaDTO = matriculaService.findById(id);
        model.addAttribute("matricula", matriculaDTO);
        model.addAttribute("cursos", cursoService.cursos());
        return new ModelAndView("/matricula/cadastro", model);
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute("matricula") MatriculaDTO matriculaDTO, BindingResult result, RedirectAttributes attr) {
        if (result.hasErrors()) {
            return new ModelAndView("/matricula/cadastro");
        }
        matriculaFacade.atualizarMatricula(matriculaDTO);
        attr.addAttribute("message", "Matricula Alterada com sucesso!");
        return new ModelAndView("redirect:/matricula/todas");
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id, RedirectAttributes attr) {
        matriculaService.remove(id);
        attr.addFlashAttribute("message", "Matricula deletada com Sucesso!");
        return "redirect:/matricula/todas";
    }
    
    
}
