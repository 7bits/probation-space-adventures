package it.sevenbits.space.web.controller;

import it.sevenbits.space.dao.IUserDao;
import it.sevenbits.space.domain.User;
import it.sevenbits.space.service.RoleType;
import it.sevenbits.space.web.form.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

    @Autowired
    private IUserDao userDao;

    @RequestMapping(value = "/register.html", method = RequestMethod.GET)
    public ModelAndView displayRegistration() {
        RegistrationForm registrationForm = new RegistrationForm();
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("registrationForm", registrationForm);
        return modelAndView;
    }

    @RequestMapping(value = "/register.html", method = RequestMethod.POST)
    public ModelAndView addUser(final RegistrationForm registrationForm) {
        User user = new User();
        user.setUsername(registrationForm.getUsername());
        user.setEmail(registrationForm.getEmail());
        user.setPassword(registrationForm.getPassword());
        user.setRole(RoleType.ROLE_USER.name());
        userDao.addUser(user);
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
