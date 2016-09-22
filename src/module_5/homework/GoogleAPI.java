package module_5.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class GoogleAPI implements API{
    private int amount = 5;
    private Room[] rooms = new Room[amount];

    public GoogleAPI(){
        Room room1 = new Room(2300, 1, 2016, 9, 12, "Ibis", "Kiev");
        Room room2 = new Room(6000, 4, 2016, 8, 25, "Hilton", "Kiev");
        Room room3 = new Room(3000, 2, 2016, 9, 1, "New", "Polyanutsya");
        Room room4 = new Room(3000, 3, 2016, 10, 2, "Ukraine", "Kiev");
        Room room5 = new Room(5000, 2, 2016, 7, 21, "Ukraine", "Kiev");
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
    }

    @Override
    public Room[] findRooms(int price, int persons, String hotel, String city) {
        Room roomExample = new Room(price, persons, 0, 0, 0, hotel, city);
        ArrayList<Room> roomsList = new ArrayList<Room>();
        for (Room room : rooms) {
            if (room.equals(roomExample) && room.getHotelName().equals(roomExample.getHotelName())){
                roomsList.add(room);
            }
        }

        Room[] roomsFind = new Room[roomsList.size()];
        roomsList.toArray(roomsFind);
        return roomsFind;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return '\n' + "GoogleAPI{" +
                "rooms = " + Arrays.toString(rooms) +
                '}';
    }
}
