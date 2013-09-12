package it.sevenbits.space.service;

import it.sevenbits.space.model.Event;
import it.sevenbits.space.web.form.SearchEventForm;
import org.springframework.beans.factory.annotation.Autowired;
import it.sevenbits.space.dao.IEventDao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: alexey
 * Date: 10.09.13
 * Time: 14:01
 * To change this template use File | Settings | File Templates.
 */

public class SearchingEvent {
    @PersistenceContext          //предназаначена для автоматического связывания менеджера сущностей с бином.
    private EntityManager entityManager;

    @Autowired
    private IEventDao IEventDao;

    SearchingEvent searchingEvent = new SearchingEvent();
    SearchEventForm searchEventForm = new SearchEventForm();

    public List <Event> FindCustomEvent (/*@RequestParam(value = "search", required = false) boolean search*/){


        List<Event> results  = null;

       /* if (search == true){
            results = searchingEvent.findEvents(searchEventForm.getName());
        } else {       */
            results = IEventDao.findAllEvents();
       // }

        for (Event item : results) {
            String img = item.getImg();
            img = "/space_adventures/resources/img/" + img;
            item.setImg(img);
        }

    return results;

    }

    public List<Event> findEvents(final String searchingText) {
        List<Event> results = new LinkedList<Event>();
        if (entityManager != null) {
            //выбираем элементы списка, совпадающие с текстом, занесённым в форму поиска. для экронирования используем setParameter
            TypedQuery<Event> query  = entityManager.createQuery("select e from Event e where e like '%:queryString%'", Event.class).setParameter("queryString", searchingText);
            results = (List<Event>) query.getResultList();
        }
        return results;
    }


}


