package module_4.practice.task_2;

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private double slideAB;
    private double slideAC;
    private double slideBC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;

        this.slideAB = getLength(pointA, pointB);
        this.slideAB = getLength(pointA, pointC);
        this.slideAB = getLength(pointB, pointC);

        if (!isTriangle()){
            System.out.println("It is not triangle!!");
        }
    }

    private double getLength(Point pointA, Point pointB) {
        return Math.sqrt((pointA.getX() - pointB.getX()) * (pointA.getX() - pointB.getX()) + (pointA.getY() - pointB.getY()) * (pointA.getY() - pointB.getY()));
    }

    private boolean isTriangle(){
        int diff1 = pointA.getX() - pointB.getX();
        int diff2 = pointA.getY() - pointB.getY();
        int diff3 = pointC.getX() - pointB.getX();
        int diff4 = pointC.getY() - pointB.getY();

        return diff1 * diff3 != diff2 * diff4;
    }

    private double calcPerimeter(){
        return slideAB + slideAC + slideBC;
    }

    public void printInfo(){
        System.out.println("Perimeter: " + calcPerimeter() + " Area: " + calcArea());
    }

    private double calcArea() {
        double halfPerimeter = calcPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - slideAB) * (halfPerimeter - slideAC) * (halfPerimeter - slideBC));
    }

}

