public class Main {

    static int numberOfDivisors(int n) {
        double x = Math.sqrt(n);
        int numberOfDivisors = 0;
        for (int i = 1; i < x; i++) {
            if (n % i == 0) {
                numberOfDivisors++;
            }
        }
        numberOfDivisors *= 2;
        if (x == (int) x) {
            numberOfDivisors++;
        }
        return numberOfDivisors;
    }

    static int triangleNumber(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 1;
        int triangleNumber = triangleNumber(n);
        //produce triangle numbers and check their number of divisors
        while (numberOfDivisors(triangleNumber) <= 500) {
            triangleNumber = triangleNumber(n++);
        }

        System.out.println(triangleNumber);
    }
}