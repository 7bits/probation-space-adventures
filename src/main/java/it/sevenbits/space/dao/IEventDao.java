package it.sevenbits.space.dao;

import it.sevenbits.space.domain.Event;

import java.util.List;

public interface IEventDao {

    /**
     * Saves event information in an repository.
     * @param event an POJO to save.
     * @return saved Object if success, null else.
     */
    Event addEvent(final Event event);

    /**
     * Removes event from an repository.
     * @param id event primary key.
     * @return true if success, false else.
     */
    boolean removeEvent(final Long id);

    /**
     * Makes a List of all saved events.
     * @return List of events.
     */
    List<Event> findAllEvents();

    /**
     * Finds an event by id.
     * @param id event primary key.
     * @return Event if success, null else.
     */
    Event findEventById(final Long id);
}
