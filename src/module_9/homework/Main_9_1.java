package module_9.homework;

import module_4.homework.Currency;

import java.util.*;
import java.util.stream.Collectors;

public class Main_9_1 {
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

        Collections.sort(list, (order1, order2) -> order2.getPrice() - order1.getPrice());
        list.forEach(System.out::println);

        sortByPriceAndCity(list);

        sortByItemNameAndShopIdAndCity(list);

        deleteDuplicates(list);

        filterPrice(list);

        splitListByCurrency(list);

        splitByUniqueCities(list);
    }

    private static void sortByPriceAndCity(List<Order> list) {
        list.sort((order1, order2)-> {
            int result = order1.getPrice() - order2.getPrice();
            if (result == 0) result = order1.getUser().getCity().compareTo(order2.getUser().getCity());
            return result;
        });
        list.forEach(System.out::println);
    }

    private static void sortByItemNameAndShopIdAndCity(List<Order> list) {
        list.sort((order1, order2) -> {
            int result = order1.getItemName().compareTo(order2.getItemName());
            if (result == 0) result = order1.getShopIdentificator().compareTo(order2.getShopIdentificator());
            if (result == 0) result = order1.getUser().getCity().compareTo(order2.getUser().getCity());
            return result;
        });
        list.forEach(System.out::println);
    }

    private static void deleteDuplicates(List<Order> list){
        list = list.stream().distinct().collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    private static void filterPrice(List<Order> list) {
        list = list.stream().filter(order -> order.getPrice() >= 1500).collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    private static void splitListByCurrency(List<Order> list) {
        List<Order> listUSD = list.stream().filter(order -> order.getCurrency() == Currency.USD).collect(Collectors.toList());
        List<Order> listUAH = list.stream().filter(order -> order.getCurrency() == Currency.UAH).collect(Collectors.toList());
        listUSD.forEach(System.out::println);
        System.out.println();
        listUAH.forEach(System.out::println);
    }

    private static void splitByUniqueCities(List<Order> list) {
        Map<String, List<Order>> cityLists = list
                .stream()
                .collect(Collectors.groupingBy(o -> o.getUser().getCity()));
        Map<String, List<Order>> sortedMap = new TreeMap<>(cityLists);
        sortedMap.forEach((s, order1) -> System.out.format("%s: %s\n", s, order1));
    }
}
