package finalProject.controller;

import finalProject.baseEntity.Room;
import finalProject.baseEntity.User;
import finalProject.dao.HotelDAOImpl;
import finalProject.dao.RoomDAOImpl;
import finalProject.dao.UserDAOImpl;
import finalProject.baseEntity.Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Controller {

    public Controller() {}

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
            printError(room + " is reserved already!");
            return;
        }

        room.setUserId(userId);
        System.out.println(room + " in hotel " + hotel.getName() + " was successfully reserved");
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
            printError(room + " isn't reserved yet!");
            return;
        }
        if (room.getUserId() == userId){
            room.setUserId(0);
            System.out.println("You successfully cancel reservation");
        }
    }

    private boolean checkUser(long userId) {
        UserDAOImpl userDao = UserDAOImpl.getInstance();
        if (!userDao.isRegistered(userId)){
            printError("This " + userDao.getById(userId) + " isn't registered!");
            return true;
        }
        return false;
    }

    public void registerUser(User user){
        UserDAOImpl userDAO = UserDAOImpl.getInstance();
        if (userDAO.isRegistered(user.getId())){
            printError("This user " + user.shortToString() + " is registered already!");
            return;
        }
        try{
            if (userDAO.getAllUsers().contains(user)){
                printError("This user " + user.shortToString() + " is already exist!");
            }
        }catch (NullPointerException e){
            e.getMessage();
        }
        userDAO.save(user);
        user.setRegistered(true);
    }

    public List<User> getAllRegisteredUsers(){
        UserDAOImpl userDAO = UserDAOImpl.getInstance();
        List<User> allRegisteredUsers = new ArrayList<>();
        List<User> allUsers = userDAO.getAllUsers();
        for (User user : allUsers) {
            if (user.isRegistered()){
                allRegisteredUsers.add(user);
            }
        }
        if (allRegisteredUsers.isEmpty()){
            printError("There is no registered users");
        }
        return allRegisteredUsers;
    }

    public List<Room> findRoom(Map<String, String> params){
        HotelDAOImpl hotelDAO = HotelDAOImpl.getInstance();
        List<Room> rooms = new ArrayList<>();
        List<Room> allFreeRooms = hotelDAO.getAllNotReservedRooms();

        for (Room room : allFreeRooms) {
            boolean isFound = checkParams(params, room);
            if(isFound){
                rooms.add(room);
            }
        }
        if (rooms.isEmpty()){
            printError("There is no rooms with such params");
        }
        return rooms;
    }

    private boolean checkParams(Map<String, String> params, Room room) {
        List<Boolean> flags = new ArrayList<>();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getKey().equals("persons")) {
                int persons = Integer.parseInt(entry.getValue());
                if (persons == room.getPersons()) {
                    flags.add(true);
                } else {
                    flags.add(false);
                }
            }
            if (entry.getKey().equals("price")) {
                int price = Integer.parseInt(entry.getValue());
                if (price == room.getPrice()) {
                    flags.add(true);
                } else {
                    flags.add(false);
                }
            }
            if (entry.getKey().equals("id")) {
                long id = Long.parseLong(entry.getValue());
                if (id == room.getId()) {
                    flags.add(true);
                } else {
                    flags.add(false);
                }
            }
            if (entry.getKey().equals("hotel")) {
                Hotel hotel = findHotelByName(entry.getValue()).stream().findFirst().orElse(null);
                if (hotel.equals(room.getHotelById(room.getHotelId()))) {
                    flags.add(true);
                } else {
                    flags.add(false);
                }
            }
        }
        return flags.size() > 0 && flags.stream().allMatch(flag -> flag);
    }

    private void printError(String message){
        System.out.println(message);
    }
}
