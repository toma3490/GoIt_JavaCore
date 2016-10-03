package module_7.practice.task_1;

public class User implements Comparable<User>{
    private String name;
    private String secondName;
    private int age;

    public User(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User userToCompare) {
        return this.name.compareTo(userToCompare.getName());
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        User user = (User) object;

        if (age != user.age) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return secondName != null ? secondName.equals(user.secondName) : user.secondName == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
