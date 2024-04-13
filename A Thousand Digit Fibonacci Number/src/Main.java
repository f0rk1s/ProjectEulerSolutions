public class Main {

    /*
    Q : What is the index of the first term in the Fibonacci sequence to contain 1000 digits?

    We will use arbitrary-precision for summation operation. Digits will be stored in an array.
     */

    public static int fibonacci(int index) {
        int index1 = 1;
        int index2 = 1;
        for (int i = 0; i < index - 2; i++) {
            int temp = index1 + index2;
            index1 = index2;
            index2 = temp;
        }

        return index2;
    }

    public static int[] sumTwoArrays (int[] arr1, int[] arr2) {

        int carryOut = 0;
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {

            int sumOfTwoDigits = arr1[i] + arr2[i] + carryOut;
            if (sumOfTwoDigits > 9) {
                result[i] = sumOfTwoDigits - 10;
                carryOut = 1;
                continue;
            }
            result[i] = sumOfTwoDigits;
            carryOut = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        int result = 2; //the first one doesn't come from the summation operation, so we start with 2.
        int targetNumberOfDigits = 1000;

        int[] index1 = new int[targetNumberOfDigits + 1];
        int[] index2 = new int[targetNumberOfDigits + 1];
        int[] temp;

        //initial case
        index1[0] = 1;
        index2[0] = 1;

        int numberOfDigits = 1; //number of digits in the array, initial value 1.

        //the digits will be in reversed order to make the summation easier.
        while (numberOfDigits != targetNumberOfDigits) {
            temp = sumTwoArrays(index1, index2);
            result++;
            //index1 = index2;
            for (int i = 0; i < index2.length; i++) {
                index1[i] = index2[i];
            }
            //index2 = temp;
            for (int i = 0; i < temp.length; i++) {
                index2[i] = temp[i];
            }
            //count the number of digits
            int counter = -1;
            for (int i = targetNumberOfDigits; i > 0; i--) {
                counter++;
                if (index2[i] != 0) {
                    numberOfDigits = targetNumberOfDigits - counter + 1;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
