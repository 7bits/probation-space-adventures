package it.sevenbits.space.dao;

import it.sevenbits.space.model.Subscription;

import java.util.List;

public interface ISubscriptionDao {

    Subscription addSubscription(final Subscription subscription);

    boolean removeSubscription(final Long id);

    List<Subscription> findAllSubscriptions();

    Subscription findSubscriptionById(final Long id);

    boolean exists(final String email);
}
