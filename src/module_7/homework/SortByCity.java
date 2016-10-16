package module_7.homework;

import java.util.Comparator;

public class SortByCity implements Comparator<Order> {
    @Override
    public int compare(Order order1, Order order2) {
        return order1.getUser().getCity().compareTo(order2.getUser().getCity());
    }
}
