package it.sevenbits.space.dao.hibernate;

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
    public void addSubscription(final Subscription subscription) {
        getEntityManager().persist(subscription);
    }

    @Override
    public List<Subscription> findAllSubscriptions() {
        return null;  //To Do.
    }

    @Override
    public void removeSubscription(Long id) {
        //To Do.
    }

    @Override
    public Subscription findSubscriptionById(Long id) {
        return null;  //To Do.
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
