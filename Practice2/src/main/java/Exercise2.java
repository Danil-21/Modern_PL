import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите X: ");
        double x = scanner.nextDouble();

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("N должно быть больше 0");
            return;
        }

        double sum = 1.0;
        double current_drob = 1.0;

        for (int i = 1; i <= n; i++) {
            current_drob = current_drob * x / i;
            sum += current_drob;
        }

        System.out.println("Результат: " + sum);
    }

}
