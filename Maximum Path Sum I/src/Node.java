public class Node {

    int value;
    int leftValue;
    int rightValue;

    public Node (int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeftValue (int leftValue) {
        this.leftValue = leftValue;
    }

    public void setRightValue (int rightValue) {
        this.rightValue = rightValue;
    }

    public int getValue() {
        return value;
    }

    public int getLeftValue() {
        return leftValue;
    }

    public int getRightValue() {
        return rightValue;
    }
}
