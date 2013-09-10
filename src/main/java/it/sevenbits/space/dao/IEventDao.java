package it.sevenbits.space.dao;

import it.sevenbits.space.model.Event;

import java.util.List;

public interface IEventDao {

    Event addEvent(final Event event);

    boolean removeEvent(final Long id);

    List<Event> findAllEvents();

    Event findEventById(final Long id);
}
