public class Main {

    static boolean isPrime(int n) {

        if (n % 2 == 0) {
            return false;
        }
        if (n % 3 == 0) {
            return false;
        }

        for (int i = 5; i <= (int) Math.sqrt(n); i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int limit = 2000000;
        long sum = 5; //2 + 3
        for (int i = 5; i < limit; i += 6) {
            if (isPrime(i)) {
                sum += i;
            }
            if (isPrime(i + 2)) {
                sum += i + 2;
            }
        }
        System.out.println(sum);
    }
}