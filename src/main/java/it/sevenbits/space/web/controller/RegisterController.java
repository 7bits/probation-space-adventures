package it.sevenbits.space.web.controller;

import it.sevenbits.space.dao.IUserDao;
import it.sevenbits.space.domain.User;
import it.sevenbits.space.service.MailService;
import it.sevenbits.space.service.RoleType;
import it.sevenbits.space.web.form.RegistrationForm;
import it.sevenbits.space.web.validator.RegistrationValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;

@Controller
public class RegisterController {

    @Autowired
    private IUserDao userDao;

    @Autowired
    private RegistrationValidator registrationValidator;

    @Autowired
    private MailService mailService;

    @RequestMapping(value = "/register.html", method = RequestMethod.GET)
    public ModelAndView displayRegistration() {

        RegistrationForm registrationForm = new RegistrationForm();
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("registrationForm", registrationForm);
        return modelAndView;
    }

    @RequestMapping(value = "/register.html", method = RequestMethod.POST)
    public ModelAndView addUser(final RegistrationForm registrationForm, final BindingResult bindingResult) {

        registrationValidator.validate(registrationForm, bindingResult);
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("register");
            modelAndView.addObject("registrationForm", registrationForm);
            return modelAndView;
        }

        User user = new User();
        user.setUsername(registrationForm.getUsername());
        user.setEmail(registrationForm.getEmail());
        user.setPassword(registrationForm.getPassword());
        user.setRole(RoleType.ROLE_USER.name());
        user.setActivationCode(generateActivationCode(registrationForm.getEmail()));
        user.setActivated(false);
        userDao.addUser(user);
        mailService.sendConfirmationEmail(user);

        return null;
    }

    private String generateActivationCode(final String email) {

        StringBuffer result = new StringBuffer();
        java.util.Date date= new java.util.Date();

        result.append(Math.abs(new Timestamp(date.getTime()).hashCode()));
        result.append(Math.abs(email.hashCode()));
        return result.toString();
    }
}
