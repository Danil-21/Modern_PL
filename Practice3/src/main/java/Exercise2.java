public class Exercise2 {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 6, 2, 7, 9, 0, 10, 11};

        int n = arr.length;
        int count = 0;

        for (int i = n - 1; i >= 1; i--) {
            if (arr[i] > arr[i-1]) {
                System.out.print((i + 1) + " ");
                count++;
            }
        }

        System.out.println("\nКоличество элементов: " + count);
    }
}
