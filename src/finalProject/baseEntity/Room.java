package finalProject.baseEntity;

import finalProject.dao.HotelDAOImpl;
import finalProject.dao.UserDAOImpl;

public class Room implements Identity{
    private int persons;
    private int price;
    private long id;
    private static long nextId = 0;
    private long userId;
    private long hotelId;

    public Room(int persons, int price) {
        this.persons = persons;
        this.price = price;
        id = ++nextId;
    }

    public int getPersons() {
        return persons;
    }

    public int getPrice() {
        return price;
    }

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getHotelId() {
        return hotelId;
    }

    public Hotel getHotelById(long hotelId){
        HotelDAOImpl hotelDAO = HotelDAOImpl.getInstance();
        return hotelDAO.getById(hotelId);
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Room room = (Room) object;

        if (persons != room.persons) return false;
        if (price != room.price) return false;
        return id == room.id;

    }

    @Override
    public int hashCode() {
        int result = persons;
        result = 31 * result + price;
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public String toString() {
        if (userId == 0){
            return "\n\t\t" + "Room{" +
                    "id = " + id +
                    ", persons = " + persons +
                    ", price = " + price +
                    ", hotelId = " + hotelId +
                    '}';
        }
        UserDAOImpl userDAO = new UserDAOImpl();
        return "\n\t\t" + "Room{" +
                "id = " + id +
                ", persons = " + persons +
                ", price = " + price +
                ", userReserved:" + userDAO.getById(userId).shortToString() +
                ", hotelId = " + hotelId +
                '}';
    }
}
