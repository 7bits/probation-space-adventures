package it.sevenbits.space.controller;

import it.sevenbits.space.dao.IEventDao;
import it.sevenbits.space.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SingleEventController {

    @Autowired
    private IEventDao IEventDao;

    @RequestMapping(value = "/event.html", method = RequestMethod.GET)
    public ModelAndView listEvent(@RequestParam final Long id) {
        ModelAndView modelAndView = new ModelAndView("event");
        Event result  = IEventDao.searchEventById(id);
        String img = result.getImg();
        img = "/space_adventures/resources/img/" + img;
        result.setImg(img);
        modelAndView.addObject("event", result);
        return modelAndView;
    }
}
