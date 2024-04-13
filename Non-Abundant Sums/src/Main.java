public class Main {
    /*
    slightly simplified version. solves instantly. it took 7 seconds to solve in the first version.
     */
    public static boolean checkAbundant(int n) {
        int sum = 1; //it is divisible by 1
        for (int i = 2; i < Math.sqrt(n); i++) { //in general
            if (n % i == 0) {
                sum += (n / i) + i;
            }
        }

        if (n % Math.sqrt(n) == 0) { //for the square root of n
            sum += Math.sqrt(n);
        }
        return sum > n;
    }


    public static void main(String[] args) {
        int[] abundants = new int[6965]; //6965 is the number of abundant numbers less than 28124

        int abundantCounter = 0;
        for (int i = 12; i < 28124; i++) { //find all abundants less than 28124
            if (checkAbundant(i)) {
                abundants[abundantCounter++] = i;
            }
        }

        System.out.println("Abundent counter : " + abundantCounter);

        long sum = 0;
        boolean[] arr = new boolean[28124 * 2 + 1];
        for (int i = 0; i < 6965; i++) {
            for (int j = 0; j <= i; j++) {
                arr[abundants[i] + abundants[j]] = true;
            }
        }

        for (int i = 0; i < 28123; i++) {
            if (!arr[i]) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}