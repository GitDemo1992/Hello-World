package java_learning;
import java.util.Scanner;
public class RestaurantBill {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Restaurant Bill Calculator\n");
        System.out.println("Enter the Restaurant Bill Amount: ");
        double BillAmount = scanner.nextDouble();
        System.out.println("Enter the Number of Peoples it will be split : ");
        int People = scanner.nextInt();

        System.out.println("Total Bill Amount is " +BillAmount);
        System.out.println("No. of peoples that will be split: " + People);
        System.out.format("Each person should give the amount is %.1f",BillAmount/People);

    }
}
