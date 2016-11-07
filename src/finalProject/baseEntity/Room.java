package finalProject.baseEntity;

public class Room {
    private int persons;
    private int price;
    private long id;
    private static long nextId = 0;
    User userReserved;

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

    public User getUserReserved() {
        return userReserved;
    }

    public void setUserReserved(User userReserved) {
        this.userReserved = userReserved;
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
        return "Room{" +
                "persons = " + persons +
                ", price = " + price +
                ", id = " + id +
                ", userReserved = " + userReserved +
                '}';
    }

}
