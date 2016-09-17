package module_5.practice.task_3;

public class USBank extends Bank {

    public USBank(String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        return getCurrency() == Currency.USD ? 1000 : 1200;
    }

    @Override
    public int getLimitOfFunding() {
        return getCurrency() == Currency.EUR ? 10000 : Integer.MAX_VALUE;
    }

    @Override
    public int getMonthlyRate() {
        return getCurrency() == Currency.USD ? 1 : 2;
    }

    @Override
    public int getCommission(double sum) {
        int commission;
        if (sum <= 1000){
            commission = getCurrency() == Currency.USD ? 5 : 6;
        }else {
            commission = getCurrency() == Currency.USD ? 7 : 8;
        }
        return commission;
    }
}
