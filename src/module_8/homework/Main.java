package module_8.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserAbstractDAOImpl userDAOImpl1 = new UserAbstractDAOImpl();

        List<User> users = new ArrayList<>();
        users.add(new User("Logan"));
        users.add(new User("Victor"));
        users.add(new User("Rachel"));
        users.add(new User("Tomas"));
        users.add(new User("Walter"));
        users.add(new User("Bruce"));
        users.add(new User("Clark"));

        System.out.println(userDAOImpl1.save(users.get(1)));
        userDAOImpl1.saveAll(users);
//        System.out.println(userDAOImpl1.getById(5));
        System.out.println(userDAOImpl1.getList());
        userDAOImpl1.deleteById(6);
        System.out.println(userDAOImpl1.getList());
        userDAOImpl1.delete(users.get(3));
        System.out.println(userDAOImpl1.getList());
        userDAOImpl1.deleteAll(users);
        System.out.println(userDAOImpl1.getList());
    }
}
