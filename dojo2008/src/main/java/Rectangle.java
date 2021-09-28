public class Rectangle extends Shape implements Comparable<Shape>  {
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public int compareTo(Shape shape) {
        return Double.compare(area(), shape.area());
    }
}
