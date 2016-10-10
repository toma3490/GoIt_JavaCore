package module_7.homework.hw_mod_5_update;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<API> apis = new ArrayList<>(3);

    public Controller() {
        apis.add(new BookingComAPI());
        apis.add(new GoogleAPI());
        apis.add(new TripAdvisorAPI());
    }

    public List<List<Room>> requestRooms(int price, int persons, String hotel, String city){
        List<List<Room>> resultOfRequest = new ArrayList<>();

        List<Room> resultBooking = apis.get(0).findRooms(price, persons, hotel, city);
        List<Room> resultGoogle = apis.get(1).findRooms(price, persons, hotel, city);
        List<Room> resultTripAdvisor = apis.get(2).findRooms(price, persons, hotel, city);

        if (!resultBooking.isEmpty()){
            resultOfRequest.add(resultBooking);
        }
        if (!resultGoogle.isEmpty()){
            resultOfRequest.add(resultGoogle);
        }
        if (!resultTripAdvisor.isEmpty()){
            resultOfRequest.add(resultTripAdvisor);
        }
        if (resultOfRequest.isEmpty()){
            System.out.println("Sorry, there is no result with such params.");
        }

        DAOImpl daoImpl = new DAOImpl();

        for (int i = 0; i < resultOfRequest.size(); i++) {
            daoImpl.save(resultOfRequest.get(i));
        }

        return resultOfRequest;
    }

    public List<Room> check(API api1, API api2){
        List<Room> roomsFromAPI1 = api1.getAllRooms();
        List<Room> roomsFromAPI2 = api2.getAllRooms();

        ArrayList<Room> roomsList = new ArrayList<Room>();

        for (Room room : roomsFromAPI1) {
            for (Room room1 : roomsFromAPI2) {
                if (room.equals(room1)) {
                    roomsList.add(room);
                }
            }
        }

        return roomsList;
    }
}
