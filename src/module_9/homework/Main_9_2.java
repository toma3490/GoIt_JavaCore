package module_9.homework;

import module_4.homework.Currency;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.Collectors;

public class Main_9_2 {
    public static void main(String[] args) {
        User user1 = new User("James", "Bond", "London", 5000);
        User user2 = new User("Clark", "Kent", "Moscow", 3000);
        User user3 = new User("Bruce", "Wayne", "Gotham", 7500);
        User user4 = new User("Van", "Helsing", "Kiev", 1000);
        User user5 = new User("Kenuichio", "Harada", "Tokyo", 2500);
        User user6 = new User("Amiko", "Kobayashi", "Tokyo", 3500);
        User user7 = new User("Thomas", "Anderson", "Kiev", 1500);
        User user8 = new User("Allan", "Quatermain", "London", 2300);
        User user9 = new User("Tom", "Sawyer", "San Fransisco", 700);
        User user10 = new User("Lisbeth", "Salander", "Stockholm", 5200);

        Set<Order> set = new TreeSet<>();
        set.add(new Order(1100, Currency.USD, "Lego", "EBay", user1));
        set.add(new Order(3900, Currency.USD, "Bike", "Amazon", user2));
        set.add(new Order(1100, Currency.USD, "Knife", "EBay", user3));
        set.add(new Order(2230, Currency.UAH, "Knife", "Slando", user4));
        set.add(new Order(3700, Currency.USD, "Ski", "OLX", user5));
        set.add(new Order(2300, Currency.USD, "BookReader", "Amazon", user6));
        set.add(new Order(1270, Currency.UAH, "Lego", "EBay", user7));
        set.add(new Order(3700, Currency.USD, "Ski", "SportsDirect", user8));
        set.add(new Order(1200, Currency.UAH, "Vase", "Slando", user9));
        set.add(new Order(2740, Currency.UAH, "Bike", "OLX", user10));
        set.add(new Order(1200, Currency.UAH, "Vase", "Slando", user9));
        set.add(new Order(2740, Currency.UAH, "Bike", "OLX", user10));

        set.forEach(System.out::println);

        isContain(set, "Petrov");

        deleteByCurrency(set, Currency.USD);
    }



    private static void isContain(Set<Order> set, String lastName){
        set.stream()
                .filter(order -> order.getUser().getLastName().equals("Petrov"))
                .forEach(System.out::println);
    }

    private static void deleteByCurrency(Set<Order> set, Currency currency){
        set = set.stream().filter(order -> order.getCurrency() != currency).collect(Collectors.toSet());
        set.forEach(System.out::println);
    }
}
