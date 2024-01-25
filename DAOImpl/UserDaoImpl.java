package DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.UserDao;
import DB.DbConnector;
import Model.User;

public class UserDaoImpl implements UserDao {

    @Override
    public void addUser(User user) throws ClassNotFoundException {
        String sql = "INSERT INTO users (user_name)" + "VALUES (?)";

        try (Connection con = DbConnector.getConnection();
                PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            preparedStatement.setString(1, user.getUserName());

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Insertion failed, no rows affected.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public User getUserById(int userId) throws ClassNotFoundException {

        User user = null;

        String sql = "SELECT user_id, user_name WHERE user_id = ?";
        try (Connection conn = DbConnector.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(sql);) {
            preparedStatement.setInt(1, 1);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("user_id");
                String name = rs.getString("user_name");

                user = new User();

            }
        }

        catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public List<User> getAllUsers() throws ClassNotFoundException {
        List<User> userList = new ArrayList<User>();
        String sql = "SELECT * FROM users";

        try (Connection con = DbConnector.getConnection();
                PreparedStatement preparedStatement = con.prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery()) {

            while (rs.next()) {
                User user = new User();
                user.setUserId(rs.getInt("user_id"));
                user.setUserName(rs.getString("user_name"));

                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public void update(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(int id) throws ClassNotFoundException {
        String sql = "DELETE FROM users WHERE user_id = ?";

        int affectedrows = 0;

        try (Connection conn = DbConnector.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);

            affectedrows = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
