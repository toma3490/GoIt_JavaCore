package module_7.homework;

import java.util.Comparator;

public class SortByItemNameAndShopIdAndSity implements Comparator<Order> {

    @Override
    public int compare(Order order1, Order order2){
        int result = order1.getItemName().compareTo(order2.getItemName());
        if (result != 0) return result;
        result = order1.getShopIdentificator().compareTo(order2.getShopIdentificator());
        if (result != 0) return result;
        result = order1.getUser().getCity().compareTo(order2.getUser().getCity());
//        return (result != 0) ? (result/Math.abs(result)) : 0;
        return (result != 0) ? result : 0;
    }

}
