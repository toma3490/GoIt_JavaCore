package module_9.practice;

import module_7.homework.Order;
import module_7.homework.User;

import java.util.*;
import java.util.Currency;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();

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

        List<Order> list = new ArrayList<>(12);
        list.add(new Order(1100, module_4.homework.Currency.USD, "Lego", "EBay", user1));
        list.add(new Order(3700, module_4.homework.Currency.USD, "Bike", "Amazon", user2));
        list.add(new Order(1100, module_4.homework.Currency.USD, "Knife", "EBay", user3));
        list.add(new Order(2230, module_4.homework.Currency.UAH, "Knife", "Slando", user4));
        list.add(new Order(3700, module_4.homework.Currency.USD, "Ski", "OLX", user5));
        list.add(new Order(2300, module_4.homework.Currency.USD, "BookReader", "Amazon", user6));
        list.add(new Order(1270, module_4.homework.Currency.UAH, "Lego", "EBay", user7));
        list.add(new Order(3700, module_4.homework.Currency.USD, "Ski", "SportsDirect", user8));
        list.add(new Order(1200, module_4.homework.Currency.UAH, "Vase", "Slando", user9));
        list.add(new Order(2740, module_4.homework.Currency.UAH, "Bike", "OLX", user10));
        list.add(new Order(1200, module_4.homework.Currency.UAH, "Vase", "Slando", user9));
        list.add(new Order(2740, module_4.homework.Currency.UAH, "Bike", "OLX", user10));

//        System.out.println(separateOrdersJava8(orderList));
        System.out.println(list);

        System.out.println(separateOrdersList(list));
    }

    private static List<List<Order>> separateOrdersList(List<Order> orders) {
        Set<Order> set = new HashSet<>(orders);
        //Set<Order> set = new TreeSet<>(orders);
        //int count = set.size();

        List<List<Order>> resListGeneral = new ArrayList<>();
        for (Order order : set) {
            List<Order> resList = new ArrayList<>();
            for (Order listOrder : orders) {
                if (order.getUser().getCity().equals(listOrder.getUser().getCity())) {
                    resList.add(listOrder);
                }
            }
            resListGeneral.add(resList);
        }

        return resListGeneral;
    }

    private Map<String, List<Order>> separateOrders(List<Order> orders) {
        Set<Order> set = new HashSet<>(orders);
        //Set<Order> set = new TreeSet<>(orders);
        //int count = set.size();

        Map<String, List<Order>> resMap = new HashMap<>();
        for (Order order : set) {
            List<Order> resList = new ArrayList<>();
            for (Order listOrder : orders) {
                if (order.getUser().getCity().equals(listOrder.getUser().getCity())) {
                    resList.add(listOrder);
                }
            }
            resMap.put(order.getUser().getCity(), resList);
        }


        return resMap;
    }

    private static List<List<Order>> separateOrdersJava8(List<Order> orders) {
        Set<Order> set = new HashSet<>(orders);

        Function<Order, List<Order>> f = new Function<Order, List<Order>>() {
            @Override
            public List<Order> apply(Order order) {
                return set.stream()
                        .filter(o -> o.getUser().getCity().equals(order.getUser().getCity()))
                        .collect(Collectors.toList());

            }
        };

        List<List<Order>> res =  orders.stream()
                .map(f)
                .collect(Collectors.toList());
        return res;
    }
}
