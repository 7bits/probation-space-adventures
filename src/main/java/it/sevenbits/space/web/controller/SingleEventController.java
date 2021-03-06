package it.sevenbits.space.web.controller;

import it.sevenbits.space.dao.IEventDao;
import it.sevenbits.space.domain.Event;
import it.sevenbits.space.web.form.SearchEventForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * The controller is responsible for displaying the page of one event.
 */
@Controller
public class SingleEventController {
    public static final String IMG_URL = "/space_adventures/resources/img/";
    @Autowired
    private IEventDao iEventDao;

    /**
     * Displays page with one event.
     * @param id event primary key.
     * @return page view.
     */
    @RequestMapping(value = "/event", method = RequestMethod.GET)
    public ModelAndView listEvent(@RequestParam final Long id) {
        ModelAndView modelAndView = new ModelAndView("event");
        SearchEventForm searchEventForm = new SearchEventForm();
        Event result  = iEventDao.findEventById(id);
        String img = result.getImg();
        img = IMG_URL + img;
        result.setImg(img);
        modelAndView.addObject("event", result);
        modelAndView.addObject("searchEventForm", searchEventForm);
        return modelAndView;
    }
}
