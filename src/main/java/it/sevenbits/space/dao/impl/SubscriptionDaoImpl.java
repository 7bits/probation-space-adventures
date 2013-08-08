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

        if(entityManager != null) {
            TypedQuery<Subscription> query  = entityManager.createQuery("select e from subscription e ", Subscription.class);
            List<Subscription> results = (List<Subscription>) query.getResultList();
            return results;
        } else {

            return null;
        }
    }

    @Transactional
    @Override
    public Long searchIdbyEmail(String email){
        Subscription result =
                getEntityManager().createQuery("select e from subscription e where e.email = :email", Subscription.class).
                        setParameter("email", email).getSingleResult();
        return result.getId();
    }


}
