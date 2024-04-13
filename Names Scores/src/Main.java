import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File textFile = new File("0022_names.txt");

        Scanner reader = new Scanner(textFile);

        String[] words = reader.next().split(","); //split from "," and put the names into an array

        for (int i = 0; i < words.length; i++) { //remove the characters '"';
            StringBuilder deleter = new StringBuilder(words[i]);
            deleter.deleteCharAt(words[i].length() - 1);
            deleter.deleteCharAt(0);
            words[i] = deleter.toString();
        }

        Arrays.sort(words); //sort alphabetically

        long sum = 0; //our result

        for (int i = 0; i < words.length; i++) { //for every word
            int charSum = 0;
            for (int j = 0; j < words[i].length(); j++) { //calculate sum of all character values in the word
                char c = words[i].charAt(j);
                int x = c - 64; //minus 64 for capital characters ('A' is 65)
                charSum += x;
            }
            sum += charSum * (i + 1);
        }

        System.out.println(sum);
    }
}