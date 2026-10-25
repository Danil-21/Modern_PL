import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        int positive = 0;
        int negative = 0;

        if (x > 0) {
            positive++;
        }
        else if (x < 0) {
            negative++;
        }
        if (y > 0) {
            positive++;
        }
        else if (y < 0) {
            negative++;
        }
        if (z > 0) {
            positive++;
        }
        else if (z < 0) {
            negative++;
        }
        System.out.println("отриц: " + negative);
        System.out.println("положит: " + positive);
    }
}
