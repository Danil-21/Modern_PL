import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите M: ");
        int m = scanner.nextInt();

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        System.out.print("Введите D: ");
        int d = scanner.nextInt();

        if (m <= 0 || n <= 0) {
            return;
        }

        int[][] arr = new int[m][n];

        System.out.println("Введите " + n + " чисел:");

        for (int i = 0; i < n; i++) {
            arr[0][i] = scanner.nextInt();
        }

        for (int j = 1; j < m; j++) {
            for (int k = 0; k < n; k++) {
                arr[j][k] = arr[j-1][k] * d;
            }
        }

        System.out.println("Результат:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
