package module_7.homework;

import module_4.homework.Currency;

import java.util.*;

public class Main_7_3 {
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

        System.out.println(set);

        System.out.println(isContain(set, "Petrov"));
        System.out.println(getLargestPrice(set));
        System.out.println(deleteByCurrency(set, Currency.USD));
    }

    private static boolean isContain(Set<Order> set, String lastName){
        boolean isContain = false;
        Iterator<Order> iterator = set.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getUser().getLastName().equals(lastName)){
                isContain = true;
            }
        }
        return isContain;
    }

    private static Order getLargestPrice(Set<Order> set){
        Iterator<Order> iterator = set.iterator();
        Order order = iterator.next();
        double maxPrice = order.getPrice();
        while (iterator.hasNext()){
            if (iterator.next().getPrice() > maxPrice){
//                maxPrice = iterator.next().getPrice();
                order = iterator.next();
            }
        }
        return order;
    }

    private static Set<Order> deleteByCurrency(Set<Order> set, Currency currency){
        Iterator<Order> iterator = set.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getCurrency() == currency){
                iterator.remove();
            }
        }
        return set;
    }
}
