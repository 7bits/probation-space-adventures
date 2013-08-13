package it.sevenbits.space.dao.impl;

import it.sevenbits.space.dao.ISubscriptionDao;
import it.sevenbits.space.model.Subscription;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class SubscriptionDao extends DaoTemplate implements ISubscriptionDao {

    @Transactional
    @Override
    public void create(final Subscription subscription) {
        getEntityManager().persist(subscription);
    }

    @Transactional
    @Override
    public boolean exists(final String email) {
        EntityManager entityManager = this.getEntityManager();
        List<Subscription> result =
            getEntityManager().createQuery("select s from Subscription s where s.email = :email", Subscription.class).
                setParameter("email", email).getResultList();
        return !result.isEmpty();
    }





}
