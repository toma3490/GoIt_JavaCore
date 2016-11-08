package finalProject.DAO;

import finalProject.baseEntity.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelDAOImpl extends AbstractDAOImpl<Hotel> implements HotelDAO{
    RoomDAOImpl roomDAO = new RoomDAOImpl();
    private List<Hotel> hotels = new ArrayList<>();

    public HotelDAOImpl() {
        hotels.add(new Hotel("Radisson", "Kiev", roomDAO.getRoomsList(0)));
        hotels.add(new Hotel("Hilton", "Kiev", roomDAO.getRoomsList(1)));
        hotels.add(new Hotel("The Beaumont", "London", roomDAO.getRoomsList(2)));
        hotels.add(new Hotel("The Connaught", "London", roomDAO.getRoomsList(3)));
        hotels.add(new Hotel("Le Citizen", "Paris", roomDAO.getRoomsList(4)));
        hotels.add(new Hotel("Vernet", "Paris", roomDAO.getRoomsList(5)));
    }
}
