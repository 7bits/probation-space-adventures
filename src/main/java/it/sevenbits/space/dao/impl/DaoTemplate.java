package it.sevenbits.space.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created with IntelliJ IDEA.
 * User: denis
 * Date: 7/29/13
 * Time: 12:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class DaoTemplate {

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}