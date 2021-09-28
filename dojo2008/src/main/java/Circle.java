public class Circle extends Shape implements Comparable<Shape>  {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public int compareTo(Shape shape) {
        return Double.compare(area(), shape.area());
    }
}
