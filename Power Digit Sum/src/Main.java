public class Main {
    public static void main(String[] args) {

        //instead of multiplying by 2 for 1000 times, we will multiply every single digit with 2. (long multiplication)

        int number = 2; //our first number
        int[] arr = new int[1000]; //10^1000 is a 1001-digit number, so 1000 digits must be enough for us.

        arr[0] = number;
        int numberOfDigits = 1;
        for (int i = 1; i < 1000; i++) { //multiply 999 times
            int index = 0; //digit index, we will put the digits in the reversed order (1024 -> {4,2,0,1})
            int remainder = 0;

            for (; index < numberOfDigits; index++) { //basic multiplication operation that we learned in primary school.
                int x = (arr[index] * 2) + remainder;
                remainder = 0;
                if (x > 9) {
                    if (index + 1 == numberOfDigits) {
                        arr[index] = x - 10;
                        arr[index + 1] = 1;
                        numberOfDigits++;
                        break;
                    }
                    arr[index] = x - 10;
                    remainder = 1;
                } else {
                    arr[index] = x;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
