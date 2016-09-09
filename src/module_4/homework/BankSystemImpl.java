package module_4.homework;

public class BankSystemImpl implements BankSystem {

//    public double checkLimit(User user, int amount){
//        if (amount >= 0 && amount <= user.getBank().getLimitOfWithdrawal()){
//            withdraw(user, amount);
//        }else {
//            System.out.println("Enter CORRECT amount!!");
//        }
//    }
//
//    public void withdraw(User user, int amount){
//        double withdraw = user.getBalance() - amount - amount * user.getBank().getCommission(amount);
//        if(user.getBalance() > withdraw){
//            withdrawOfUser(user, amount);
//        }else {
//            System.out.println("You have not enough money!!");
//        }
//    }

    @Override
    public void withdrawOfUser(User user, int amount) {
        user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount));
    }

    @Override
    public void fundUser(User user, int amount) {

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

    }

    @Override
    public void paySalary(User user) {

    }
}
