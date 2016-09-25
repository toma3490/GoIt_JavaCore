package module_2.homework;

import module_6.homework.*;

import java.util.Arrays;

public class Task_1 {

    static int[] arrayInt = {87, 52, 120, -120, -78, 23, -51, 8, -89, 45};
    static double[] arrayDouble = {-6.32, 5.48, 109, -542.36, 50.69, 357.12, -157.12, 125.32, 65.3, 98.54};

    //    Sum
    static int sum(int[] array){
        int sum = 0;
        for(int arrayItem : array){
            sum += arrayItem;
        }
        return sum;
    }

    static double sum(double[] array){
        double sum = 0;
        for(double arrayItem: array){
            sum += arrayItem;
        }
        return sum;
    }

    //    Min
    static int min(int[] array){
        int min = array[0];
        for (int arrayItem : array){
            min = Math.min(arrayItem, min);
        }
        return min;
    }

    static double min(double[] array){
        double min = array[0];
        for (double arrayItem : array){
            min = Math.min(arrayItem, min);
        }
        return min;
    }

    //    Max
    static int max(int[] array){
        int max = array[0];
        for (int arrayItem : array){
            max = Math.max(arrayItem, max);
        }
        return max;
    }

    static double max(double[] array){
        double max = array[0];
        for (double arrayItem : array){
            max = Math.max(arrayItem, max);
        }
        return max;
    }

    //    MaxPositive
    static int maxPositive(int[] array){
        return max(array);
    }

    static double maxPositive(double[] array){
        return max(array);
    }

    //    Multiplication
    static long multiplication(int[] array){
        long mult = 1;
        for (int arrayItem : array) {
            mult *= arrayItem;
        }
        return mult;
    }

    static double multiplication(double[] array){
        double mult = 1;
        for (double arrayItem : array) {
            mult *= arrayItem;
        }
        return mult;
    }

    //    Modulus
    static int modulus(int[] array){
        return array[0] % array[array.length-1];
    }

    static double modulus(double[] array){
        return array[0] % array[array.length-1];
    }

    //    SecondLargestElement
    static int getSecondLargestElement(int[] array){
        int max = max(array);
        int secondLargest = array[0];
        for (int arrayItem : array){
            if(arrayItem > secondLargest && arrayItem < max) secondLargest = arrayItem;
        }
        return secondLargest;
    }

    static double getSecondLargestElement(double[] array){
        double max = max(array);
        double secondLargest = array[0];
        for (double arrayItem : array){
            if(arrayItem > secondLargest && arrayItem < max) secondLargest = arrayItem;
        }
        return secondLargest;
    }

    public static void main(String[] args) {

////        Sum
//        System.out.println("Sum of arrayInt = " + sum(arrayInt));
//        System.out.print("Sum of arrayDouble = ");
//        System.out.format("%.4f%n", sum(arrayDouble));
//        System.out.println();
//
////        Min
//        System.out.println("Minimum of arrayInt = " + min(arrayInt));
//        System.out.println("Minimum of arrayDouble = " + min(arrayDouble));
//        System.out.println();
//
////        Max
//        System.out.println("Maximum of arrayInt = " + max(arrayInt));
//        System.out.println("Maximum of arrayDouble = " + max(arrayDouble));
//        System.out.println();
//
////        MaxPositive
//        if (maxPositive(arrayInt) > 0){
//            System.out.println("MaximumPositive of arrayInt = " + maxPositive(arrayInt));
//        }
//        else System.out.println("There isn't positive items");
//
//        if (maxPositive(arrayDouble) > 0){
//            System.out.println("MaximumPositive of arrayDouble = " + maxPositive(arrayDouble));
//        }
//        else System.out.println("There isn't positive items");
//        System.out.println();
//
////        Multiplication
//        System.out.println("Multiplication of arrayInt = " + multiplication(arrayInt));
//        System.out.print("Multiplication of arrayDouble = ");
//        System.out.format("%.4f%n", multiplication(arrayDouble));
//        System.out.println();
//
////        Modulus of first and last array's element
//        if(arrayInt[arrayInt.length-1] != 0){
//            System.out.println("Modulus of first and last arrayInt element = " + modulus(arrayInt));
//        }else {System.out.println("Division by 0!!!");}
//        if(arrayDouble[arrayDouble.length-1] != 0){
//            System.out.print("Modulus of first and last arrayDouble element = ");
//            System.out.format("%.4f%n", modulus(arrayDouble));
//        }else {System.out.println("Division by 0!!!");}
//        System.out.println();
//
////        Second largest element
//        System.out.println("Second largest element of arrayInt = " + getSecondLargestElement(arrayInt));
//        System.out.println("Second largest element of arrayDouble = " + getSecondLargestElement(arrayDouble));

        System.out.println(Arrays.toString(ArrayUtils.reverse(arrayInt)));
        System.out.println(Arrays.toString(ArrayUtils.findEvenElements(arrayInt)));

    }
}
