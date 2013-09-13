package it.sevenbits.space.dao;

import it.sevenbits.space.domain.Subscription;

import java.util.List;

public interface ISubscriptionDao {

    /**
     * Saves subscription information in an repository.
     * @param subscription an POJO to save.
     * @return saved Object if success, null else.
     */
    Subscription addSubscription(final Subscription subscription);

    /**
     * Removes subscription from an repository.
     * @param id subscription primary key.
     * @return true if success, false else.
     */
    boolean removeSubscription(final Long id);

    /**
     * Makes a List of all saved subscriptions.
     * @return List of subscriptions.
     */
    List<Subscription> findAllSubscriptions();

    /**
     * Finds an subscription by id.
     * @param id subscription primary key.
     * @return Subscription if success, null else.
     */
    Subscription findSubscriptionById(final Long id);

    /**
     * Checks if subscription with that email exists in an repository.
     * @param email subscription email.
     * @return true if success, false else.
     */
    boolean exists(final String email);
}
