package module_7.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Benchmark {
    public static final int ITERATIONS_QUANTITY_1 = 1_000;
    public static final int ITERATIONS_QUANTITY_2 = 10_000;

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<String> stringsList = new ArrayList<>();
        List<Integer> intLinkedList = new LinkedList<>();
        List<String> stringsLinkedList = new LinkedList<>();

        System.out.println("Add, quantity iterations = " + ITERATIONS_QUANTITY_1);
        System.out.println("ArrayList<Integer> " + intListCalcTimeAdd(intList, ITERATIONS_QUANTITY_1));
        System.out.println("ArrayList<String> " + stringListCalcTimeAdd(stringsList, ITERATIONS_QUANTITY_1));
        System.out.println("LinkedList<Integer> " + intListCalcTimeAdd(intLinkedList, ITERATIONS_QUANTITY_1));
        System.out.println("LinkedList<String> " + stringListCalcTimeAdd(stringsLinkedList, ITERATIONS_QUANTITY_1) + '\n');

        System.out.println("Set, quantity iterations = " + ITERATIONS_QUANTITY_1);
        System.out.println("ArrayList<Integer> " + intListCalcTimeSet(intList, ITERATIONS_QUANTITY_1));
        System.out.println("ArrayList<String> " + stringListCalcTimeSet(stringsList, ITERATIONS_QUANTITY_1));
        System.out.println("LinkedList<Integer> " + intListCalcTimeSet(intLinkedList, ITERATIONS_QUANTITY_1));
        System.out.println("LinkedList<String> " + stringListCalcTimeSet(stringsLinkedList, ITERATIONS_QUANTITY_1) + '\n');

        System.out.println("Get, quantity iterations = " + ITERATIONS_QUANTITY_1);
        System.out.println("ArrayList<Integer> " + intListCalcTimeGet(intList, ITERATIONS_QUANTITY_1));
        System.out.println("ArrayList<String> " + stringListCalcTimeGet(stringsList, ITERATIONS_QUANTITY_1));
        System.out.println("LinkedList<Integer> " + intListCalcTimeGet(intLinkedList, ITERATIONS_QUANTITY_1));
        System.out.println("LinkedList<String> " + stringListCalcTimeGet(stringsLinkedList, ITERATIONS_QUANTITY_1) + '\n');

        System.out.println("Remove, quantity iterations = " + ITERATIONS_QUANTITY_1);
        System.out.println("ArrayList<Integer> " + intListCalcTimeRemove(intList, ITERATIONS_QUANTITY_1));
        System.out.println("ArrayList<String> " + stringListCalcTimeRemove(stringsList, ITERATIONS_QUANTITY_1));
        System.out.println("LinkedList<Integer> " + intListCalcTimeRemove(intLinkedList, ITERATIONS_QUANTITY_1));
        System.out.println("LinkedList<String> " + stringListCalcTimeRemove(stringsLinkedList, ITERATIONS_QUANTITY_1) + '\n');

        System.out.println("Add, quantity iterations = " + ITERATIONS_QUANTITY_2);
        System.out.println("ArrayList<Integer> " + intListCalcTimeAdd(intList, ITERATIONS_QUANTITY_2));
        System.out.println("ArrayList<String> " + stringListCalcTimeAdd(stringsList, ITERATIONS_QUANTITY_2));
        System.out.println("LinkedList<Integer> " + intListCalcTimeAdd(intLinkedList, ITERATIONS_QUANTITY_2));
        System.out.println("LinkedList<String> " + stringListCalcTimeAdd(stringsLinkedList, ITERATIONS_QUANTITY_2) + '\n');

        System.out.println("Set, quantity iterations = " + ITERATIONS_QUANTITY_2);
        System.out.println("ArrayList<Integer> " + intListCalcTimeSet(intList, ITERATIONS_QUANTITY_2));
        System.out.println("ArrayList<String> " + stringListCalcTimeSet(stringsList, ITERATIONS_QUANTITY_2));
        System.out.println("LinkedList<Integer> " + intListCalcTimeSet(intLinkedList, ITERATIONS_QUANTITY_2));
        System.out.println("LinkedList<String> " + stringListCalcTimeSet(stringsLinkedList, ITERATIONS_QUANTITY_2) + '\n');

        System.out.println("Get, quantity iterations = " + ITERATIONS_QUANTITY_2);
        System.out.println("ArrayList<Integer> " + intListCalcTimeGet(intList, ITERATIONS_QUANTITY_2));
        System.out.println("ArrayList<String> " + stringListCalcTimeGet(stringsList, ITERATIONS_QUANTITY_2));
        System.out.println("LinkedList<Integer> " + intListCalcTimeGet(intLinkedList, ITERATIONS_QUANTITY_2));
        System.out.println("LinkedList<String> " + stringListCalcTimeGet(stringsLinkedList, ITERATIONS_QUANTITY_2) + '\n');

        System.out.println("Remove, quantity iterations = " + ITERATIONS_QUANTITY_2);
        System.out.println("ArrayList<Integer> " + intListCalcTimeRemove(intList, ITERATIONS_QUANTITY_2));
        System.out.println("ArrayList<String> " + stringListCalcTimeRemove(stringsList, ITERATIONS_QUANTITY_2));
        System.out.println("LinkedList<Integer> " + intListCalcTimeRemove(intLinkedList, ITERATIONS_QUANTITY_2));
        System.out.println("LinkedList<String> " + stringListCalcTimeRemove(stringsLinkedList, ITERATIONS_QUANTITY_2));
    }

    public static void addIntList(List<Integer> list, int iterQuantity){
        for (int i = 0; i < iterQuantity; i++) {
            list.add(i);
        }
    }

    public static void addStringList(List<String> list, int iterQuantity){
        for (int i = 0; i < iterQuantity; i++) {
            list.add("Item");
        }
    }

    public static void setIntList(List<Integer> list, int iterQuantity){
        for (int i = 0; i < iterQuantity; i++) {
            list.set(i, i++);
        }
    }

    public static void setStringList(List<String> list, int iterQuantity){
        for (int i = 0; i < iterQuantity; i++) {
            list.set(i, "NotItem");
        }
    }

    public static void getIntList(List<Integer> list, int iterQuantity){
        for (int i = 0; i < iterQuantity; i++) {
            list.get(i);
        }
    }

    public static void getStringList(List<String> list, int iterQuantity){
        for (int i = 0; i < iterQuantity; i++) {
            list.get(i);
        }
    }

    public static void removeIntList(List<Integer> list, int iterQuantity){
        addIntList(list, iterQuantity);
        for (int i = iterQuantity; i > 0; i--) {
            list.remove(i);
        }
    }

    public static void removeStringList(List<String> list, int iterQuantity){
        addStringList(list, iterQuantity);
        for (int i = iterQuantity; i > 0; i--) {
            list.remove(i);
        }
    }

    public static long intListCalcTimeAdd(List<Integer> list, int iterQuantity){
        long start = System.currentTimeMillis();
        addIntList(list, iterQuantity);
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long stringListCalcTimeAdd(List<String> list, int iterQuantity){
        long start = System.currentTimeMillis();
        addStringList(list, iterQuantity);
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long intListCalcTimeSet(List<Integer> list, int iterQuantity){
        long start = System.currentTimeMillis();
        setIntList(list, iterQuantity);
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long stringListCalcTimeSet(List<String> list, int iterQuantity){
        long start = System.currentTimeMillis();
        setStringList(list, iterQuantity);
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long intListCalcTimeGet(List<Integer> list, int iterQuantity){
        long start = System.currentTimeMillis();
        getIntList(list, iterQuantity);
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long stringListCalcTimeGet(List<String> list, int iterQuantity){
        long start = System.currentTimeMillis();
        getStringList(list, iterQuantity);
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long intListCalcTimeRemove(List<Integer> list, int iterQuantity){
        long start = System.currentTimeMillis();
        removeIntList(list, iterQuantity);
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long stringListCalcTimeRemove(List<String> list, int iterQuantity){
        long start = System.currentTimeMillis();
        removeStringList(list, iterQuantity);
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
