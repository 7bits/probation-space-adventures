package it.sevenbits.space.dao;

import it.sevenbits.space.model.Subscription;

import java.util.List;

public interface ISubscriptionDao {

    void addSubscription(final Subscription subscription);

    List<Subscription> findAllSubscriptions();

    void removeSubscription(final Long id);

    Subscription findSubscriptionById(final Long id);

    boolean exists(final String email);
}
