package module_6.practice.task_4;

public class ArrayUtilsMain {
    public static void main(String[] args) {
        Order order1 = new Order(100, "bicycle", true, false);
        Order order2 = new Order(100, "phone", true, false);
        Order order3 = new Order(100, "phone", true, false);

        Order[] ar1 = {order1};
        Order[] ar2 = {order1, order2, order3};

        System.out.println(ArrayUtils.check(ar1, ar2).length);
    }
}
