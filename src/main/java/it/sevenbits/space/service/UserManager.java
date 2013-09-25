package it.sevenbits.space.service;

import it.sevenbits.space.dao.IUserDao;
import it.sevenbits.space.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserDetailsService {

    @Autowired
    private IUserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userDao.findUserByUsername(username);

        if(user == null) {
            throw new UsernameNotFoundException(username + " not found");
        }
        return user;
    }

    public void activateUser(final String activationCode) {

        User user = userDao.findUserByActivationCode(activationCode);
        if (user != null) {
            user.setActivated(true);
            user.setActivationCode(null);
            userDao.updateUser(user);
        }
    }
}
