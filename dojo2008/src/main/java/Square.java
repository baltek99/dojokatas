public class Square extends Shape implements Comparable<Shape> {
    double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public double area() {
        return side * side;
    }

    @Override
    public int compareTo(Shape shape) {
        return Double.compare(area(), shape.area());
    }
}
