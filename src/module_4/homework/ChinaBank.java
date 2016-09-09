package module_4.homework;

public class ChinaBank extends Bank {

    public ChinaBank(String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        return getCurrency() == Currency.USD ? 100 : 150;
    }

    @Override
    public int getLimitOfFunding() {
        return getCurrency() == Currency.EUR ? 5000 : 10000;

    }

    @Override
    public int getMonthlyRate() {
        return getCurrency() == Currency.USD ? 1 : 0;
    }

    @Override
    public int getCommission(double sum) {
        int commission;
        if (sum <= 1000){
            commission = getCurrency() == Currency.USD ? 3 : 10;
        }else {
            commission = getCurrency() == Currency.USD ? 5 : 11;
        }
        return commission;
    }
}
