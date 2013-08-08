package it.sevenbits.space.controller;

import it.sevenbits.space.dao.EventDao;
import it.sevenbits.space.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: denis
 * Date: 8/7/13
 * Time: 3:17 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class SingleEventController {

    @Autowired
    @Qualifier("eventDao")
    private EventDao eventDao;

    @RequestMapping(value = "/event.html", method = RequestMethod.GET)
    public ModelAndView listEvent(@RequestParam /*@PathVariable("id")*/ Long id) {
        ModelAndView modelAndView = new ModelAndView("event");
        Event result  = eventDao.searchEventById(id);
        String img = result.getImg();
        img = "/space_adventures/resources/" + img;
        result.setImg(img);
        modelAndView.addObject("event", result);
        return modelAndView;
    }
}
