package module_8.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DAOImpl<User> userDAO = new DAOImpl<User>();
        UserDAOImpl userDAOImpl1 = new UserDAOImpl();

        List<User> users = new ArrayList<>();
        users.add(new User("Logan"));
        users.add(new User("Victor"));
        users.add(new User("Rachel"));
        users.add(new User("Tomas"));
        users.add(new User("Valter"));
        users.add(new User("Bruce"));
        users.add(new User("Clark"));

        System.out.println(userDAO.save(users.get(0)));
        userDAO.saveAll(users);
        System.out.println(userDAOImpl1.save(users.get(1)));
    }
}
