package it.sevenbits.space.controller;

import it.sevenbits.space.dao.SubscriptionDao;
import it.sevenbits.space.forms.SubscribeForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SubscriptionController {


    @Autowired
    @Qualifier("subscriptionDao")
    private SubscriptionDao subscriptionDao;

    @RequestMapping(value = {"/index2.html","/"}, method = RequestMethod.GET)
    @ResponseBody
    ModelAndView subscribe(){

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("subscribeForm", new SubscribeForm());

        return modelAndView;

    }
}

