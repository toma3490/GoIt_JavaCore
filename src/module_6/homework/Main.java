package module_6.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[6];
        users[0] = new User("Thomas", "Anderson", 500, 400);
        users[1] = new User("Thomas", "Anderson", 500, 700);
        users[2] = new User("Thomas", "Anderson", 500, 700);
        users[3] = new User("Thomas", "Anderson", 500, 400);
        users[4] = new User("Thomas", "Anderson", 500, 700);
        users[5] = new User("Thomas", "Anderson", 500, 700);

//        System.out.println(Arrays.toString(users));
        System.out.println("Unique users" + '\n' + Arrays.toString(UserUtils.uniqueUsers(users)) + '\n');
//        System.out.println("Users with conditional balance " + '\n' + Arrays.toString(UserUtils.usersWithConditionalBalance(users, 400)) + '\n');
//        System.out.println("Pay salary to users " + '\n'  + Arrays.toString(UserUtils.paySalaryToUsers(users)) + '\n');
//        System.out.println("Get users Id " + '\n' + Arrays.toString(UserUtils.getUsersId(users)) + '\n' );
//        System.out.println("After deleting empty users " + '\n' + Arrays.toString(UserUtils.deleteEmptyUsers(users)));
    }
}
