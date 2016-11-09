package finalProject.dao;

import finalProject.baseEntity.Hotel;
import finalProject.baseEntity.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HotelDAOImpl extends AbstractDAOImpl<Hotel> implements HotelDAO{
    RoomDAOImpl roomDAO = RoomDAOImpl.getInstance();
    private static List<Hotel> hotels = new ArrayList<>();

    private static HotelDAOImpl instance;

    public static HotelDAOImpl getInstance(){
        if (instance == null){
            instance = new HotelDAOImpl();
        }
        return instance;
    }

    private HotelDAOImpl() {
        hotels.add(new Hotel("Radisson", "Kiev", roomDAO.getRoomsList(0)));
        hotels.add(new Hotel("Hilton", "Kiev", roomDAO.getRoomsList(1)));
        hotels.add(new Hotel("The Beaumont", "London", roomDAO.getRoomsList(2)));
        hotels.add(new Hotel("The Connaught", "London", roomDAO.getRoomsList(3)));
        hotels.add(new Hotel("Le Citizen", "Paris", roomDAO.getRoomsList(4)));
        hotels.add(new Hotel("Vernet", "Paris", roomDAO.getRoomsList(5)));
        SetHotelIdInRooms();
    }

    private void SetHotelIdInRooms() {
        for (int i = 0; i < hotels.size(); i++) {
            roomDAO.setHotelId(roomDAO.getRoomsList(i), hotels.get(i).getId());
        }
    }

    @Override
    public Hotel save(Hotel hotel) {
        if (hotel.getRooms() == null || hotel.getName() == null || hotel.getCity() == null){
            System.out.println("Please enter correct data!");
            return null;
        }else{
            roomDAO.saveAll(hotel.getRooms());
            hotels.add(hotel);
            SetHotelIdInRooms();
            return hotel;
        }
    }

    @Override
    public void delete(Hotel hotel) {
        hotels.remove(hotel);
    }

    @Override
    public List<Hotel> getHotelsList() {
        return hotels;
    }

    public List<Room> getAllRooms(Hotel hotel){
        List<Room> rooms = new ArrayList<>();
        for (Hotel item : hotels) {
            if (item.equals(hotel)){
                rooms = item.getRooms();
            }
        }
        return rooms;
    }

    public List<Room> getAllNotReservedRooms(){
        ArrayList<Room> rooms = new ArrayList<>();
        for (Hotel hotel :
                hotels) {
            List<Room> roomsInHotel = hotel.getRooms().stream().filter(room -> room.getUserId() == 0).collect(Collectors.toList());
            rooms.addAll(roomsInHotel);
        }
        return rooms;
    }

    @Override
    public Hotel getById(long id) {
        for (Hotel hotel : hotels) {
            if (hotel.getId() == id) {
                return hotel;
            }
        }
        return null;
    }
}
