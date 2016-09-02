package module_3.practice.offlineMiting.task_1;

public class Employee extends Person {
    private String address;
    private double salary;

    public Employee(String name, String secondName, int age, String address, double salary) {
        super(name, secondName, age);
        this.address = address;
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
