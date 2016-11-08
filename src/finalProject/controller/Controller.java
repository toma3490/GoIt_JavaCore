package finalProject.controller;

import finalProject.DAO.HotelDAOImpl;
import finalProject.DAO.RoomDAOImpl;
import finalProject.DAO.UserDAOImpl;
import finalProject.baseEntity.Hotel;
import finalProject.baseEntity.Room;

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
            System.out.println("There is no hotel with such name");
        }
        return searchResult;
    }

    public List<Hotel> findHotelByCity(String city){
        List<Hotel> searchResult = new ArrayList<>();
        HotelDAOImpl hotelDAO = HotelDAOImpl.getInstance();
        List<Hotel> allHotels = hotelDAO.getHotelsList();
        searchResult.addAll(allHotels.stream().filter(hotel -> hotel.getCity().equals(city)).collect(Collectors.toList()));
        if (searchResult.isEmpty()){
            System.out.println("There is no hotel in such city");
        }
        return searchResult;
    }

    public void bookRoom (long roomId, long userId, long hotelId) {
        UserDAOImpl userDao = new UserDAOImpl();
        try {
            userDao.isRegistered(userId);
        } catch (Exception e) {
            e.getMessage();
            return;
        }
        HotelDAOImpl hotelDAO = HotelDAOImpl.getInstance();
        List<Hotel> allHotels = hotelDAO.getHotelsList();
        for (Hotel hotel : allHotels) {
            if (hotelId == hotel.getId()) {
                for (Room room : hotel.getRooms()) {
                    if (roomId == room.getId()) {
                        if (!room.isReserved()) {
                            room.setReserved(true);
                            room.setUserId(userId);
                        }
                    }
                }
            }
        }
    }
}
