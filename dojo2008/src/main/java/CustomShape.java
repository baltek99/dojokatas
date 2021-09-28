public class CustomShape extends Shape implements Comparable<Shape> {
    double area;

    public CustomShape(double area) {
        this.area = area;
    }

    @Override
    public double area() {
        return area;
    }

    @Override
    public int compareTo(Shape shape) {
        return Double.compare(area(), shape.area());
    }
}
