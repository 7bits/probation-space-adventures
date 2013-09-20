package it.sevenbits.space.service;

import it.sevenbits.space.dao.IEventDao;
import it.sevenbits.space.domain.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: alexey
 * Date: 10.09.13
 * Time: 14:01
 * To change this template use File | Settings | File Templates.
 */

@Service
public class SearchingEvent {
    @Autowired
    private IEventDao iEventDao;

    public List<Event> findCustom(String search){

        List<Event> results  = null;

        if ("".equals(search)) {
            results = iEventDao.findAllEvents();
        } else {
            results = iEventDao.findEventsByString(search);
        }
        for (Event item : results) {
            String img = item.getImg();
            img = "/space_adventures/resources/img/" + img;
            item.setImg(img);
        }
    return results;
    }

}