import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0){
            System.out.println("Длинны сторон должны быть положительными");
            System.exit(1);
        }

        if (a + b <= c || a + c <= b || b + c <= a){
            System.out.println("Треугольника с такими сторонами не существует");
            System.exit(1);
        }

        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.printf("Площадь треугольника равна: %.2f", area);
    }
}
