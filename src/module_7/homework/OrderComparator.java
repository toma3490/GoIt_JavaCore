package module_7.homework;

import java.util.Comparator;

public class OrderComparator implements Comparator<Order>{
    private OrderEnum sortingIndex;

    public OrderComparator(OrderEnum sortingIndex) {
        setSortingIndex(sortingIndex);
    }

    public final void setSortingIndex(OrderEnum sortingIndex) {
        if (sortingIndex == null) {
            throw new IllegalArgumentException();
        }
        this.sortingIndex = sortingIndex;
    }

    public OrderEnum getSortingIndex() {
        return sortingIndex;
    }

    @Override
    public int compare(Order order1, Order order2) {
        switch (sortingIndex) {
            case PRICE:
                return order1.getPrice() - order2.getPrice();
            case USER_CITY:
                return order1.getUser().getCity().compareTo(order2.getUser().getCity());
            default:
                throw new EnumConstantNotPresentException(OrderEnum.class,sortingIndex.name());
        }
    }
}
