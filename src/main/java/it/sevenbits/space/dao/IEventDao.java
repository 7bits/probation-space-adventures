package it.sevenbits.space.dao;

import it.sevenbits.space.model.Event;

import java.util.List;

public interface IEventDao {

    void addEvent(final Event event);

    List<Event> findAllEvents();

    void removeEvent(final Long id);

    Event findEventById(final Long id);
}
