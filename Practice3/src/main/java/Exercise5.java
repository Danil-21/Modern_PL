import java.util.Scanner;

public class Exercise5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = -1;

        while (choice != 0) {
            showMenu();

            System.out.print("Выберите пункт: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    double[] sides = inputSides();

                    if (sides != null) {
                        double area = calculateArea(sides);
                        printResult(area);
                    }
                    break;
                case 2:
                    showProgramInfo();
                    break;
                case 3:
                    showDeveloperInfo();
                    break;
                case 0:
                    System.out.println("Выход из программы");
                    break;
                default:
                    System.out.println("Неверный пункт меню!");
            }
        }
    }

    public static void showMenu() {
        System.out.println("\nГЛАВНОЕ МЕНЮ");
        System.out.println("1. Выполнить расчёт");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("0. Выход");
    }

    public static double[] inputSides() {
        while (true) {
            double[] sides = new double[3];

            System.out.println("\nВведите стороны треугольника");
            System.out.println("Для возврата в меню введите 0 вместо первой стороны.");

            System.out.print("A: ");
            sides[0] = scanner.nextDouble();

            if (sides[0] == 0) {
                return null;
            }

            System.out.print("B: ");
            sides[1] = scanner.nextDouble();

            System.out.print("C: ");
            sides[2] = scanner.nextDouble();

            if (checkSides(sides)) {
                return sides;
            }

            System.out.println("Повторите ввод сторон.");
        }
    }

    public static boolean checkSides(double[] sides) {
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Ошибка: стороны должны быть положительными!");
            return false;
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Ошибка: такого треугольника не существует!");
            return false;
        }

        return true;
    }

    public static double calculateArea(double[] sides) {
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];

        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return area;
    }

    public static void printResult(double area) {
        System.out.printf("Площадь треугольника: %.2f%n", area);
    }

    public static void showProgramInfo() {
        System.out.println("Программа вычисляет площадь треугольника по формуле Герона.");
    }

    public static void showDeveloperInfo() {
        System.out.println("Разработчик: Щербаков Данил Сергеевич");
    }
}
