package module_6.homework;

public class ArrayUtils {

    public static int sum(int[] array){
        int sum = 0;
        for(int arrayItem : array){
            sum += arrayItem;
        }
        return sum;
    }

    public static int min(int[] array){
        int min = array[0];
        for (int arrayItem : array){
            min = Math.min(arrayItem, min);
        }
        return min;
    }

    public static int max(int[] array){
        int max = array[0];
        for (int arrayItem : array){
            max = Math.max(arrayItem, max);
        }
        return max;
    }

    public static void maxPositive(int[] array){
        if (max(array) > 0){
            System.out.println(max(array));
        }else {
            System.out.println("There isn't positive elements");
        }
    }

    public static long multiplication(int[] array){
        long mult = 1;
        for (int arrayItem : array) {
            mult *= arrayItem;
        }
        return mult;
    }

    public static void modulus(int[] array){
        if(array[array.length-1] != 0){
            System.out.println(array[0] % array[array.length - 1]);
        }else {System.out.println("Division by 0!!!");}
    }

    public static int getSecondLargestElement(int[] array){
        int max = max(array);
        int secondLargest = array[0];
        for (int arrayItem : array){
            if(arrayItem > secondLargest && arrayItem < max) secondLargest = arrayItem;
        }
        return secondLargest;
    }

    public static int[] reverse (int[] array){
        for(int i = 0; i < array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
