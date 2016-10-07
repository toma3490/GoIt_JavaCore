package module_7.homework.hw_mod_5_update;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        System.out.println("Request rooms");
        System.out.println("____________________________________________________________________________");
        System.out.println(controller.requestRooms(3000, 3, "Ukraine", "Kiev"));
        System.out.println(controller.requestRooms(3500, 2, "Khreschatyk", "Kiev"));
        System.out.println(controller.requestRooms(2700, 1, "New", "Polyanutsya"));
        System.out.println("____________________________________________________________________________" + '\n');

        System.out.println("Check rooms on API");
        System.out.println("____________________________________________________________________________");
        System.out.println(controller.check(bookingComAPI, googleAPI));
        System.out.println(controller.check(bookingComAPI, tripAdvisorAPI));
        System.out.println(controller.check(googleAPI, tripAdvisorAPI));

    }
}
