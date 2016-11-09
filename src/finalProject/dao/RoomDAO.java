package finalProject.dao;

import finalProject.baseEntity.Room;

import java.util.List;

public interface RoomDAO {

    Room save(List<Room> list, Room room);
    void delete(List<Room> list, Room room);
    List<List<Room>> getAllRoomsList();
    List<Room> getRoomsList(int i);
}
