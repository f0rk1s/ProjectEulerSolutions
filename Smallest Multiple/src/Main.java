public class Main {
    public static void main(String[] args) {
        int upperLimit = 20;
        int n = 3; //first number to be checked
        int[] primeMultipliers = new int [upperLimit]; //number of prime multiplies in first n numbers cannot be greater than n.
        primeMultipliers[0] = 2; //array to store prime multipliers.
        int j = 1; //number of elements in the array
        while (n <= upperLimit) {
            int x = n;
            for (int i = 0; i < j; i++) {
                int a = primeMultipliers[i];
                if (x % a == 0) {x = x / a;} //divide n by every single number in our array (if the remainder is 0)
            }
            if (x != 1) {
                primeMultipliers[j++] = x; //insert the survivor prime to the array
            }
            n++;
        }

        //multiply all prime multipliers and find the result.
        int result = 1;
        for (int i = 0; i < j; i++) {
            result *= primeMultipliers[i];
        }
        System.out.println(result);
    }
}