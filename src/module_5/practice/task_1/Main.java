package module_5.practice.task_1;

import module_5.practice.task_2.ViewHash;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
//        triangle.hide();
//        triangle.show();
//        triangle.show();
//        triangle.hide();
//        triangle.hide();
//        triangle.isShowing();
//
//        Square square = new Square();
//        square.hide();
//        square.show();
//        square.show();
//        square.hide();
//        square.hide();
//        square.hide();
        Square square1 = new Square();
        square1.show();

        Square square2 = new Square();
        square2.show();

        ViewHash viewHash1 = new ViewHash();
        ViewHash viewHash2 = new ViewHash();

        viewHash1.addView(square1);
        viewHash1.addView(square2);
        System.out.println(square1.equals(square2));
    }
}
