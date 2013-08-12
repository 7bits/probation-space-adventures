package it.sevenbits.space.controller;

import it.sevenbits.space.dao.EventDao;
import it.sevenbits.space.dao.SubscriptionDao;
import it.sevenbits.space.forms.SubscribeForm;
import it.sevenbits.space.model.Event;
import it.sevenbits.space.model.Subscription;
import it.sevenbits.space.validators.SubscribeVaildator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class WelcomeController {

    @Autowired
    private SubscriptionDao subscriptionDao;

    @Autowired
    private EventDao eventDao;

    @Autowired
    private SubscribeVaildator subscribeVaildator;

    @RequestMapping(value = {"/index.html","/"}, method = RequestMethod.GET)
    public ModelAndView showListEvent() {
        ModelAndView modelAndView = new ModelAndView("index");
        //List<String> date = new ArrayList<String>();
        List<Event> results  = eventDao.getAllEvent();
        for (Event item : results) {
            String img = item.getImg();
            img = "/space_adventures/resources/img/" + img;
            item.setImg(img);
        }
        modelAndView.addObject("events", results);
        return modelAndView;
    }

    @InitBinder
    protected void initBinder(final WebDataBinder binder) {
        binder.setValidator(subscribeVaildator);
    }

    @RequestMapping(value = {"/index.html","/"}, method = RequestMethod.POST)
    public ModelAndView addEventOnMain(@Valid final SubscribeForm subscribeForm, final BindingResult result) {
        if (result.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("subscribe-form");
            modelAndView.addObject("subscribeForm", subscribeForm);
            return modelAndView;
        }
        Subscription subscription = new Subscription();
        subscription.setEmail(subscribeForm.getEmail());
        subscriptionDao.create(subscription);
        return null;
    }

    @RequestMapping(value = "/subscribe-form.html", method = RequestMethod.GET)
    public ModelAndView addSubscribe() {
        SubscribeForm subscribeForm = new SubscribeForm();
        ModelAndView modelAndView = new ModelAndView("subscribe-form");
        modelAndView.addObject("subscribeForm", subscribeForm);
        return modelAndView;
    }
}