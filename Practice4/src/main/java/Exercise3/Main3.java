package Exercise3;

public class Main3 {

    public static void main(String[] args) {

        Figure figure = new Triangle(3, 4, 5);

        Figure[] figures = {
                figure,
                new Rectangle(4, 6),
                new Triangle(5, 5, 6),
                new Rectangle(2, 8),
        };

        System.out.println("ФИГУРЫ");

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getDescription());
            System.out.println("Площадь: " + figures[i].calculateArea());
            System.out.println();
        }

        System.out.println("Метод toString()");
        System.out.println(figures[0].toString());
        System.out.println(figures[1].toString());

        System.out.println("\nМетод equals()");
        Figure triangle2 = new Triangle(3, 4, 5);

        System.out.println("Равенство 1-го и 2-го треугольников: "
                + figure.equals(triangle2));

        System.out.println("Равенство треугольника и прямоугольника: "
                + figure.equals(figures[1]));

        System.out.println("\nМетод hashCode()");

        System.out.println("Хеш-код первого: " + figure.hashCode());
        System.out.println("Хеш-код второго: " + triangle2.hashCode());

        System.out.println("Хеш-коды равны: "
                + (figure.hashCode() == triangle2.hashCode()));
    }
}
