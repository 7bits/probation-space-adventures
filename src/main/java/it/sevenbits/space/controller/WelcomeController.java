package it.sevenbits.space.controller;

import it.sevenbits.space.dao.EventDao;
import it.sevenbits.space.dao.SubscriptionDao;
import it.sevenbits.space.forms.SubscribeForm;
import it.sevenbits.space.model.Event;
import it.sevenbits.space.model.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Controller for main page (index.html).
 */
@Controller
//@SessionAttributes("search")
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
        //List<String> date = new ArrayList<String>();
        //String seach = modelAndView.getModel("search");
        List<Event> results  = eventDao.getAllEvent();

        for(Event item : results ){
            String img = item.getImg();
            img = "/space_adventures/resources/" + img;
            item.setImg(img);
            /*DateTime dateTime = new DateTime(item.getDate());
            String buff = dateTime.toString("MM/dd/yyyy");
            date.add(buff);*/
        }

        SubscribeForm subscribeForm = new SubscribeForm();
        //SearchEventForm searchEventForm = new SearchEventForm();

        modelAndView.addObject("subscribeForm", subscribeForm)
                .addObject("events", results);
                //.addObject("searchEventForm", searchEventForm)
                //.addObject("date", date);

        return modelAndView;
    }


    @RequestMapping(value = {"/index.html","/"}, method = RequestMethod.POST)
    public ModelAndView addSubscribe(SubscribeForm subscribeForm) {
        //model.addAttribute("email", subscribeForm.getEmail());

        Subscription subscription = new Subscription();
        subscription.setEmail(subscribeForm.getEmail());
        subscriptionDao.create(subscription);
        subscribeForm.setEmail("");
        return listEvent();
    }

    /*@RequestMapping(value = {"/index.html","/"}, method = RequestMethod.POST)
    public ModelAndView seacEvent(SearchEventForm seachEventFormIn) {

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("search", seachEventFormIn.getName());

        List<Event> results  = eventDao.searchEventByName(seachEventFormIn.getName());

        /*SubscribeForm subscribeForm = new SubscribeForm();
        SearchEventForm seachEventForm = new SearchEventForm();

        modelAndView.addObject("subscribeForm", subscribeForm)
                .addObject("events", results).addObject("\"seachEventForm", seachEventForm);

        return listEvent();
    } */
}