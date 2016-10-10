package module_7.homework;

import module_4.homework.Currency;

public class Order {
    private long id;
    private static long nextId = 0;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

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
}
