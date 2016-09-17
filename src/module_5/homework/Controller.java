package module_5.homework;

public class Controller {
    private API apis[] = new API[3];

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        apis[0] = bookingComAPI;
        apis[1] = googleAPI;
        apis[2] = tripAdvisorAPI;
    }

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel){
        int counter = 0;

        for (int i = 0; i < apis.length - 1; i++) {

        }
    }

    public Room[] check(API api1, API api2){

    }
}
