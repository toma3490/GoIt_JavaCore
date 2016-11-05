package module_11.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your data: " + '\n');

        String line = "";
        while (!(line = scanner.nextLine()).equals("q")){
            try{
                integerList.add(Integer.valueOf(line));
            }catch (NumberFormatException e){
                try{
                    doubleList.add(Double.valueOf(line));
                }catch (NumberFormatException e1){
                    stringList.add(line);
                }
            }
        }
        scanner.close();

        System.out.println("Doubles " + doubleList);
        System.out.println("Integer" + integerList);
        System.out.println("Strings" + stringList);
    }
}
