package it.sevenbits.space.web.controller;

import it.sevenbits.space.web.form.RegistrationForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

    @RequestMapping(value = "/register.html", method = RequestMethod.GET)
    public ModelAndView displaySubscription() {
        RegistrationForm registrationForm = new RegistrationForm();
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("registrationForm", registrationForm);
        return modelAndView;
    }
}
