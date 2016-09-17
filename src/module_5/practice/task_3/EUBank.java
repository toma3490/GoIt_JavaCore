package module_5.practice.task_3;

public class EUBank extends Bank {

    public EUBank(String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        return getCurrency() == Currency.USD ? 2000 : 2200;
    }

    @Override
    public int getLimitOfFunding() {
        return getCurrency() == Currency.EUR ? 20000 : 10000;
    }

    @Override
    public int getMonthlyRate() {
        return getCurrency() == Currency.USD ? 0 : 1;
    }

    @Override
    public int getCommission(double sum) {
        int commission;
        if (sum <= 1000){
            commission = getCurrency() == Currency.USD ? 5 : 2;
        }else {
            commission = getCurrency() == Currency.USD ? 7 : 4;
        }
        return commission;
    }
}
