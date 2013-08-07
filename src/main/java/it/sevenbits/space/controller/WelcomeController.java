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



    //ПОКАЗЫВАЕТ ФОРМУ
    public ModelAndView showForm(SubscribeForm subscribeForm) {
        ModelAndView modelAndView = new ModelAndView("subscribe-form");
        modelAndView.addObject("subscribeForm", subscribeForm);
        return modelAndView;
    }

    //показать списко событий
    @RequestMapping(value = {"/index.html","/"}, method = RequestMethod.GET)
    public ModelAndView showListEvent() {
        ModelAndView modelAndView = new ModelAndView("index");
        //List<String> date = new ArrayList<String>();
        List<Event> results  = eventDao.getAllEvent();
        modelAndView.addObject("events", results);
        return modelAndView;
    }

   /* @RequestMapping(value = {"/subscribe-form.html"}, method = RequestMethod.GET)
    public ModelAndView subscribingForm() {
        SubscribeForm subscribeForm = new SubscribeForm();
        return showForm(subscribeForm);
    }                                        */

    @RequestMapping(value = {"/index.html","/"}, method = RequestMethod.POST)
    public ModelAndView addEventOnMain (@Valid final SubscribeForm subscribeForm, final BindingResult result) {
        if (result.hasErrors()) {
            return showListEvent();
        }
        Subscription subscription = new Subscription();
        subscription.setEmail(subscribeForm.getEmail());
        subscriptionDao.create(subscription);
        return showListEvent();
    }

    @RequestMapping(value = {"/subscribe-form.html"}, method = RequestMethod.GET)
    public ModelAndView addSubscribe() {
        SubscribeForm subscribeForm = new SubscribeForm();
        return showForm(subscribeForm);
    }
}






