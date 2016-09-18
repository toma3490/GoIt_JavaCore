package module_5.homework;

import java.util.Arrays;

public class Controller {
    private API[] apis = new API[3];

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        apis[0] = bookingComAPI;
        apis[1] = googleAPI;
        apis[2] = tripAdvisorAPI;
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel){
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        apis[0] = bookingComAPI;
        apis[1] = googleAPI;
        apis[2] = tripAdvisorAPI;

        Room[] resultBooking = bookingComAPI.findRooms(price, persons, city, hotel);
        Room[] resultGoogle = googleAPI.findRooms(price, persons, city, hotel);
        Room[] resultTripAdvisor = tripAdvisorAPI.findRooms(price, persons, city, hotel);

        Room[] requestRooms = new Room[resultBooking.length + resultGoogle.length + resultTripAdvisor.length];
        requestRooms = resultBooking.;
//        for (API api : apis) {
//            api.findRooms(price, persons, city, hotel);
//        }
        return requestRooms;
    }

    public Room[] check(API api1, API api2){
        return null;
    }
}
