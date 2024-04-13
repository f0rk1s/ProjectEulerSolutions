import java.util.ArrayList;

public class Main {
     /*
     buggy and messy, didn't try to solve the bug when there is a "0" in the quotient. but still finds the correct result
     for numbers between 1000 and 10000, i don't know about the rest, and i also don't know why it works.
      */
    public static int findLengthOfRecurringCycle(int n) {
        int dividend, divisor, quotient, remainder;
        dividend = 1;
        divisor = n;
        int substracter;
        ArrayList<Integer> remainders = new ArrayList<>(); //the set of remainders cannot be greater than 10.
        remainders.add(1);
        int index = -1;
        remainder = 0;
        //the operation
        while (true) {
            quotient = dividend / divisor;
            if (quotient < 1) {
                dividend *= 10;
                continue;
            }
            remainder = dividend - quotient * divisor;
            if (remainder == 0) {
                break;
            } else if (searchForTheNumberInArray(remainders, remainder) != -1) {
                index = searchForTheNumberInArray(remainders, remainder);
                break;
            }
            remainders.add(remainder);
            dividend = remainder;
        }
        return index;

    }

    public static int searchForTheNumberInArray(ArrayList<Integer> arr, int target) {

        if (arr.contains(target)) {
            return arr.size() - arr.indexOf(target);
        }
        return -1; //target number doesn't exist in the array
    }
    public static void main(String[] args) {

        int max = 0;
        int result = 0;
        for (int i = 2; i <= 1000; i++) {

            int x = findLengthOfRecurringCycle(i);

            if (x > max) {
                max = x;
                result = i;
            }
        }
        System.out.println("max :" + max + " result : " + result);
    }
}
