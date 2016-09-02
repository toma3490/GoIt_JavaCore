package module_3.homework.task_4;

public class User {
    private String name;
    private double balance;
    private int monthOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, double balance, int monthOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthOfEmployment = monthOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthOfEmployment() {
        return monthOfEmployment;
    }

    public void setMonthOfEmployment(int monthOfEmployment) {
        this.monthOfEmployment = monthOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void paySalary(){
        balance = getBalance() + getSalary();
    }

    public void withdraw(int sum){
        if(sum < 1000){
            balance = getBalance() - sum - sum * 0.05;
        }else{
            balance = getBalance() - sum - sum * 0.1;
        }
    }

    public int companyNameLenght(){
        return getCompanyName().length();
    }

    public void monthIncreaser(int addMonth){
        monthOfEmployment = getMonthOfEmployment() + addMonth;
    }
}
