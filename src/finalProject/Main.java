package finalProject;

import finalProject.DAO.HotelDAOImpl;
import finalProject.DAO.RoomDAOImpl;

public class Main {
    public static void main(String[] args) {
        HotelDAOImpl hotelDAO = new HotelDAOImpl();
        System.out.println(hotelDAO);
    }
}
