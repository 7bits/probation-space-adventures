package it.sevenbits.space.dao;

import it.sevenbits.space.domain.User;

import java.util.List;

public interface IUserDao {

    /**
     * Saves user's information in an repository.
     * @param user an POJO to save.
     * @return saved Object if success, null else.
     */
    User addUser(final User user);

    /**
     * Removes user from an repository.
     * @param id user primary key.
     * @return true if success, false else.
     */
    boolean removeUser(final Long id);

    /**
     * Updates user.
     * @param user
     * @return
     */
    User updateUser(final User user);

    /**
     * Makes a List of all saved users.
     * @return List of users.
     */
    List<User> findAllUsers();

    /**
     * Finds an user by id.
     * @param id user primary key.
     * @return Event if success, null else.
     */
    User findUserById(final Long id);

    /**
     * Finds an user by his name.
     * @param username user's name.
     * @return Event if success, null else.
     */
    User findUserByUsername(final String username);

    /**
     * Finds an user by his email.
     * @param email user's email.
     * @return Event if success, null else.
     */
    User findUserByEmail(final String email);

    /**
     * Finds an user by his activation code.
     * @param activationCode user's activation code.
     * @return Event if success, null else.
     */
    User findUserByActivationCode(final String activationCode);
}
