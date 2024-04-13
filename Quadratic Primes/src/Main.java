public class Main {

    static boolean isPrime (int n) { //check if the number n is prime
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        if (n % 3 == 0) {
             return false;
        }
        for (int i = 5; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    static int testSequence (int a, int b) { //check the strength of the sequence and return it.

        if (!isPrime(40 * (40 + a) + b)) { //this is used for speeding up the process of finding a sequence stronger than 40
            return 0;
        }

        for (int i = 0; i < 1000; i++) {
            int x = i * (i + a) + b;
            if (!isPrime(x)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    //we know that b is prime, odd and between 40 and 1000. we can begin the process by finding the list of possible b's.
        int[] bValues = new int[500];
        int bIndex = 0;
        for (int i = 999; i > 40; i -= 2) { //find the possible b values
            if (isPrime(i)) {
                bValues[bIndex++] = i;
            }
        }
        int max = 0;
        int valueA = 0;
        int valueB = 0;
        //for the value b
        for (int i = 0; i < bIndex + 1; i++) {
            //for the value a
            for (int j = -999; j < 1001; j += 2) { //"a" value must be an odd number.
                int x = testSequence(j, bValues[i]);
                if (x > max) {
                    max = x;
                    valueA = j;
                    valueB = bValues[i];
                }
            }
        }
        System.out.println("Equation : n^2 + " + valueA + "n + " + valueB);
        System.out.println("Equation strength : " + max);
        System.out.println("Result : " + valueA*valueB);
    }
}
