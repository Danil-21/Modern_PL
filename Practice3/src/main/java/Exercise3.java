public class Exercise3 {

    public static double[] getAvgArray(int[] arr) {
        double[] b = new double[arr.length];
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            b[i] = (sum / (i + 1));
        }

        return b;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 3, 6, 2, 7, 9, 0, 10, 11};

        int n = arr.length;

        double[] avgArr = getAvgArray(arr);

        System.out.println("Массив B:");

        for (int i = 0; i < avgArr.length; i++) {
            System.out.print(avgArr[i] + " ");
        }


    }
}
