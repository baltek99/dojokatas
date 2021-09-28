public class Triangle extends Shape implements Comparable<Shape> {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base * height / 2.0;
    }

    @Override
    public int compareTo(Shape shape) {
        return Double.compare(area(), shape.area());
    }
}
