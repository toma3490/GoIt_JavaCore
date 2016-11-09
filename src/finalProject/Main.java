package finalProject;

import finalProject.dao.HotelDAOImpl;
import finalProject.dao.UserDAOImpl;
import finalProject.baseEntity.User;
import finalProject.controller.Controller;

public class Main {
    public static void main(String[] args) {
//        RoomDAOImpl roomDAO = new RoomDAOImpl();
        HotelDAOImpl hotelDAO = HotelDAOImpl.getInstance();
//        System.out.println(hotelDAO.getHotelsList());
//        ArrayList<Room> rooms = new ArrayList<>();
//        rooms.add(new Room(2, 5000));

//        Hotel newHotel = new Hotel("fghj", null, rooms);
//        hotelDAO.save(newHotel);

//        Controller controller = new Controller();
//        System.out.println(controller.findHotelByName("FDS"));
//        System.out.println(controller.findHotelByCity("Kiev"));
        UserDAOImpl userDAO = UserDAOImpl.getInstance();
        Controller controller = new Controller();

//        userDAO.save(new User("John", "Logan", 56));
//        userDAO.save(new User("John", "Logan", 57));
//        userDAO.save(new User("John", "Logan", 56));
//        userDAO.save(new User("John", "Logan", 15));
//
//        System.out.println(userDAO.getAllUsers());
        User user = new User("J", "L", 28);
        User user1 = new User("T", "M", 26);
        User user2 = new User("T", "M", 26);
        userDAO.save(user);
        controller.registerUser(user1);
        controller.registerUser(user2);
        System.out.println(userDAO.getAllUsers());
//        controller.bookRoom(1, 1, 1);
//        controller.bookRoom(1, 1, 2);
//        controller.cancelReservation(1, 1, 1);
//        controller.bookRoom(1, 2, 1);
    }
}
