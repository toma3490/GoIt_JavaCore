package module_4.homework;

public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        int limit = getCurrency() == Currency.USD ? 2000 : 2200;
        return limit;
    }

    @Override
    public int getLimitOfFunding() {
        int limit = getCurrency() == Currency.EUR ? 20000 : 10000;
        return limit;
    }

    @Override
    public int getMonthlyRate() {
        int rate = getCurrency() == Currency.USD ? 0 : 1;
        return rate;
    }

    @Override
    public int getCommission(int sum) {
        int commission;
        if (sum <= 1000){
            commission = getCurrency() == Currency.USD ? 5 : 2;
        }else {
            commission = getCurrency() == Currency.USD ? 7 : 4;
        }
        return commission;
    }
}
