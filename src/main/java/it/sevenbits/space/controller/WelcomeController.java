package it.sevenbits.space.controller;

import it.sevenbits.space.dao.EventDao;
import it.sevenbits.space.dao.SubscriptionDao;
import it.sevenbits.space.forms.SubscribeForm;
import it.sevenbits.space.model.Event;
import it.sevenbits.space.model.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Controller for main page (index.html).
 */
@Controller
public class WelcomeController {

    @Autowired
    @Qualifier("subscriptionDao")
    private SubscriptionDao subscriptionDao;


    @Autowired
    @Qualifier("eventDao")
    private EventDao eventDao;

    @RequestMapping(value = {"/index.html","/"}, method = RequestMethod.GET)
    public ModelAndView listEvent() {

        ModelAndView modelAndView = new ModelAndView("index");
        List<String> date = new ArrayList<String>();
        List<Event> results  = eventDao.getAllEvent();
        SubscribeForm subscribeForm = new SubscribeForm();
        modelAndView.addObject("subscribeForm", subscribeForm)
                .addObject("events", results);
        return modelAndView;
    }

   /* @RequestMapping(value = {"/index.html","/"}, method = RequestMethod.POST)
    public ModelAndView addSubscribe(SubscribeForm subscribeForm) {
        Subscription subscription = new Subscription();
        subscription.setEmail(subscribeForm.getEmail());
        subscriptionDao.create(subscription);
        subscribeForm.setEmail("");
        return listEvent();
    } */




    @RequestMapping(value = {"/index.html","/"}, method = RequestMethod.POST)
    public ModelAndView addSubscribe(@Valid final SubscribeForm subscribeForm, final BindingResult result) {
        Subscription subscription = new Subscription();
        subscription.setEmail(subscribeForm.getEmail());

        if (result.hasErrors()) {
            return new ModelAndView("index");
        }
        subscriptionDao.create(subscription);
        subscribeForm.setEmail("");
        return listEvent();
       // return listEvent();
    }



}







