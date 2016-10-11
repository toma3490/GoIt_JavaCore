package module_8.practice;

public class Square extends Rectangle {

    public Square(double x, double y, double height) {
        super(x, y, height, height);
    }

    @Override
    public String toString() {
        return '\n' + "Square ["
                + getPoint()
                + ", height=" + getHeight()
                + ", width=" + getWidth()
                + ", area=" + String.format("%.2f", getArea())
                + "]";
    }
}
