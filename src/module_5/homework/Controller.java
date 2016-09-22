package module_5.homework;

import java.util.ArrayList;
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

        Room[] resultBooking = apis[0].findRooms(price, persons, hotel, city);
        Room[] resultGoogle = apis[1].findRooms(price, persons, hotel, city);
        Room[] resultTripAdvisor = apis[2].findRooms(price, persons, hotel, city);

        Room[] resultOfRequest = concat(resultBooking, resultGoogle, resultTripAdvisor);

        DAOImpl daoImpl = new DAOImpl();

        for (Room rooms : resultOfRequest) {
            daoImpl.save(rooms);
        }

        return resultOfRequest;
    }

    private Room[] concat(Room[] rooms1, Room[] rooms2, Room[] rooms3) {
        Room[] resultRooms = new Room[getLength(rooms1) + getLength(rooms2) + getLength(rooms3)];

        if (rooms1.length == 0 && rooms2.length == 0 && rooms3.length == 0) {
            System.out.println("Sorry, there is no result with such params.");
        }else if(rooms1.length == 0 && rooms2.length == 0){
            System.arraycopy(rooms3, 0, resultRooms, 0, rooms3.length);
        }else if(rooms1.length == 0 && rooms3.length == 0){
            System.arraycopy(rooms2, 0, resultRooms, 0, rooms2.length);
        }else if(rooms1.length == 0){
            System.arraycopy(rooms2, 0, resultRooms, 0, rooms2.length);
            System.arraycopy(rooms3, 0, resultRooms, rooms2.length, rooms3.length);
        }else if(rooms2.length == 0 && rooms3.length == 0){
            System.arraycopy(rooms1, 0, resultRooms, 0, rooms1.length);
        }else if(rooms2.length == 0){
            System.arraycopy(rooms1, 0, resultRooms, 0, rooms1.length);
            System.arraycopy(rooms3, 0, resultRooms, rooms1.length, rooms3.length);
        }else if(rooms3.length == 0){
            System.arraycopy(rooms1, 0, resultRooms, 0, rooms1.length);
            System.arraycopy(rooms2, 0, resultRooms, rooms1.length, rooms2.length);
        }else{
            System.arraycopy(rooms1, 0, resultRooms, 0, rooms1.length);
            System.arraycopy(rooms2, 0, resultRooms, rooms1.length, rooms2.length);
            System.arraycopy(rooms3, 0, resultRooms, rooms1.length + rooms2.length, rooms3.length);
        }
        return resultRooms;
    }

    private int getLength(Room[] rooms){
        int roomsLength = 0;
        if (rooms.length != 0) roomsLength = rooms.length;
        return roomsLength;
    }

    public Room[] check(API api1, API api2){
        Room[] roomsFromAPI1 = api1.getAllRooms();
        Room[] roomsFromAPI2 = api2.getAllRooms();

        ArrayList<Room> roomsList = new ArrayList<Room>();

        for (Room room : roomsFromAPI1) {
            for (Room room1 : roomsFromAPI2) {
                if (room.equals(room1)) {
                    roomsList.add(room);
                }
            }
        }

        Room[] roomsFind = new Room[roomsList.size()];
        roomsList.toArray(roomsFind);
        return roomsFind;
    }
}
