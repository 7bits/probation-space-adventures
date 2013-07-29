package it.sevenbits.space.dao.impl;
import it.sevenbits.space.dao.EventDao;
import it.sevenbits.space.model.Event;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class EventDaoImpl extends DaoTemplate implements EventDao{

    @Transactional
    @Override
    public void create(final Event event) {
        getEntityManager().persist(event);
    }
}
