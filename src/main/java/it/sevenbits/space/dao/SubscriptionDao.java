package it.sevenbits.space.dao;

import it.sevenbits.space.model.Subscription;

import java.util.List;

public interface SubscriptionDao {

    public void create(final Subscription subscription);
    public List<Subscription> getAllSubscription();
    public Subscription searchIdbyEmail(final String Email);
    public String searchEmailbyString(final String email);
    public boolean isInBase(final String email);
}
