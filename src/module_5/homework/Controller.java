package module_5.homework;

import com.sun.deploy.util.ArrayUtil;

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

    public Room[] requestRooms(int price, int persons, String hotel, String city){
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        Room[] resultBooking = bookingComAPI.findRooms(price, persons, hotel, city);
        Room[] resultGoogle = googleAPI.findRooms(price, persons, hotel, city);
        Room[] resultTripAdvisor = tripAdvisorAPI.findRooms(price, persons, hotel, city);

        Room[] resultOfRequest = concat(resultBooking, resultGoogle, resultTripAdvisor);

//        DAOImpl daoImpl = new DAOImpl();
//
//        for (Room rooms : resultOfRequest) {
//            daoImpl.save(rooms);
//        }

        return resultOfRequest;
    }

    public Room[] concat(Room[] rooms1, Room[] rooms2, Room[] rooms3) {
        Room[] resultRooms = new Room[rooms1.length + rooms2.length + rooms3.length];
        System.arraycopy(rooms1, 0, resultRooms, 0, rooms1.length);
        System.arraycopy(rooms2, 0, resultRooms, rooms1.length, rooms2.length);
        System.arraycopy(rooms3, 0, resultRooms, rooms2.length, rooms3.length);
        return resultRooms;
    }

    public Room[] check(API api1, API api2){
        Room[] roomsFromAPI1 = api1.getAllRooms();
        Room[] roomsFromAPI2 = api2.getAllRooms();

        int countRooms = 0;

        for (int i = 0; i < roomsFromAPI1.length - 1; i++) {
            if(roomsFromAPI1[i].equals(roomsFromAPI2)){
                countRooms++;
            }
        }

        Room[] resultRooms = new Room[countRooms];

        for (int i = 0; i < roomsFromAPI1.length - 1; i++) {
            if(roomsFromAPI1[i].equals(roomsFromAPI2)){
                resultRooms[i] = roomsFromAPI1[i];
            }
        }

        return resultRooms;
    }
}
