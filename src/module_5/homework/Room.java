package module_5.homework;

import java.util.Date;
import java.util.GregorianCalendar;

public class Room {
    private long id;
    private static long nextId = 1;
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

    }

    public long getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
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

        if (price != room.price) return false;
        if (persons != room.persons) return false;
        return cityName.equals(room.cityName);

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
