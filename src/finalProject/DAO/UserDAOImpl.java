package finalProject.DAO;

import finalProject.baseEntity.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserDAOImpl extends AbstractDAOImpl<User> implements UserDAO{

    private static List<User> users = new ArrayList<>();
    private static long nextId = 0;

    private static UserDAOImpl instance;

    public static UserDAOImpl getInstance(){
        if (instance == null){
            instance = new UserDAOImpl();
        }
        return instance;
    }

    @Override
    public User save(User user) {
        user.setId(++nextId);
        users.add(user);
        return user;
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }

    @Override
    public List<User> getAllUsers() {
        Set<User> userSet = new HashSet<>(users);
        List<User> result = new ArrayList<>(userSet);
        if (result.isEmpty()){
            return null;
        }
        return result;
    }
}
