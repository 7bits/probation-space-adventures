package it.sevenbits.space.dao.impl;

import it.sevenbits.space.dao.SubscriptionDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: denis
 * Date: 7/24/13
 * Time: 10:54 AM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class SubscriptionDaoImpl implements SubscriptionDao {

    //private DataSource dataSource;

    @Transactional
    @Override
    public void create(String email) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

}
