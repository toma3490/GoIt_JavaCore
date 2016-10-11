package module_8.practice;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, 7.5);
        System.out.println(String.format("%.2f", circle1.getArea()));

        Circle circle2 = new Circle(0, 0, 6);
        System.out.println(String.format("%.2f", circle2.getArea()));

        Circle circle3 = new Circle(0, 0, 7);
        System.out.println(String.format("%.2f", circle3.getArea()));

        Square square = new Square(0, 0, 20);
        System.out.println(String.format("%.2f", square.getArea()));

        Rectangle rectangle = new Rectangle(0, 0, 20, 40);
        System.out.println(String.format("%.2f", rectangle.getArea()));

//        System.out.println("===");
        Group<Shape> group1 = new Group<>();
//        Group<Shape> group2 = new Group<>();
//    Group<Rectangle> group = new Group<>();
//    Group<Circle> group = new Group<>();
        group1.add(circle1);
        group1.add(circle2);
        group1.add(circle3);
        group1.add(square);
        group1.add(rectangle);
//        System.out.println(group1);
//        System.out.println(group2);

//        group1.addAll(group2);
//        System.out.println(group1);

        System.out.println(group1.getMaxArea());
        System.out.println(String.format("%.2f", group1.getSumArea()));
    }
}
