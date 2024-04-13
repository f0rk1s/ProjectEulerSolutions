public class Main {

    public static int sumOfProperDivisors(int n) {
        int sum = 0;
        double sqrt = Math.sqrt(n);
        for (int i = 1; i < sqrt; i++) {
            if (n % i == 0) {
                sum += n / i;
                sum += i;
            }
        }
        if (n % sqrt == 0) {
            sum += sqrt;
        }
        return sum - n;
    }

    public static void main(String[] args) {
        int limit = 10000;

        int result = 0;

        for (int i = 6; i < limit; i++) {
            int dValue1 = sumOfProperDivisors(i);
            if (dValue1 > i) {
                int dValue2 = sumOfProperDivisors(dValue1);

                if (dValue2 == i) {
                    result += (i + dValue1);
                }
            }
        }

        System.out.println(result);
    }
}