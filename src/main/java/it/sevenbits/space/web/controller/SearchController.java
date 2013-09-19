package it.sevenbits.space.web.controller;

import org.springframework.stereotype.Controller;

@Controller
public class SearchController {

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

}

