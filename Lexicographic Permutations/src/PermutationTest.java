public class PermutationTest {

    public static int[] swap (int[] arr, int index1, int index2) {
        int x = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = x;

        return arr;
    }
    public static void main(String[] args) {

        int[] numbers = {0,1,2,3,4,5,6,7,8,9};

        System.out.println("1 --");

        for (int x : numbers) {
            System.out.print(x);
        }

        int n = numbers.length;
        for (int i = 0; i < numbers.length; i++) {

            swap(numbers, n - 1, n - 2);

        }
    }
}
