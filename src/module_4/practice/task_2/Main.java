package module_4.practice.task_2;

public class Main {
    public static void main(String[] args) {
        Point pointA = new Point(0, 0);
        Point pointB = new Point(1, 1);
        Point pointC = new Point(0, 1);
        Triangle triangle = new Triangle(pointA, pointB, pointC);
        triangle.printInfo();
    }
}
