import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double area, side, radius, base, height, width;
        List<Shape> shapes = new ArrayList<>();

        height = 2.;
        base = 5.;
        shapes.add(new Triangle(base, height));

        height = 3.;
        base = 4.;
        shapes.add(new Triangle(base, height));

        area = 1.1234;
        shapes.add(new CustomShape(area));

        area = 16.1;
        shapes.add(new CustomShape(area));

        side = 1.1234;
        shapes.add(new Square(side));

        width = 4.;
        shapes.add(new Rectangle(width, height));

        radius = 1.1234;
        shapes.add(new Circle(radius));

        // Act
        Collections.sort(shapes);

        for (Shape s : shapes) {
            System.out.println(s.area());
        }
    }
}
