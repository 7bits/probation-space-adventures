package it.sevenbits.space.dao;

import it.sevenbits.space.model.Subscription;

public interface ISubscriptionDao {
    void create(final Subscription subscription);
    boolean exists(final String email);
}
