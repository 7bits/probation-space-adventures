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

    //метод, отвечающий за вывод списка событий.
    public ModelAndView showlistEvent() {
        ModelAndView modelAndView = new ModelAndView("index");
        List<String> date = new ArrayList<String>();
        List<Event> results  = eventDao.getAllEvent();
        modelAndView.addObject("events", results);
        return modelAndView;
    }

    //ПОКАЗЫВАЕТ ФОРМУ
    public ModelAndView showForm(SubscribeForm subscribeForm) {
        ModelAndView modelAndView = new ModelAndView("subscribe-form");
       /* List<String> date = new ArrayList<String>();
        List<Event> results  = eventDao.getAllEvent(); */
        modelAndView.addObject("subscribeForm", subscribeForm);
        return modelAndView;
    }

    @RequestMapping(value = {"/index.html","/"}, method = RequestMethod.GET)
    public ModelAndView listEvent() {
       // SubscribeForm subscribeForm = new SubscribeForm();
        return showlistEvent();
    }

    @RequestMapping(value = {"/subscribe-form.html","/"}, method = RequestMethod.GET)
    public ModelAndView subscribingForm() {
        SubscribeForm subscribeForm = new SubscribeForm();
        return showForm(subscribeForm);
    }

    @RequestMapping(value = {"/index.html","/"}, method = RequestMethod.POST)
    public ModelAndView addEventOnMain (@Valid final SubscribeForm subscribeForm, final BindingResult result) {
        if (result.hasErrors()) {
            return showlistEvent();
        }
        return listEvent();
    }

    @RequestMapping(value = {"/subscribe-form.html","/"}, method = RequestMethod.POST)
    public ModelAndView addSubscribeForm(@Valid final SubscribeForm subscribeForm, final BindingResult result) {
        Subscription subscription = new Subscription();
        subscription.setEmail(subscribeForm.getEmail());
        if (result.hasErrors()) {
            return showForm(subscribeForm);
        }
        subscriptionDao.create(subscription);
        return null;
    }



   /* @RequestMapping(value = {"/subscribe-form.html","/"}, method = RequestMethod.POST)
    public ModelAndView addSubscribe2(@Valid final SubscribeForm subscribeForm, final BindingResult result) {
        Subscription subscription = new Subscription();
        subscription.setEmail(subscribeForm.getEmail());

            return showForm(subscribeForm);

    }
          */
     /* @RequestMapping(value = {"/index.html","/"}, method = RequestMethod.POST)
    public ModelAndView addSubscribe(SubscribeForm subscribeForm) {
        Subscription subscription = new Subscription();
        subscription.setEmail(subscribeForm.getEmail());
        subscriptionDao.create(subscription);
        subscribeForm.setEmail("");
        return listEvent();
    } */

}





                     /*
                     package it.sevenbits.space.controller;

import it.sevenbits.space.dao.EventDao;
import it.sevenbits.space.dao.SubscriptionDao;
import it.sevenbits.space.forms.SubscribeForm;
import it.sevenbits.space.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


                     @Controller
                     public class WelcomeController {

                         @Autowired
                         @Qualifier("subscriptionDao")
                         private SubscriptionDao subscriptionDao;

                         @Autowired
                         @Qualifier("eventDao")
                         private EventDao eventDao;

                         //метод, отвечающий за вывод списка событий.
                         public ModelAndView showlistEvent() {
                             ModelAndView modelAndView = new ModelAndView("index");
                             List<String> date = new ArrayList<String>();
                             List<Event> results  = eventDao.getAllEvent();
                             modelAndView.addObject("events", results);
                             return modelAndView;
                         }

                         //ПОКАЗЫВАЕТ ФОРМУ
                         public ModelAndView showForm(SubscribeForm subscribeForm) {
                             ModelAndView modelAndView = new ModelAndView("subscribe-form");

                             modelAndView.addObject("subscribeForm", subscribeForm);
                             return modelAndView;
                         }

                         @RequestMapping(value = {"/index.html","/"}, method = RequestMethod.GET)
                         public ModelAndView listEvent() {
                             // SubscribeForm subscribeForm = new SubscribeForm();
                             return showlistEvent();
                         }

                         @RequestMapping(value = {"/subscribe-form.html","/"}, method = RequestMethod.GET)
                         public ModelAndView subscribeForm() {
                             SubscribeForm subscribeForm = new SubscribeForm();
                             return showForm(subscribeForm);
                         }


    /*@RequestMapping(value = {"/subscribe-form","/"}, method = RequestMethod.POST)
    public ModelAndView addSubscribeForm(@Valid final SubscribeForm subscribeForm, final BindingResult result) {
        Subscription subscription = new Subscription();
        subscription.setEmail(subscribeForm.getEmail());
        if (result.hasErrors()) {
            return showForm(subscribeForm);
        }
        subscriptionDao.create(subscription);
        return null;
    }

                     }

                             */







