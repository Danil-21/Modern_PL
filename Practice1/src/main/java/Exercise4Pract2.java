import java.util.Scanner;

public class Exercise4Pract2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int choice = -1;

        while (choice != 0) {
            System.out.println("\nГЛАВНОЕ МЕНЮ");
            System.out.println("1. Выполнить расчёт");
            System.out.println("2. Информация о программе");
            System.out.println("3. Информация о разработчике");
            System.out.println("0. Выход");

            System.out.print("Выберите пункт: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculate();
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

    public static void calculate() {
        while (true) {
            System.out.println("\nВведите стороны треугольника");
            System.out.println("Для возврата в меню введите 0 вместо первой стороны.");

            System.out.print("A: ");
            double a = scanner.nextDouble();

            if (a == 0) {
                return;
            }

            System.out.print("B: ");
            double b = scanner.nextDouble();

            System.out.print("C: ");
            double c = scanner.nextDouble();

            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Ошибка: стороны должны быть положительными!");
                continue;
            }

            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("Ошибка: такого треугольника не существует!");
                continue;
            }

            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.printf("Площадь треугольника: %.2f%n", area);
            return;
        }
    }

    public static void showProgramInfo() {
        System.out.println("Программа вычисляет площадь треугольника по формуле Герона.");
    }

    public static void showDeveloperInfo() {
        System.out.println("Разработчик: Щербаков Данил Сергеевич");
    }
}
