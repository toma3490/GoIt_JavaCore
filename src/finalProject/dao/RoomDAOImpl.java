package finalProject.dao;

import finalProject.baseEntity.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RoomDAOImpl extends AbstractDAOImpl<Room> implements RoomDAO{
    private static List<List<Room>> roomsLists = new ArrayList<>();

    private static RoomDAOImpl instance;

    public static RoomDAOImpl getInstance(){
        if (instance == null){
            instance = new RoomDAOImpl();
        }
        return instance;
    }

    public RoomDAOImpl() {
        for (int i = 1; i <= 6; i++) {
            List<Room> rooms = new ArrayList<>();
            for (int j = 1; j <= 10; j++) {
                Random random = new Random();
                rooms.add(new Room(random.nextInt(4) + 1, random.nextInt(5000) + 100));
            }
            roomsLists.add(rooms);
        }
    }

    @Override
    public Room save(List<Room> list, Room room) {
        roomsLists.stream().filter(item -> item.equals(list)).forEach(item -> list.add(room));
        return room;
    }

    @Override
    public void saveAll(List<Room> list) {
        roomsLists.add(list);
        System.out.println("Your data was saved!");
    }

    @Override
    public void delete(List<Room> list, Room room) {
        roomsLists.stream().filter(item -> item.equals(list)).forEach(item -> list.remove(room));
    }

    @Override
    public void deleteAll(List<Room> list) {
        roomsLists.removeAll(list);
        System.out.println("Your data was deleted!");
    }

    @Override
    public List<Room> getRoomsList(int i) {
        return roomsLists.get(i);
    }

    @Override
    public List<List<Room>> getAllRoomsList() {
        return roomsLists;
    }

    public boolean isReserved (long roomId){
        boolean isReserved = false;
        for (List<Room> room: roomsLists) {
            for (Room item : room) {
                if (item.getUserId() != 0) {
                    isReserved = true;
                }
            }
        }
        return isReserved;
    }

    @Override
    public Room getById(long id) {
        for (List<Room> room: roomsLists) {
            for (Room item : room) {
                if (item.getId() == id) {
                    return item;
                }
            }
        }
        return null;
    }

    public void setHotelId(List<Room> list, long hotelId){
        list.stream().filter(room -> room.getHotelId() == 0).forEach(room -> room.setHotelId(hotelId));
    }
}
