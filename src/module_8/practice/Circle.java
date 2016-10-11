package module_8.practice;

public class Circle extends Shape {
    private double radius;

    public Circle(double x, double y, double radius){
        super(new Point(x, y));
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return '\n' + "Circle{" +
                "radius=" + radius +
                ", area=" + String.format("%.2f", getArea())+
                '}';
    }
}
