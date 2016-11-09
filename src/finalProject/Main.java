package finalProject;

import finalProject.baseEntity.Room;
import finalProject.dao.HotelDAOImpl;
import finalProject.dao.RoomDAOImpl;
import finalProject.dao.UserDAOImpl;
import finalProject.baseEntity.User;
import finalProject.controller.Controller;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        RoomDAOImpl roomDAO = RoomDAOImpl.getInstance();
        HotelDAOImpl hotelDAO = HotelDAOImpl.getInstance();
        UserDAOImpl userDAO = UserDAOImpl.getInstance();
//        System.out.println(hotelDAO.getHotelsList());

        User user1 = new User("James", "Bond", 40);
        User user2 = new User("Clark", "Kent", 20);
        User user3 = new User("Bruce", "Wayne", 45);
        User user4 = new User("Van", "Helsing", 75);
        User user5 = new User("Kenuichio", "Harada", 12);
        User user6 = new User("Amiko", "Kobayashi", 18);
        User user7 = new User("Thomas", "Anderson", 30);
        User user8 = new User("Allan", "Quatermain", 60);
        User user9 = new User("Tom", "Sawyer", 12);
        User user10 = new User("Lisbeth", "Salander", 25);
        controller.registerUser(user1);
        controller.registerUser(user2);
        controller.registerUser(user3);
        controller.registerUser(user4);
        controller.registerUser(user5);
        controller.registerUser(user6);
        controller.registerUser(user7);
        controller.registerUser(user8);
        controller.registerUser(user9);
        controller.registerUser(user10);

//        controller.getAllRegisteredUsers().stream().forEach(System.out::println);
//        System.out.println(controller.getAllRegisteredUsers());

        controller.bookRoom(12, 1, 2);
        controller.bookRoom(7, 2, 1);
        controller.bookRoom(27, 7, 3);
        controller.bookRoom(12, 1, 2);
        controller.bookRoom(27, 8, 2);
        controller.bookRoom(15, 8, 2);
        controller.bookRoom(11, 8, 2);
        controller.bookRoom(30, 6, 3);
        controller.bookRoom(45, 5, 4);
        controller.bookRoom(60, 9, 6);
        controller.bookRoom(54, 3, 6);
//
//        controller.cancelReservation(12, 1, 2);
//        controller.cancelReservation(12, 1, 2);


//        System.out.println(controller.findHotelByName("FDS"));
//        System.out.println(controller.findHotelByName("Hilton"));
//        System.out.println(controller.findHotelByCity("Kiev"));

//        hotelDAO.getAllNotReservedRooms().stream().forEach(System.out::println);
        System.out.println(hotelDAO.getAllNotReservedRooms());


        Map<String, String> params = new HashMap<>();
        params.put("persons", "3");
//        params.put("price", "1300");
//        params.put("id", "15");
        params.put("hotel", "Hilton");
//        params.put("city", "London");
//        System.out.println(params);
        System.out.println("_________");
        List<Room> rooms = controller.findRoom(params);
        System.out.println(rooms);
//        rooms.stream().forEach(System.out::println);
    }
}
