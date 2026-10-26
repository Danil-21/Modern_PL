import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 6, 2, 7, 9, 0, 10, 11};

        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            for (int i = 0; i < 2 && left <= right; i++) {
                System.out.print(arr[left] + " ");
                left++;
            }
            for (int i = 0; i < 2 && left <= right; i++) {
                System.out.print(arr[right] + " ");
                right--;
            }
        }

    }
}
