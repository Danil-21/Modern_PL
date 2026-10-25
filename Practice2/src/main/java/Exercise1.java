import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите А:");
        int a = scanner.nextInt();

        System.out.print("Введите B:");
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("A должно быть меньше B");
            return;
        }

        System.out.println("Числа от A до B:");

        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }

        int count = b - a + 1;
        System.out.println("\nКоличество чисел: " + count);
    }
}
