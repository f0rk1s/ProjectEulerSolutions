public class Main {
    public static void main(String[] args) { //solved mostly by pen and pencil
        long sum = 0;
        for (int i = 3; i <= 1001; i += 2) {
            sum += sumFunctionForAllFourDirections(i);
        }
        System.out.println(sum + 1); //+1 for the number 1 on the middle
    }

    static long sumFunctionForAllFourDirections(int n) {
        return (4 * n * n - 6 * n + 6);
    }
}