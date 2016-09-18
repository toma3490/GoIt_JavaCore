package module_5.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();



//        System.out.println(controller.requestRooms(3000, 3, "Ukraine", "Kiev"));
        controller.requestRooms(3000, 3, "Ukraine", "Kiev");
        System.out.println(Arrays.toString(controller.requestRooms(3000, 3, "Ukraine", "Kiev")));


//        controller.requestRooms(3500, 2, "Khreschatyk", "Kiev");
//        controller.requestRooms(2700, 1, "New", "Polyanutsya");

//        BookingComAPI bookingComAPI = new BookingComAPI();
//        System.out.println(bookingComAPI.toString());

//        System.out.println(controller.toString());
    }
}
