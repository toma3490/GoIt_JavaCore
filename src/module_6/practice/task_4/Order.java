package module_6.practice.task_4;

import module_6.practice.task_2.User;

public class Order {
    private long id;
    private static long nextId = 1;
    private int price;
    private String itemName;
    private boolean isActive;
    private boolean isDone;

    private User user;

    public Order(int price, String itemName, boolean isActive, boolean isDone) {
        this.price = price;
        this.itemName = itemName;
        this.isActive = isActive;
        this.isDone = isDone;
        setId();
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public long getId() {
        return id;
    }

    public boolean isDone() {
        return isDone;
    }

    public boolean isActive() {

        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Order order = (Order) object;

        if (price != order.price) return false;
        if (isActive != order.isActive) return false;
        if (isDone != order.isDone) return false;
        if (itemName != null ? !itemName.equals(order.itemName) : order.itemName != null) return false;
        return user != null ? user.equals(order.user) : order.user == null;

    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + (isDone ? 1 : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
