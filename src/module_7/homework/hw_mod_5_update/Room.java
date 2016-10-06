package module_7.homework.hw_mod_5_update;

import java.util.Date;
import java.util.GregorianCalendar;

public class Room {
    private long id;
    private static long nextId = 0;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(int price, int persons, int year, int month, int day, String hotelName, String cityName) {
        this.price = price;
        this.persons = persons;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        this.dateAvailableFrom = calendar.getTime();
        this.hotelName = hotelName;
        this.cityName = cityName;
        id = ++nextId;

    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Room room = (Room) object;

        if (price != 0){
            if (price != room.price) return false;
        }

        if (persons != 0){
            if (persons != room.persons) return false;
        }

        if (cityName != null){
            return cityName.equals(room.cityName);
        }
    return true;
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + persons;
        result = 31 * result + cityName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return '\n' + "Room{" +
                "id = " + id +
                ", price = " + price +
                ", persons = " + persons +
                ", dateAvailableFrom = " + dateAvailableFrom +
                ", hotelName = '" + hotelName + '\'' +
                ", cityName = '" + cityName + '\'' +
                '}';
    }
}
