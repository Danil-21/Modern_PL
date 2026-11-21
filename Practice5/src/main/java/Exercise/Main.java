package Exercise;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Figure first = new Triangle(3, 4, 5);

        Figure[] figures = {
                first,
                new Rectangle(2, 4),
                new Triangle(5, 5, 6),
                new Rectangle(3, 3)
        };

        System.out.println("Исходный массив:");

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getDescription());
            System.out.println("Площадь: " + figures[i].calculateArea());
        }

        Arrays.sort(figures);

        System.out.println("\nОтсортированный массив:");

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getDescription());
            System.out.println("Площадь: " + figures[i].calculateArea());
        }


    }
}
