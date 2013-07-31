package it.sevenbits.space.dao.impl;

import it.sevenbits.space.dao.EventDao;
import it.sevenbits.space.model.Event;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class EventDaoImpl extends DaoTemplate implements EventDao{




    @Transactional
    @Override
    public void create(final Event event) {
        getEntityManager().persist(event);
    }

    @Transactional
    @Override
    public List<Event> getAllEvent() {


        EntityManager entityManager = this.getEntityManager();

        this.getEntityManager();
        //if(entityManager != null) {
            TypedQuery<Event> query  = entityManager.createQuery("select e from Event e", Event.class);
            List<Event> results = (List<Event>) query.getResultList();
            //List<Event> results = getEntityManager().createQuery("SELECT e FROM Event e where e.id = 1", Event.class).getResultList();
            return results;
        //} else {

            //return null;
        //}
    }


}
