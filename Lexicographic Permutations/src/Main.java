import java.util.ArrayList;

public class Main {

    public static int factorial (int n) {
        int x = 1;

        for (int i = 1; i <= n; i++) {
            x *= i;
        }

        return x;
    }
    public static void main(String[] args) {


        int thNumber = 1000001;
        int numberOfDigits = 10;

        ArrayList<Integer> digits= new ArrayList<>();

        for (int i = 0; i < numberOfDigits; i++) {
            digits.add(i);
        }


        StringBuilder sequence = new StringBuilder();

        int f = numberOfDigits - 1;
        while (thNumber > 1) {
            int fact = factorial(f--);
            int index = thNumber / fact;
            sequence.append(digits.get(index));
            digits.remove(index);
            thNumber = thNumber % fact;


        }

        while (!digits.isEmpty()) {
            sequence.append(digits.remove(0));
        }


        System.out.println(sequence.toString());

    }
}
