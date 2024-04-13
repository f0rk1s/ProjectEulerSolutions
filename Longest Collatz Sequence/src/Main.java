public class Main {

    static int collatzCounter(int[] arr, int n) {
        long N = n;
        int counter = 0;
        while (N != 1) {
            if (N < 1000000 && arr[(int) N - 1] != 0) {
                return arr[n - 1] = counter + arr[(int) N - 1];
            }
            if (N % 2 == 0) {N /= 2;}
            else {N = N * 3 + 1;}
            counter++;
        }
        return arr[n - 1] = counter + 1;
    }

    public static void main(String[] args) {
        int limit = 1000000;
        int[] collatzValues = new int[limit];
        int max = 0;
        int index = 0;
        for (int i = 2; i < limit; i++) {
            int n = collatzCounter(collatzValues, i);
            if (n > max) {
                max = n;
                index = i;
            }
        }

        System.out.println(index);
        System.out.println(collatzCounter(collatzValues, index));
        System.out.println(max);
    }
}