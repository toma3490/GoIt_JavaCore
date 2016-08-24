package module_1.practice;

public class Task_2 {
    static long containsCount(long[] array, int number){
        int counter = 0;
        for (long item: array) {
            if(item == number){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        long[] array = {10, 20, 40, 45, 42, 85, 10, 87, 64, 200};
        int number = 20;
        long result = containsCount(array, number);
        if (result == 1){
            System.out.println("Yes");
        }
        if (result == 0){
            System.out.println("No");
        }
        if (result > 1 ) {
            System.out.println(containsCount(array, number));
        }


    }
}
