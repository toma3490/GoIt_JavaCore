package module_6.practice.task_4;

public class ArrayUtils {
    static Order[] check (Order[] ar1, Order[] ar2){
        int count = 0;
        for (Order order1 : ar1) {
            for (Order order2 : ar2) {
                if (order1.getId() == order2.getId()) count++;
            }
        }

        Order[] res = new Order[count];

        int index = 0;
        for (Order order1 : ar1) {
            for (Order order2 : ar2) {
                if (order1.getId() == order2.getId()){
                    res[index] = order1;
                    index++;
                }
            }
        }
        return res;
    }

//    static Order[] unique(Order[] orders){
//        return null;
//    }

    public Order[] isActive(Order[] orders){
        Order[] ordersActive = new Order[orders.length];

        int index = 0;

        for (Order order : ordersActive) {
            if (order.isActive() && order.isDone()){
                ordersActive[index++] = order;
            }
        }
        return deleteEmpty(orders);
    }

    private Order[] deleteEmpty(Order[] orders) {
        return null; //Write logic
    }
}
