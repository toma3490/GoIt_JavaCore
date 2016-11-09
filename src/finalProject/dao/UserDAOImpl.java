package finalProject.dao;

import finalProject.baseEntity.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserDAOImpl extends AbstractDAOImpl<User> implements UserDAO{

    private static List<User> users = new ArrayList<>();
    private static long nextId = 0;
    private final int MIN_AGE = 18;
    private final int MAX_AGE = 120;

    private static UserDAOImpl instance;

    public static UserDAOImpl getInstance(){
        if (instance == null){
            instance = new UserDAOImpl();
        }
        return instance;
    }

    private boolean checkAge(User user){
        boolean permission = true;
        if (user.getAge() < MIN_AGE || user.getAge() > MAX_AGE){
            permission = false;
        }
        return permission;
    }

    @Override
    public User save(User user) {
        if (checkAge(user) && users.size() == 0){
            user.setId(++nextId);
            users.add(user);
        }
        for (int i = 0; i < users.size(); i++) {
            if (checkAge(user) && !users.contains(user)){
                    user.setId(++nextId);
                users.add(user);
            }
        }
        return user;
    }

    @Override
    public boolean isRegistered(long userId) {
        for (User user : users) {
            if (user.getId() == userId){
                return user.isRegistered();
            }
        }
        return false;
    }

    @Override
    public User getById(long id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
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
