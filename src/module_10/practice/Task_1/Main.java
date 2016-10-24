package module_10.practice.Task_1;

public class Main {
    public static void main(String[] args) {
        Number number = 0.1;
        Integer integer = 5;
        double result = Double.NaN;
        int[] array = new int[6];
        try{
//            number = Integer.parseInt("one");
//            integer = integer / (Integer) number;
//            integer = integer / 0;
//            System.out.println(array[6]);
//            number = 2.7;
//            result = integer / number.intValue();

        }catch (NumberFormatException e){
            System.out.println("Catch number format exception -> " + e.getMessage());
        }catch (ClassCastException e){
            System.out.println("Catch class cast exception -> " + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Catch arithmetic exception -> " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catch index out of bounds exception -> " + e.getMessage());
        }catch (Exception e){
            System.out.println("Catch some exception -> " + e.getMessage());
        }finally {
            System.out.println("finally block -> " + result);
        }

        try {
            String string = null;
            String test;
            string.toLowerCase();
        }catch (NullPointerException e){
            System.out.println("Catch null pointer exception -> " + e.getMessage());
        }finally {

        }
    }
}
