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
}
