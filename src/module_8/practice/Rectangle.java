package module_8.practice;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double x, double y, double height, double width) {
        super(new Point(x, y));
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return '\n' + "Rectangle ["
                + getPoint()
                + ", height=" + height
                + ", width=" + width
                + ", area=" + String.format("%.2f",getArea())
                + "]";
    }
}
