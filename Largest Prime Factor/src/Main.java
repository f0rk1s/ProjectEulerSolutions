public class Main {
    public static void main(String[] args) {

        //find the largest prime factor of the given number

        long number = 600851475143L;
        System.out.println(largestPrime(number));

    }

    static long largestPrime(long n) {

        //start from 2
        while (n % 2 == 0) { //divide by 2 until you can't
            n = n / 2;
        }
        if (n == 1) { //n is a power of 2
            return 2;
        }

        long divider = 3;

        while (divider <= Math.sqrt(n)) { //we don't have to try the numbers bigger than its sqrt because its couple was smaller than sqrt, so it was already divided.
            while (n % divider == 0) {
                n = n / divider;
            }
            divider += 2; //you may notice that we also try odd composite numbers, it will not make any difference because we already tried their factors before the composite number itself.
        }
        if (n == 1) {
            return divider - 2; //we incremented divider one more time even if it was not necessary.
        }
        return n; //our last n value couldn't reach 1 because n itself is a prime number.
    }
}