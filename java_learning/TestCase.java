package java_learning;

public class TestCase {
    public static void main(String[] args) {
        int x = 8;
        int y = 10;

        if (x > y) {
            System.out.println(x+" is greater than "+y);
        } else if (x < y) {
            System.out.println(x+" is less than "+y);
        } else {
            System.out.println(x+" and " + y +" are same");
        }
    }
}