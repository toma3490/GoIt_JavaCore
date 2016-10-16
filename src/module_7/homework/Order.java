package module_7.homework;

import module_4.homework.Currency;

import java.util.Comparator;

public class Order implements Comparable<Order>{
    private long id;
    private static long nextId = 0;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;
    private OrderEnum sortingIndex;

    public Order(int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
        id = ++nextId;
    }

    public int getPrice() {

        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getItemName() {
        return itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    @Override
    public int compareTo(Order otherOrder) {
    switch (sortingIndex) {
        case PRICE:
            return this.getPrice() - otherOrder.getPrice();
        case USER_CITY:
            return this.getUser().getCity().compareTo(otherOrder.getUser().getCity());
        default:
            throw new EnumConstantNotPresentException(OrderEnum.class,sortingIndex.name());
        }
//        return this.getUser().getCity().compareTo(otherOrder.getUser().getCity());
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Order order = (Order) object;

        if (price != order.price) return false;
        if (currency != order.currency) return false;
        if (itemName != null ? !itemName.equals(order.itemName) : order.itemName != null) return false;
        if (shopIdentificator != null ? !shopIdentificator.equals(order.shopIdentificator) : order.shopIdentificator != null)
            return false;
        return user != null ? user.equals(order.user) : order.user == null;

    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (shopIdentificator != null ? shopIdentificator.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return '\n' + "Order{" +
                "id=" + id +
                ", price=" + price +
                ", currency=" + currency +
                ", itemName='" + itemName + '\'' +
                ", shopIdentificator='" + shopIdentificator + '\'' +
                ", user=" + user.toString() +
                '}';
    }

    public static class PriceComparator implements Comparator<Order> {
        @Override
        public int compare(Order order1, Order order2) {
            return order1.getPrice() - order2.getPrice();
        }
    }

    public static class UserCityComparator implements Comparator<Order> {
        @Override
        public int compare(Order order1, Order order2) {
            return order1.getUser().getCity().compareTo(order2.getUser().getCity());
        }
    }
}
