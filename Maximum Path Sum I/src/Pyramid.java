import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pyramid {

    ArrayList<Node[]> rows;

    public Pyramid (File pyramid) {
        rows = new ArrayList<>();
        try { //construct the pyramid from the values in text file
            Scanner fileScanner = new Scanner(pyramid);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] tempValues = line.split(" ");
                Node[] values = new Node[tempValues.length];
                for (int i = 0; i < tempValues.length; i++) {
                    int value = Integer.parseInt(tempValues[i]);
                    values[i] = new Node(value);
                }
                rows.add(values);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    public void setLeftRightValues() {
        int h = rows.size() - 1;
        //for the row at the bottom
        for (int i = 0; i < h; i++) {
            if (rows.get(h)[i].value >= rows.get(h)[i + 1].value) {
                rows.get(h - 1)[i].setLeftValue(rows.get(h)[i].value);
            } else {
                rows.get(h - 1)[i].setRightValue(rows.get(h)[i + 1].value);
            }
        }

        //for other rows
        for (int j = 2; j <= h; j++) {
            for (int i = 0; i < h - j + 1; i++) {
                Node itSelf = rows.get(h - j)[i];
                Node left = rows.get(h - j + 1)[i];
                Node right = rows.get(h - j + 1)[i + 1];

                int sumLeft = left.value + left.rightValue + left.leftValue;
                int sumRight = right.value + right.rightValue + right.leftValue;

                if (sumLeft >= sumRight) {
                    itSelf.leftValue = sumLeft;
                } else {
                    itSelf.rightValue = sumRight;
                }
                rows.get(h - j)[i] = itSelf;
            }
        }
    }

    public void printPyramid() {
        for (int i = 0; i < rows.size(); i++) {
            for (int j = 0; j < rows.get(i).length; j++) {
                System.out.print(rows.get(i)[j].getValue() + " ");
            }
            System.out.print("\n");
        }
    }
}
