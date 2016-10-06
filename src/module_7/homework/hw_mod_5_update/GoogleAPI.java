package module_7.homework.hw_mod_5_update;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoogleAPI implements API {
    private List<Room> rooms = new ArrayList<>();

    public GoogleAPI(){
        rooms.add(new Room(2300, 1, 2016, 9, 12, "Ibis", "Kiev"));
        rooms.add(new Room(6000, 4, 2016, 8, 25, "Hilton", "Kiev"));
        rooms.add(new Room(3000, 2, 2016, 9, 1, "New", "Polyanutsya"));
        rooms.add(new Room(3000, 3, 2016, 10, 2, "Ukraine", "Kiev"));
        rooms.add(new Room(5000, 2, 2016, 7, 21, "Ukraine", "Kiev"));
    }

    @Override
    public List<Room> findRooms(int price, int persons, String hotel, String city) {
        Room roomExample = new Room(price, persons, 0, 0, 0, hotel, city);
        ArrayList<Room> roomsList = new ArrayList<Room>();
        for (Room room : rooms) {
            if (room.equals(roomExample) && room.getHotelName().equals(roomExample.getHotelName())){
                roomsList.add(room);
            }
        }

        return roomsList;
    }

    @Override
    public List<Room> getAllRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return '\n' + "GoogleAPI{" +
                "rooms = " + rooms +
                '}';
    }
}
