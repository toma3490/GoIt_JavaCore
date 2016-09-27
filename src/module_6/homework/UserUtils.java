package module_6.homework;

import module_5.homework.Room;

import java.util.ArrayList;
import java.util.Arrays;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {
        User[] tempArray = (User[])users.clone();
        ArrayList<User> uniqueUsersList = new ArrayList<User>();

//        for (User user : users) {
//            if (uniqueUsersList.indexOf(user) != uniqueUsersList.lastIndexOf(user)) {
//                uniqueUsersList.remove(uniqueUsersList.lastIndexOf(user));
//            }
//        }

        int countDuplicate = 0;

        for(int i = 0; i < tempArray.length; i++) {
            for (int j = 1; j < tempArray.length; j++) {
                if (i == j){
                    j++;
                }
                if(tempArray[i] == null){
                    break;
                }
                if (tempArray[i].equals(tempArray[j]) || tempArray[j] == null) {
                    countDuplicate++;
                    tempArray[j] = null;
                }
            }
            if (countDuplicate == 0 && tempArray[i] != null && !tempArray[i].isEmpty()) {
                uniqueUsersList.add(tempArray[i]);
            }
            if(countDuplicate != 0 && tempArray[i] != null){
                uniqueUsersList.add(tempArray[i]);
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
