package module_10.homework;

import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        Random random = new Random();
        try{
            int number = random.nextInt();
            System.out.println(number);
            if (number <= 1000000000){
                throw new IllegalArgumentException("Your number is inappropriate");
            }
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

    }
}
