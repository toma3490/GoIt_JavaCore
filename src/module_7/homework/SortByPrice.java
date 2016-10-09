package module_7.homework;

import java.util.Comparator;

public class SortByPrice implements Comparator<Order> {

    @Override
    public int compare(Order order1, Order order2) {
        return order2.getPrice() - order1.getPrice();
    }
}
