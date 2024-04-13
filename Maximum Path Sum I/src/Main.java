import java.io.File;

public class Main {
    public static void main(String[] args) {
        File test = new File("src/triangle.txt");
        Pyramid p = new Pyramid(test);

        p.printPyramid();
        p.setLeftRightValues();
        Node root = p.rows.get(0)[0];
        int result = root.leftValue + root.rightValue + root.value;
        System.out.println("Result : " + result);
    }
}