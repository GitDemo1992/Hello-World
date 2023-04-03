package java_learning;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {

        int[] nums = new int[5];
        Scanner scanner = new Scanner(System.in);

        do {
           for (int i=0;i<nums.length;i++){
               System.out.print("Enter the values for Nums[" +i +"] : ");
               nums[i] = scanner.nextInt();

           }

           if (nums[0] == 10) {
               break;
           }

        }while(true);

        System.out.println("Done.");
    }
}
