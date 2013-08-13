package it.sevenbits.space.dao;

import it.sevenbits.space.model.Event;

import java.util.List;

public interface IEventDao {
    void create(final Event event);
    List<Event> getAllEvent();
    List<Event> searchEventByName(final String name);
    Event searchEventById(final Long id);
}
