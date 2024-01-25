package DAO;

import java.util.List;

import Model.User;

public interface UserDao {
    void addUser(User user) throws ClassNotFoundException;

    User getUserById(int userId) throws ClassNotFoundException;

    List<User> getAllUsers() throws Exception;

    void update(User user);

    void delete(int i) throws ClassNotFoundException;

}
