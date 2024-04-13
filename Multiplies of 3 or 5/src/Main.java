public class Main {
    public static void main(String[] args) {

        int ans = fibonacci(10); //it will exceed 4M after 10. I just put a random number here to test it, and it turns out that it is the number
        System.out.println("first approach : " + ans);

        ans = evenFibonacci(4000000);
        System.out.println("second approach : " + ans);
    }

    //algorithm 1
    static public int fibonacci (int n) { //iterative fibonacci, to save memory
        int a = 1;
        int b = 2;
        int temp;
        int sum = 2; //to include the first even number of the sequence, which is 2.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) { //every (3n+2)th term of the sequence is even.
                temp = a + b;
                a = b;
                b = temp;
            }
            sum = sum + b;
        }
        return sum;
    }

    //algorithm 2
    static public int evenFibonacci (int n) { //we can produce even fibonacci numbers with the sequence "a, b, (b*4+a)"
        int a = 2;
        int b = 8;
        int temp;
        int sum = 10; //to include first two elements of the sequence, which are 2 and 8
        do {
            temp = b * 4 + a;
            if (temp > n) {
                break;
            }
            a = b;
            b = temp;

            sum = sum + b;
        } while (true);
        return sum;
        }
}


