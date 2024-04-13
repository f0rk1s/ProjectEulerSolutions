public class Main {
    public static void main(String[] args) {

        int limit = 10001;
        int[] primeNumbers = new int[limit];
        primeNumbers[0] = 2; //first prime number
        int numberOfPrimes = 1;
        int i = 1;
        outerLoop:
        while (numberOfPrimes < limit) {
            i += 2;
            for (int j = 1; j < numberOfPrimes; j++) {
                if (i % primeNumbers[j] == 0) {
                    continue outerLoop;
                }
            }
            primeNumbers[numberOfPrimes++] = i;
        }
        int result = primeNumbers[limit - 1];
        System.out.println(result);
    }
}