package module_4.homework;

public class USBank extends Bank {

    public USBank(String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        int limit = getCurrency() == Currency.USD ? 1000 : 1200;
        return limit;
    }

    @Override
    public int getLimitOfFunding() {
        int limit = getCurrency() == Currency.EUR ? 10000 : 0;
        return limit;
    }

    @Override
    public int getMonthlyRate() {
        int rate = getCurrency() == Currency.USD ? 1 : 2;
        return rate;
    }

    @Override
    public int getCommission(int sum) {
        int commission;
        if (sum <= 1000){
            commission = getCurrency() == Currency.USD ? 5 : 6;
        }else {
            commission = getCurrency() == Currency.USD ? 7 : 8;
        }
        return commission;
    }
}
