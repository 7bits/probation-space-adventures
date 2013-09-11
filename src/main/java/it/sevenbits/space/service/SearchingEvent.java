package it.sevenbits.space.service;

import it.sevenbits.space.model.Event;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: alexey
 * Date: 10.09.13
 * Time: 14:01
 * To change this template use File | Settings | File Templates.
 */

public class SearchingEvent {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Event> searchEvent(String searchingText) {
        if (entityManager != null) {
            TypedQuery<Event> query  = entityManager.createQuery("select e from Event e where e like '%searchingText%'", Event.class);
            List<Event> events = (List<Event>) query.getResultList();
            return events;
        } else {
            return null;
        }
    }
}







