import ch.obermuhlner.math.big.BigDecimalMath;

public class Main {

    public static void main(String[] args) {

        int x = 99;
        String s = BigDecimalMath.factorial(x).toString();
        System.out.println(s);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - 48;
        }
        System.out.println("Result : " + sum);

    }

a
}