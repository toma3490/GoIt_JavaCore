package module_3.homework.task_4;

public class Main {
    public static void main(String[] args) {
        User user = new User("Vova", 6500, 2, "Fondy", 4000, "USD");
        System.out.println("Balance " + user.getBalance());
        user.paySalary();
        System.out.println("Balance " + user.getBalance());
        user.withdraw(999);
        System.out.println("Balance " + user.getBalance());
        System.out.println("Company name lenght " + user.companyNameLenght());
        System.out.println("Month of employment " + user.getMonthOfEmployment());
        user.monthIncreaser(5);
        System.out.println("Month of employment " + user.getMonthOfEmployment());
    }
}
