package module_7.homework.hw_mod_5_update;

import java.util.List;

public interface API {

    List<Room> findRooms(int price, int persons, String city, String hotel);
    List<Room> getAllRooms();
}
