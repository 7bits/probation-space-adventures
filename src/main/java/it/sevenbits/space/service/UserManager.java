package it.sevenbits.space.service;

import java.util.HashMap;

import it.sevenbits.space.domain.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserDetailsService {

    private HashMap<String, User> users;

    public UserManager() {
        users = new HashMap<String, User>();
        users.put("jerry", new User("jerry", "1234", "ROLE_USER"));
        users.put("tom", new User("tom", "2345", "ROLE_USER, ROLE_ADMIN"));
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        if(!users.containsKey(userName)) {
            throw new UsernameNotFoundException(userName + " not found");
        }
        return users.get(userName);
    }
}
