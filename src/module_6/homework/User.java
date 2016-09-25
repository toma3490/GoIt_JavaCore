package module_6.homework;

public class User {
    private long id;
    private static long nextId = 0;
    private String firstName;
    private String lastName;
    private int salary;
    private int balance;

    public User(String firstName, String lastName, int salary, int balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
        id = ++nextId;
    }

    public long getId() {
        return id;
    }

    public static long getNextId() {
        return nextId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
