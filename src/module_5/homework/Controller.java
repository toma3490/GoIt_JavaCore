package module_5.homework;

import java.util.ArrayList;

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



//        DAOImpl daoImpl = new DAOImpl();
//
//        for (Room rooms : resultOfRequest) {
//            daoImpl.save(rooms);
//        }

        return resultOfRequest;
    }

    public Room[] concat(Room[] rooms1, Room[] rooms2, Room[] rooms3) {
        Room[] resultRooms = new Room[checkLength(rooms1) + checkLength(rooms2) + checkLength(rooms3)];


            if (rooms1.length != 0){
                System.arraycopy(rooms1, 0, resultRooms, 0, rooms1.length);
                System.out.println(resultRooms);
            }if(rooms2.length != 0){
                System.arraycopy(rooms2, 0, resultRooms, rooms1.length, rooms2.length);
                System.out.println(resultRooms);
            }if (rooms3.length != 0){
                System.arraycopy(rooms3, 0, resultRooms, rooms2.length, rooms3.length);
                System.out.println(resultRooms);
            }


//        System.arraycopy(rooms1, 0, resultRooms, 0, rooms1.length);
//        System.arraycopy(rooms2, 0, resultRooms, rooms1.length, rooms2.length);
//        System.arraycopy(rooms3, 0, resultRooms, rooms2.length, rooms3.length);
//
//        System.arraycopy(rooms1, 0, resultRooms, 0, rooms1.length);
//        System.arraycopy(rooms2, 0, resultRooms, rooms1.length, rooms2.length);
//        System.arraycopy(rooms3, 0, resultRooms, rooms2.length, rooms3.length);
//
//        System.arraycopy(rooms1, 0, resultRooms, 0, rooms1.length);
//        System.arraycopy(rooms2, 0, resultRooms, rooms1.length, rooms2.length);
//        System.arraycopy(rooms3, 0, resultRooms, rooms2.length, rooms3.length);
//
//        System.arraycopy(rooms1, 0, resultRooms, 0, rooms1.length);
//        System.arraycopy(rooms2, 0, resultRooms, rooms1.length, rooms2.length);
//        System.arraycopy(rooms3, 0, resultRooms, rooms2.length, rooms3.length);

        return resultRooms;
    }

    public int checkLength (Room[] rooms){
        int roomsLength = 0;
        if (rooms.length != 0) {
            roomsLength = rooms.length;
        }
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
