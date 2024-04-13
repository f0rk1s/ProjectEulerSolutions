public class Main {
    public static void main(String[] args) {

        int[] letters = new int[1000];
        //number of letters for the corresponding numbers' words. "twenty" = 6, "one hundred" = 10 i.e.
        letters[0] = 36; //numbers [1,9]
        letters[1] = 70; //numbers [10,19]
        letters[20] = 6;
        letters[30] = 6;
        letters[40] = 5;
        letters[50] = 5;
        letters[60] = 5;
        letters[70] = 7;
        letters[80] = 6;
        letters[90] = 6;
        //"and" not included for this part
        letters[100] = 10;
        letters[200] = 11;
        letters[300] = 12;
        letters[400] = 11;
        letters[500] = 10;
        letters[600] = 10;
        letters[700] = 12;
        letters[800] = 12;
        letters[900] = 11;
        letters[999] = 11;

        int sum = 106 * 10;

        for (int i = 20; i <= 90; i += 10) {
            sum += letters[i] * 10 + letters[0];
        }

        //from 100 to 900
        for (int j = 100; j <= 900; j += 100) {
            sum += letters[j]; //for the number itself
            sum += (letters[j] + 3) * 99; //("one hundred and")
            //from 20 to 99
            for (int i = 20; i <= 90; i += 10) {
                sum += letters[i] * 10 + letters[0];
            }
        }


        System.out.println(sum + letters[999]);
    }
}
