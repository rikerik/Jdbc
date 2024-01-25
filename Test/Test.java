package Test;

import java.util.List;

import DAO.UserDao;
import DAOImpl.UserDaoImpl;
import Model.User;

public class Test {
    public static void main(String[] args) throws Exception {
        UserDao userDao = new UserDaoImpl();

        User newUser = new User("Test2");

        // userDao.addUser(newUser);

        // userDao.delete(2);

        // Get all users
        List<User> userList;

        userList = userDao.getAllUsers();
        // Display users
        System.out.println("All Users:");
        for (User user : userList) {
            System.out.println("ID: " + user.getUserId() + ", Name: " + user.getUserName());
        }

        userDao.getUserById(2);

    }

}
