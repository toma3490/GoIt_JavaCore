package module_4.homework;

public abstract class Bank {
    private long id;
    private static long nextId = 1;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    public Bank(String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    public long getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static long getNextId(){
        return nextId;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    abstract int getLimitOfWithdrawal();
    abstract int getLimitOfFunding();
    abstract int getMonthlyRate();
    abstract int getCommission(double sum);
    public double moneyPaidMonthlyForSalary(){
        return getAvrSalaryOfEmployee()*getNumberOfEmployees();
    }

    public String infoToString() {
        return getClass().getSimpleName() +
                " {id = " + getId() +
                ", bankCountry = '" + getBankCountry() + '\'' +
                ", currency = " + getCurrency() +
                ", numberOfEmployees = " + getNumberOfEmployees() +
                ", avrSalaryOfEmployee = " + String.format("%.2f", getAvrSalaryOfEmployee()) +
                ", rating = " + getRating() +
                ", totalCapital = " + getTotalCapital() +
                '}';
    }

    public String dataToString() {
        return  getClass().getSimpleName() +
                " {limitOfWithdrawal = " + getLimitOfWithdrawal() +
                ", limitOfFunding = " + getLimitOfFunding() +
                ", monthlyRate = " + getMonthlyRate() +
                "%, commission = " + getCommission(1000) +
                "%, paidMonthlyForSalary = " + moneyPaidMonthlyForSalary() +
                '}';
    }
}
