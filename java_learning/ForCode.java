package java_learning;

public class ForCode {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 40; i++) {
            if (count == 3) {
                System.out.println(i);
                System.out.println("Quack");
                count = 1;
            }
            else {
                System.out.println(i);
                count = count + 1;
            }
        }
    }
}