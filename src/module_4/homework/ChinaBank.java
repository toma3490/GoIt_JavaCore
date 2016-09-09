package module_4.homework;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        int limit = getCurrency() == Currency.USD ? 100 : 150;
        return limit;
    }

    @Override
    public int getLimitOfFunding() {
        int limit = getCurrency() == Currency.EUR ? 5000 : 10000;
        return limit;
    }

    @Override
    public int getMonthlyRate() {
        int monthlyRate = getCurrency() == Currency.USD ? 1 : 0;
        return monthlyRate;
    }

    @Override
    int getCommission(int sum) {
        int commission;
        if(sum <= 1000){
            commission = getCurrency() == Currency.USD ? 3 : 10;
        }else{
            commission = getCurrency() == Currency.USD ? 5 : 11;
        }
        return commission;
    }
}
