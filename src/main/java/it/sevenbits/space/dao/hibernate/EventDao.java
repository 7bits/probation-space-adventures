package it.sevenbits.space.dao.hibernate;

import it.sevenbits.space.dao.IEventDao;
import it.sevenbits.space.model.Event;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class EventDao extends DaoTemplate implements IEventDao {

    @Transactional
    @Override
    public void addEvent(final Event event) {
        getEntityManager().persist(event);
    }

    @Transactional
    @Override
    public List<Event> findAllEvents() {

        EntityManager entityManager = this.getEntityManager();

        if (entityManager != null) {
            TypedQuery<Event> query  = entityManager.createQuery("select e from Event e ", Event.class);
            List<Event> results = (List<Event>) query.getResultList();
            return results;
        } else {
            return null;
        }
    }

    @Override
    public void removeEvent(Long id) {
        //To Do.
    }

//    @Transactional
//    @Override
//    public List<Event> searchEventByName(final String name) {
//        List<Event> result =
//            getEntityManager().createQuery("select e from Event e where e.name = :name", Event.class).
//                setParameter("name", name).getResultList();
//        return result;
//    }

    @Transactional
    @Override
    public Event findEventById(final Long id) {
        Event result =
            getEntityManager().createQuery("select e from Event e where e.id = :id", Event.class).
                setParameter("id", id).getSingleResult();
        return result;
    }
}
