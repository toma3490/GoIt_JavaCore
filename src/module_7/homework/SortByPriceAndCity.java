package module_7.homework;

import java.util.Comparator;

public class SortByPriceAndCity implements Comparator<Order> {

    @Override
    public int compare(Order order1, Order order2){
        int result = order1.getPrice() - (order2.getPrice());
//        if (result != 0) return (result/Math.abs(result));
        if (result != 0) return result;
        result = order1.getUser().getCity().compareTo(order2.getUser().getCity());
//        return (result != 0) ? (result/Math.abs(result)) : 0;
        return (result != 0) ? result : 0;
    }
}
