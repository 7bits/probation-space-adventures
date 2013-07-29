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

    //private int visitorCount = 6;

    @RequestMapping(value = {"/index.html","/"}, method = RequestMethod.GET)
    public String showIndex(Model model) {
        //model.addAttribute("visitorCount", visitorCount);
        //model.addAttribute("message", "Hello Spring MVC Framework!");
        return "index";
    }

    /*@RequestMapping(value = {"/button.html", "/"}, method = RequestMethod.GET)
    public String showButton(Model model) {
        model.addAttribute("message", "Hello Spring MVC Framework! It is button");
        return "index";
    }          */
}
