package java_learning;
import java.util.Scanner;
public class IfCode {
    public static void main(String[] args) {
        System.out.print("Enter the amount you have in your account: ");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();

        if (money >= 1000000) {
            System.out.println("Super.. you have a good balance in ur acc");
        }
        else if(money >=500000) {
            System.out.println("Good. keep going... ");
        }
        else {
            System.out.println("Alert!!! you need to save money...");
        }
    }
}
