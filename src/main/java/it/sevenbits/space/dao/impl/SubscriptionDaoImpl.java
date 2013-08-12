package it.sevenbits.space.dao.impl;

import it.sevenbits.space.dao.SubscriptionDao;
import it.sevenbits.space.model.Subscription;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class SubscriptionDaoImpl extends DaoTemplate implements SubscriptionDao {


    @Transactional
    @Override
    public void create(final Subscription subscription) {
        getEntityManager().persist(subscription);
    }


    @Transactional
    @Override
    public List<Subscription> getAllSubscription() {


        EntityManager entityManager = this.getEntityManager();

        if (entityManager != null) {
            TypedQuery<Subscription> query  = entityManager.createQuery("select e from Subscription e ", Subscription.class);
            List<Subscription> results = (List<Subscription>) query.getResultList();
            return results;
        } else {

            return null;
        }
    }

    @Transactional
    @Override
    public Subscription searchIdbyEmail(final String email) {
        Subscription result =
                getEntityManager().createQuery("select s from Subscription s where s.email = :email", Subscription.class).
                        setParameter("email", email).getSingleResult();
        return result;
    }

    @Transactional
    @Override
    public String searchEmailbyString(final String email) {
        Subscription result =
                getEntityManager().createQuery("select s from Subscription s where s.email = :email", Subscription.class).
                        setParameter("email", email).getSingleResult();
        return result.getEmail();
    }

    @Transactional
    @Override
    public boolean isInBase(final String email) {
        EntityManager entityManager = this.getEntityManager();
        List<Subscription> result =
                getEntityManager().createQuery("select s from Subscription s where s.email = :email", Subscription.class).
                        setParameter("email", email).getResultList();

        return result.size() == 0;
    }





}
