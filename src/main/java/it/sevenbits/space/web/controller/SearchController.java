package it.sevenbits.space.web.controller;

import it.sevenbits.space.dao.IEventDao;
import it.sevenbits.space.model.Event;
import it.sevenbits.space.web.form.SearchEventForm;
import it.sevenbits.space.web.form.SubscriptionForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class SearchController {
    @Autowired
    private it.sevenbits.space.dao.IEventDao IEventDao;

    @RequestMapping(value = {"/index.html", "/"}, params = "page=search", method = RequestMethod.POST)
    public ModelAndView searchPage(final SearchEventForm searchEventForm) {

        ModelAndView modelAndView = new ModelAndView("index");
        String search = new String();
       // search = searchEventForm.getName();

        List<Event> results  = null;
        //if (search != "" ){
        results = IEventDao.findEventsByString("la"/*searchEventForm.getName()*/);

        for (Event item : results) {
            String img = item.getImg();
            img = "/space_adventures/resources/img/" + img;
            item.setImg(img);
        }
        modelAndView.addObject("events", results);

        return modelAndView;
    }

  //  @Autowired      //отмечает конструктор, поле или метод как требующий автозаполнения инъекцией зависимости Spring
  /*  SearchingEvent searchingEvent = new SearchingEvent();
    SearchEventForm searchEventForm = new SearchEventForm();

    @RequestMapping(value = {"/index.html"}, method = RequestMethod.POST)
    public ModelAndView showFoundedListEvent() {
        ModelAndView modelAndView = new ModelAndView("index");
        List<Event> results  = searchingEvent.findEvents(searchEventForm.getName());
        for (Event item : results) {
            String img = item.getImg();
            img = "/space_adventures/resources/img/" + img;
            item.setImg(img);
        }
        modelAndView.addObject("events", results);
        return modelAndView;
    }   */


   /* @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public ModelAndView displaySearchEventForm() {
        SearchEventForm searchEventForm = new SearchEventForm();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("searchEventForm", searchEventForm);
        return modelAndView;
    }    */

    /*@RequestMapping(value = "/index.html", params = "page=search", method = RequestMethod.POST)
    public ModelAndView searchEvent(@ModelAttribute("SpringWeb")SearchEventForm searchEventForm,
                             ModelMap model) {
        ModelAndView modelAndView = new ModelAndView("index");
        model.addAttribute("name", searchEventForm.getName());
        return modelAndView;
    } */

}

