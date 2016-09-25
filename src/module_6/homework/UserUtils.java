package module_6.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {

        ArrayList<User> usersList = new ArrayList<User>(Arrays.asList(users));
//        int counter = 0;
//        for (int i = 0; i < users.length; i++) {
//            for (int j = 0; j < users.length; j++) {
//                if (users[i].equals(users[j])) {
//                    counter++;
//                    usersList.remove(j);
//                }
//            }
//            if (counter == 0){
//                uniqueUsersList.add(users[i]);
//            }
//            else {
//                uniqueUsersList.remove(i);
//                counter = 0;
//            }
//        }

        Set<User> userSet = new HashSet<User>(usersList);
        userSet.addAll(usersList);
        ArrayList<User> uniqueUsersList = new ArrayList<User>();
        uniqueUsersList.addAll(userSet);

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
            user.setBalance(user.getBalance() + user.getSalary());
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
