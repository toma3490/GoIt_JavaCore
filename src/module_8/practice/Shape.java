package module_8.practice;

public abstract class Shape implements Comparable<Shape> {

    private Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public abstract double getArea();

    public String getClassName(){
        return this.getClass().getSimpleName();
    }

    @Override
    public int compareTo(Shape shape) {
        return Double.compare(getArea(), shape.getArea());
    }
}
