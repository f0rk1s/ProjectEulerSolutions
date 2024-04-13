public class Main {

    static boolean checkPalindrome(int n) { //check if the number is palindrome
        String s = Integer.toString(n);

        int j = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    static boolean checkProductOf3DigitNumbers(int n) {

        int couple;
        for (int i = 999; i >= 100; i--) { //for all 3 digits numbers
            if (n % i == 0) {
                couple = n / i; //find its couple
                if (couple > 99 && couple < 1000) { //check if its 3 digits
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        for (int i = 998001; i > 10000; i--) { //999*999 = 998001, 100*100 = 10000. biggest and smallest values.
            if (checkPalindrome(i) && checkProductOf3DigitNumbers(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}