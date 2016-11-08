package finalProject.DAO;

import finalProject.baseEntity.Hotel;

import java.util.List;

public interface HotelDAO {
    Hotel save(Hotel hotel);
    void delete(Hotel hotel);
    List<Hotel> getHotelsList();
}
