package it.sevenbits.space.dao.hibernate;

import it.sevenbits.space.dao.ISubscriptionDao;
import it.sevenbits.space.model.Subscription;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SubscriptionDao implements ISubscriptionDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public Subscription addSubscription(final Subscription subscription) {
        entityManager.persist(subscription);
        entityManager.flush();
        return entityManager.find(Subscription.class, subscription.getId());
    }

    @Override
    public List<Subscription> findAllSubscriptions() {
        return null;  //To Do.
    }

    @Override
    public boolean removeSubscription(Long id) {
        //To Do.
        return false;
    }

    @Transactional
    @Override
    public Subscription findSubscriptionById(Long id) {
        Subscription result = entityManager.
                createQuery("select s from Subscription s where s.id = :id", Subscription.class).
                setParameter("id", id).
                getSingleResult();
        return result;
    }

    @Transactional
    @Override
    public boolean exists(final String email) {
        List<Subscription> result = entityManager.
                createQuery("select s from Subscription s where s.email = :email", Subscription.class).
                setParameter("email", email).
                getResultList();
        return !result.isEmpty();
    }
}
