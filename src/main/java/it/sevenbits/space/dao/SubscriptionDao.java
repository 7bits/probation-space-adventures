package it.sevenbits.space.dao;

import it.sevenbits.space.model.Subscription;

import java.util.List;

public interface SubscriptionDao {

    public void create(final Subscription subscription);
    public List<Subscription> getAllSubscription();
}
