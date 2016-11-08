package finalProject.DAO;

import finalProject.baseEntity.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    boolean isRegistered(long userId);
}
