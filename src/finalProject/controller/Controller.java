package finalProject.controller;

import finalProject.baseEntity.Room;
import finalProject.baseEntity.User;
import finalProject.dao.HotelDAOImpl;
import finalProject.dao.RoomDAOImpl;
import finalProject.dao.UserDAOImpl;
import finalProject.baseEntity.Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Controller {

    public Controller() {


//        RoomDAOImpl roomDAO = new RoomDAOImpl();
//        UserDAOImpl userDAO = new UserDAOImpl();
    }

    public List<Hotel> findHotelByName(String name){

        List<Hotel> searchResult = new ArrayList<>();
        HotelDAOImpl hotelDAO = HotelDAOImpl.getInstance();
        List<Hotel> allHotels = hotelDAO.getHotelsList();
        searchResult.addAll(allHotels.stream().filter(hotel -> hotel.getName().equals(name)).collect(Collectors.toList()));
        if (searchResult.isEmpty()){
            printError("There is no hotel with such name");
        }
        return searchResult;
    }

    public List<Hotel> findHotelByCity(String city){
        List<Hotel> searchResult = new ArrayList<>();
        HotelDAOImpl hotelDAO = HotelDAOImpl.getInstance();
        List<Hotel> allHotels = hotelDAO.getHotelsList();
        searchResult.addAll(allHotels.stream().filter(hotel -> hotel.getCity().equals(city)).collect(Collectors.toList()));
        if (searchResult.isEmpty()){
            printError("There is no hotel in such city");
        }
        return searchResult;
    }

    public void bookRoom (long roomId, long userId, long hotelId) {
        if (checkUser(userId)) return;

        HotelDAOImpl hotelDAO = HotelDAOImpl.getInstance();
        RoomDAOImpl roomDAO = RoomDAOImpl.getInstance();
        Hotel hotel = hotelDAO.getById(hotelId);
        List<Room> rooms = hotel.getRooms();
        Room room = roomDAO.getById(roomId);

        if (!rooms.contains(room)){
            printError("There isn't room with id = " + roomId + " in hotel " + hotel.getName());
            return;
        }

        if (roomDAO.isReserved(roomId)){
            printError("This " + room + " is reserved already!");
            return;
        }

        room.setUserId(userId);
        System.out.println("Room " + room + " in hotel " + hotel.getName() + " was successfully reserved");
    }

    public void cancelReservation (long roomId, long userId, long hotelId){
        if (checkUser(userId)) return;

        HotelDAOImpl hotelDAO = HotelDAOImpl.getInstance();
        RoomDAOImpl roomDAO = RoomDAOImpl.getInstance();
        Hotel hotel = hotelDAO.getById(hotelId);
        List<Room> rooms = hotel.getRooms();
        Room room = roomDAO.getById(roomId);

        if (!rooms.contains(room)){
            printError("There isn't room with id = " + roomId + " in hotel " + hotel.getName());
            return;
        }

        if (!roomDAO.isReserved(roomId)){
            printError("This " + room + " isn't reserved yet!");
            return;
        }
        if (room.getUserId() == userId){
            room.setUserId(0);
            System.out.println("You successfully cancel reservation");
        }
    }

    private boolean checkUser(long userId) {
        UserDAOImpl userDao = new UserDAOImpl();
        if (!userDao.isRegistered(userId)){
            printError("This " + userDao.getById(userId) + " isn't registered!");
            return true;
        }
        return false;
    }

    public void registerUser(User user){
        UserDAOImpl userDAO = new UserDAOImpl();
        if (userDAO.isRegistered(user.getId())){
            printError("This user " + user.shortToString() + " is registered already!");
            return;
        }
        userDAO.save(user);
        user.setRegistered(true);
    }
    private void printError(String message){
        System.out.println(message);
    }
}
