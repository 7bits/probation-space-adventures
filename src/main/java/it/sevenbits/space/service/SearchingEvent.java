package it.sevenbits.space.service;

import it.sevenbits.space.model.Event;

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