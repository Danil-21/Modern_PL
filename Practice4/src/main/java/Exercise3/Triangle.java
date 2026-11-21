package Exercise3;

import java.util.Objects;

public class Triangle extends Figure{

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        super("Треугольник");

        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException(
                    "Стороны должны быть положительными числами");
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException(
                    "Такого треугольника не существует");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String getDescription() {
        return "Треугольник со сторонами: " + a + ", " + b + ", " + c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(a, triangle.a) == 0 && Double.compare(b, triangle.b) == 0 && Double.compare(c, triangle.c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), a, b, c);
    }
}
