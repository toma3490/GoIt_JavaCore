package module_5.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        System.out.println(Arrays.toString(controller.requestRooms(3000, 3, "Ukraine", "Kiev")) + '\n');
        System.out.println(Arrays.toString(controller.requestRooms(3500, 2, "Khreschatyk", "Kiev")) + '\n');
        System.out.println(Arrays.toString(controller.requestRooms(2700, 1, "New", "Polyanutsya")) + '\n');

        System.out.println(Arrays.toString(controller.check(bookingComAPI, googleAPI)));
        System.out.println(Arrays.toString(controller.check(bookingComAPI, tripAdvisorAPI)));
        System.out.println(Arrays.toString(controller.check(googleAPI, tripAdvisorAPI)));

    }
}
