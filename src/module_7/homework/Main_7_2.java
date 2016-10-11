package module_7.homework;

import module_4.homework.Currency;

import java.util.*;

public class Main_7_2 {
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

        List<Order> list = new ArrayList<>(12);
        list.add(new Order(1100, Currency.USD, "Lego", "EBay", user1));
        list.add(new Order(3700, Currency.USD, "Bike", "Amazon", user2));
        list.add(new Order(1100, Currency.USD, "Knife", "EBay", user3));
        list.add(new Order(2230, Currency.UAH, "Knife", "Slando", user4));
        list.add(new Order(3700, Currency.USD, "Ski", "OLX", user5));
        list.add(new Order(2300, Currency.USD, "BookReader", "Amazon", user6));
        list.add(new Order(1270, Currency.UAH, "Lego", "EBay", user7));
        list.add(new Order(3700, Currency.USD, "Ski", "SportsDirect", user8));
        list.add(new Order(1200, Currency.UAH, "Vase", "Slando", user9));
        list.add(new Order(2740, Currency.UAH, "Bike", "OLX", user10));
        list.add(new Order(1200, Currency.UAH, "Vase", "Slando", user9));
        list.add(new Order(2740, Currency.UAH, "Bike", "OLX", user10));

//        list.sort(new SortByPrice());
//        System.out.println(list);
//        System.out.println();
//        list.sort(new SortByPriceAndCity());
//        System.out.println(list);
//        System.out.println();
//        list.sort(new SortByItemNameAndShopIdAndCity());
//        System.out.println(list);
//
//        Set<Order> set = new HashSet<>(list);
//        System.out.println("Set____________________________________________________");
//        System.out.println(set);

//        Iterator<Order> iterator = list.iterator();
//        while (iterator.hasNext()){
//            if (iterator.next().getPrice() < 1500){
//                iterator.remove();
//            }
//        }
//
//        System.out.println(list);

//        List<Order> listUSD = new ArrayList<>();
//        List<Order> listUAH = new ArrayList<>();
//        for (Order order : list) {
//            if (order.getCurrency() == Currency.USD) {
//                listUSD.add(order);
//            }else{
//                listUAH.add(order);
//            }
//        }
//
//        System.out.println(listUAH);
//        System.out.println();
//        System.out.println(listUSD);

        Set<Order> set = new TreeSet<>(list);
        List<Order> newList = new ArrayList<>(set);
        List<List<Order>> lists = new ArrayList<>();

        for (Order order : newList) {
            List<Order> temp = new ArrayList<>();
            temp.add(order);
            lists.add(temp);
        }

        System.out.println(lists);
    }
}
