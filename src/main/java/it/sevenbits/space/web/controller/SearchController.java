package it.sevenbits.space.web.controller;

import it.sevenbits.space.model.Event;
import it.sevenbits.space.service.SearchingEvent;
import it.sevenbits.space.web.form.SearchEventForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SearchController {

  //  @Autowired      //отмечает конструктор, поле или метод как требующий автозаполнения инъекцией зависимости Spring
    SearchingEvent searchingEvent = new SearchingEvent();
    SearchEventForm searchEventForm = new SearchEventForm();

    @RequestMapping(value = {"/index.html"}, method = RequestMethod.POST)
    public ModelAndView showFoundedListEvent() {
        ModelAndView modelAndView = new ModelAndView("index");
        List<Event> results  = searchingEvent.searchEvent(searchEventForm.getName());
        for (Event item : results) {
            String img = item.getImg();
            img = "/space_adventures/resources/img/" + img;
            item.setImg(img);
        }
        modelAndView.addObject("events", results);
        return modelAndView;
    }

}

