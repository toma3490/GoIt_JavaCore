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
        if (users.size() == 0){
            user.setId(++nextId);
            users.add(user);
        }
        for (int i = 0; i < users.size(); i++) {
            if (!users.contains(user)){
//                if (user.getAge() > AGE)
                    user.setId(++nextId);
                users.add(user);
            }
        }
        return user;
    }

    @Override
    public boolean isRegistered(long userId) {
        boolean isRegistered = false;
        for (User user : users) {
            if (user.getId() == userId){
                isRegistered = true;
            }
        }
        return isRegistered;
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
