package module_8.homework;

public class User extends BaseEntity {
    private long id;
    private static long nextId = 0;
    private String name;

    public User(String name) {
        this.name = name;
        id = ++nextId;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        User user = (User) object;

        if (id != user.id) return false;
        return name != null ? name.equals(user.name) : user.name == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return '\n' + "User{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                '}';
    }
}
