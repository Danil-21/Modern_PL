import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("N должно быть больше 0");
            return;
        }

        System.out.println("Результат:");

        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit + " ");
            n = n / 10;
        }
    }
}
