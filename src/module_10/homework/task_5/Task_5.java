package module_10.homework.task_5;

import java.util.Random;

public class Task_5 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
//        int number = 3;
        System.out.println(number + "\n");
        for (int i = number - 1; i <= number + 1; i++) {
            System.out.println(i);
            try{
                if (isPrime(i)){
                    throw new ExceptionPrimeNumber("Your number is prime");
                }
                if (isEven(i)){
                    throw new ExceptionEvenNumber("Your number is even");
                }
                if (isOdd(i)){
                    throw new ExceptionOddNumber("Your number is odd");
                }
            }catch(ExceptionEvenNumber | ExceptionOddNumber | ExceptionPrimeNumber e){
                e.getMessage();
            }
        }
    }

    public static boolean isEven(int number){
        boolean check = false;
        if (number % 2 == 0){
            check = true;
        }
        return check;
    }

    public static boolean isOdd(int number){
        boolean check = false;
        if (number % 2 != 0){
            check = true;
        }
        return check;
    }

    public static boolean isPrime(int number){
        boolean check = false;
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0){
                counter++;
            }
        }
        if (counter == 2){
            check = true;
        }
        return check;
    }
}
