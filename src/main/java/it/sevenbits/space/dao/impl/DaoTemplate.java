package it.sevenbits.space.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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