package it.sevenbits.space.controller;

import it.sevenbits.space.dao.EventDao;
import it.sevenbits.space.dao.SubscriptionDao;
import it.sevenbits.space.model.Event;
import it.sevenbits.space.model.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;
import java.util.List;

/**
 * Controller for main page (index.html).
 */
@Controller
public class WelcomeController {

    //private int visitorCount = 6;
    @Autowired
    @Qualifier("subscriptionDao")
    private SubscriptionDao subscriptionDao;


    @Autowired
    @Qualifier("eventDao")
    private EventDao eventDao;

    @RequestMapping(value = {"/index.html","/"}, method = RequestMethod.GET)
    public String showIndex(Model model) {
        Event event = new Event();

        //Long date = ;
        //event.setDate(date);


        List<Event> results = new LinkedList<Event>();

        results = eventDao.getAllEvent();
        //List<Event> results = eventDao.getAllEvent();

        //Iterator<Event> iterator = results.iterator();
        //model.addAttribute("mes", "TRUE");
        //while (iterator.hasNext()){
               // model.addAttribute("event", iterator.next());
        //}
        if (results != null) {
            for (Event e : results) {
                model.addAttribute("event", e.getName());
            }
        }  else {
            model.addAttribute("error","null was reterned" );
        }
        return "in";
        //return "index";
    }

    /*@RequestMapping(value = {"/button.html", "/"}, method = RequestMethod.GET)
    public String showButton(Model model) {
        model.addAttribute("message", "Hello Spring MVC Framework! It is button");
        return "index";
    }          */


    @RequestMapping(value = {"/foo.html"}, method = RequestMethod.GET)
    @ResponseBody
    public String foo(Model model) {
        //model.addAttribute("visitorCount", visitorCount);
        //model.addAttribute("message", "Hello Spring MVC Framework!");
        Subscription subscription = new Subscription();
        subscription.setEmail("sldfjasldfkjasdlf");
        subscriptionDao.create(subscription);
        return "created";
    }
}
