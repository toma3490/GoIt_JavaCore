package module_7.warmUp;

import module_7.practice.task_1.User;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class WarmUp_4 {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>();
//    ArrayList<User> usersList = new ArrayList<>();

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

//        System.out.println(users);

        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()){
            if (iterator.next().getAge() < 25){
                iterator.remove();
            }
        }

        System.out.println(users);
    }




}
