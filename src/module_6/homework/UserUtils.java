package module_6.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {
        ArrayList<User> uniqueUsersList = new ArrayList<User>();

//        for (User user : users) {
//            if (uniqueUsersList.indexOf(user) != uniqueUsersList.lastIndexOf(user)) {
//                uniqueUsersList.remove(uniqueUsersList.lastIndexOf(user));
//            }
//        }

        int countDuplicate = 0;

        for(int i = 0; i < users.length; i++) {
            for (int j = 1; j < users.length; j++) {
                if (i == j){
                    j++;
                }
                if(users[i] == null){
                    break;
                }
                if (users[i].equals(users[j]) || users[j] == null) {
                    countDuplicate++;
                    users[j] = null;
                }
            }
            if (countDuplicate == 0 && users[i] != null) {
                uniqueUsersList.add(users[i]);
            }
            if(countDuplicate != 0 && users[i] != null){
                uniqueUsersList.add(users[i]);
                countDuplicate = 0;
            }
        }

        User[] uniqueUsersArray = new User[uniqueUsersList.size()];
        uniqueUsersList.toArray(uniqueUsersArray);
        return uniqueUsersArray;
    }

    public static User[] usersWithConditionalBalance(User[] users, int balance){
        ArrayList<User> usersWithConditionalBalanceList = new ArrayList<User>();

        for (User user : users) {
            if (user.getBalance() == balance) {
                usersWithConditionalBalanceList.add(user);
            }
        }

        User[] usersWithConditionalBalanceArray = new User[usersWithConditionalBalanceList.size()];
        usersWithConditionalBalanceList.toArray(usersWithConditionalBalanceArray);
        return usersWithConditionalBalanceArray;
    }

    public static final User[] paySalaryToUsers(User[] users){
        for (User user : users) {
            if (!user.isEmpty()){
                user.setBalance(user.getBalance() + user.getSalary());
            }
        }
        return users;
    }

    public static final long[] getUsersId(User[] users){
        long[] usersId = new long[users.length];
        int i = 0;
        for (User user : users) {
            usersId[i] = user.getId();
            i++;
        }
        return usersId;
    }

    public static User[] deleteEmptyUsers(User[] users){
        ArrayList<User> notEmptyUsersList = new ArrayList<User>();

        for (User user : users) {
            if (!user.isEmpty()) {
                notEmptyUsersList.add(user);
            }
        }

        User[] notEmptyUsersArray = new User[notEmptyUsersList.size()];
        notEmptyUsersList.toArray(notEmptyUsersArray);
        return notEmptyUsersArray;
    }
}
