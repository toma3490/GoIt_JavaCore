package module_5.homework;

public class TripAdvisorAPI implements API{
    private Room[] rooms = new Room[5];

    public TripAdvisorAPI(){
        Room room1 = new Room(2500, 2, 2016, 9, 12, "Ibis", "Kiev");
        Room room2 = new Room(6000, 4, 2016, 8, 25, "Hilton", "Kiev");
        Room room3 = new Room(2000, 1, 2016, 9, 1, "New", "Polyanutsya");
        Room room4 = new Room(3500, 2, 2016, 10, 2, "Khreschatyk", "Kiev");
        Room room5 = new Room(3000, 3, 2016, 7, 21, "Ukraine", "Kiev");
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
        Room[] roomsTest = new Room[5];
        Room roomTest = new Room(price, persons, 0, 0, 0, city, hotel);
        for (int i = 0; i < roomsTest.length - 1; i++) {
            for (Room room : rooms) {
                if (room.equals(roomTest) && room.getHotelName().equals(hotel)){
                    roomsTest[i] = room;
                }
            }
        }

        return roomsTest;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }
}
