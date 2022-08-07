package raman.spring.jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import raman.spring.jokesapp.services.JokesService;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", "", "/joke"})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokesService.getJokes());

        return "index";
    }

}
