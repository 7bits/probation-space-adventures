package it.sevenbits.space.web.controller;

import it.sevenbits.space.web.form.SearchEventForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {

    @RequestMapping(value = {"/index.html"}, method = RequestMethod.GET)
    public ModelAndView showFounfEvent() {
        SearchEventForm searchEventForm = new SearchEventForm();

        ModelAndView modelAndView = new ModelAndView("index");

        return modelAndView;
    }
}
