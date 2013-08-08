package it.sevenbits.space.dao;

import it.sevenbits.space.model.Event;

import java.util.List;

public interface EventDao {
    public void create(final Event event);

    public List<Event> getAllEvent();

    public List<Event> searchEventByName(String name);

    public Event searchEventById(Long id);
}
