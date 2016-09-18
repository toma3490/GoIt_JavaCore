package module_5.homework;

import java.util.Arrays;

public class GoogleAPI implements API{
    private int amount = 5;
    private Room[] rooms = new Room[amount];

    public GoogleAPI(){
        Room room1 = new Room(2300, 1, 2016, 9, 12, "Ibis", "Kiev");
        Room room2 = new Room(6000, 4, 2016, 8, 25, "Hilton", "Kiev");
        Room room3 = new Room(3000, 2, 2016, 9, 1, "New", "Polyanutsya");
        Room room4 = new Room(3500, 2, 2016, 10, 2, "Khreschatyk", "Kiev");
        Room room5 = new Room(5000, 2, 2016, 7, 21, "Ukraine", "Kiev");
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
        for (Room room : rooms) {
            room.setId();
        }
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] roomsExample = new Room[amount];
        Room roomExample = new Room(price, persons, 0, 0, 0, city, hotel);
        Room[] roomsExample1 = new Room[countArrayLength(hotel, roomsExample, roomExample)];

        roomFinder(hotel, roomsExample1, roomExample);

        return roomsExample1;
    }

    private void roomFinder(String hotel, Room[] roomsExample, Room roomExample) {
        for (int i = 0; i < roomsExample.length - 1; i++) {
            for (Room room : rooms) {
                if (room.equals(roomExample) && room.getHotelName().equals(hotel)){
                    roomsExample[i] = room;
                }
            }
        }
    }

    private int countArrayLength(String hotel, Room[] roomsExample, Room roomExample) {
        int counter = 0;
        for (int i = 0; i < roomsExample.length - 1; i++) {
            for (Room room : rooms) {
                if (room.equals(roomExample) && room.getHotelName().equals(hotel)){
                    counter++;
                }
            }
        }
        return counter;
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
