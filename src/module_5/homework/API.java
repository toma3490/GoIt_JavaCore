package module_5.homework;

public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAllRooms();
}
