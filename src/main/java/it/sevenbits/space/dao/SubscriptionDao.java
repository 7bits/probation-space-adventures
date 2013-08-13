package it.sevenbits.space.dao;

import it.sevenbits.space.model.Subscription;

import java.util.List;

public interface SubscriptionDao {
    void create(final Subscription subscription);
    List<Subscription> getAllSubscription();
    Subscription fetchByEmail(final String Email);
    String fetchByString(final String email);
    boolean exist(final String email);
}
