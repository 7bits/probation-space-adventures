package it.sevenbits.space.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for main page (index.html).
 */
@Controller
public class WelcomeController {

    @RequestMapping(value = {"/index.html", "/"}, method = RequestMethod.GET)
    public String showIndex(Model model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "index";
    }


    @RequestMapping(value = {"/index2.html", "/"}, method = RequestMethod.GET)
    public String showIndex2(Model model) {
        model.addAttribute("message", "Hello Spring MVC Framework2!");
        return "index";
    }


}

