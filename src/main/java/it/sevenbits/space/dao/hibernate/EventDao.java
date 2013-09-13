package it.sevenbits.space.dao.hibernate;

import it.sevenbits.space.dao.IEventDao;
import it.sevenbits.space.domain.Event;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class EventDao implements IEventDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public Event addEvent(final Event event) {
        entityManager.persist(event);
        entityManager.flush();
        return entityManager.find(Event.class, event.getId());
    }

    @Transactional
    @Override
    public List<Event> findAllEvents() {

        if (entityManager != null) {
            TypedQuery<Event> query  = entityManager.createQuery("select e from Event e ", Event.class);
            List<Event> results = (List<Event>) query.getResultList();
            return results;
        } else {
            return null;
        }
    }

    @Override
    public boolean removeEvent(Long id) {
        //To Do.
        return false;
    }

    @Transactional
    @Override
    public Event findEventById(final Long id) {
        Event result = entityManager.
                createQuery("select e from Event e where e.id = :id", Event.class).
                setParameter("id", id).
                getSingleResult();
        return result;
    }
}
