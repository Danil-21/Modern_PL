package Exercise;

import java.util.Objects;

public class Rectangle extends Figure {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        super("Прямоугольник");

        if (height <= 0 || width <= 0) {
            throw new IllegalArgumentException(
                    "Стороны должны быть положительными числами");
        }

        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public String getDescription() {
        return "Прямоугольник со сторонами: " + height + ", " + width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(height, rectangle.height) == 0 && Double.compare(width, rectangle.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, width);
    }
}
