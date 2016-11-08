package finalProject;

import finalProject.DAO.HotelDAOImpl;
import finalProject.DAO.RoomDAOImpl;
import finalProject.DAO.UserDAOImpl;
import finalProject.baseEntity.Hotel;
import finalProject.baseEntity.Room;
import finalProject.baseEntity.User;
import finalProject.controller.Controller;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        RoomDAOImpl roomDAO = new RoomDAOImpl();
//        HotelDAOImpl hotelDAO = HotelDAOImpl.getInstance();
//        System.out.println(hotelDAO.getHotelsList());
//        ArrayList<Room> rooms = new ArrayList<>();
//        rooms.add(new Room(2, 5000));

//        Hotel newHotel = new Hotel("fghj", null, rooms);
//        hotelDAO.save(newHotel);

//        Controller controller = new Controller();
//        System.out.println(controller.findHotelByName("FDS"));
//        System.out.println(controller.findHotelByCity("Kiev"));
        UserDAOImpl userDAO = UserDAOImpl.getInstance();

//        userDAO.save(new User("John", "Logan", 56));
//        userDAO.save(new User("John", "Logan", 57));
//        userDAO.save(new User("John", "Logan", 56));
//        userDAO.save(new User("John", "Logan", 56));

        System.out.println(userDAO.getAllUsers());
    }
}
