package module_7.practice.task_1;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class UserTester {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>();
        ArrayList<User> usersList = new ArrayList<>();

        users.add(new User("John", 15));
        users.add(new User("Tom", 25));
        users.add(new User("Ann", 21));
        users.add(new User("Gabriel", 42));
        users.add(new User("Kelly", 32));
        users.add(new User("Tyler", 35));
        users.add(new User("Helen", 18));
        users.add(new User("Kaleb", 4));
        users.add(new User("Mark", 29));
        users.add(new User("Mark", 29));

//        System.out.println(users.toString());

        usersList.add(new User("John", 15));
        usersList.add(new User("Tom", 25));
        usersList.add(new User("Ann", 21));
        usersList.add(new User("Gabriel", 42));
        usersList.add(new User("Kelly", 32));
        usersList.add(new User("Tyler", 35));
        usersList.add(new User("Helen", 18));
        usersList.add(new User("Kaleb", 4));
        usersList.add(new User("Mark", 29));

        usersList.sort(new IncreaseAge());
        System.out.println(usersList);

    }
}
