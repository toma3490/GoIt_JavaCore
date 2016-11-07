package finalProject.baseEntity;

import java.util.List;

public class Hotel {
    private String name;
    private String city;
    private long id;
    private static long nextId = 0;
    List<Room> rooms;

    public Hotel(String name, String city, List<Room> rooms) {
        this.city = city;
        this.name = name;
        this.rooms = rooms;
        id = ++nextId;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Hotel hotel = (Hotel) object;

        if (id != hotel.id) return false;
        if (name != null ? !name.equals(hotel.name) : hotel.name != null) return false;
        if (city != null ? !city.equals(hotel.city) : hotel.city != null) return false;
        return rooms != null ? rooms.equals(hotel.rooms) : hotel.rooms == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (int) (id ^ (id >>> 32));
        result = 31 * result + (rooms != null ? rooms.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name = '" + name + '\'' +
                ", city = '" + city + '\'' +
                ", id = " + id +
                ", rooms = " + rooms +
                '}';
    }
}
