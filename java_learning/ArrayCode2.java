package java_learning;

import java.util.Scanner;

public class ArrayCode2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the count of No. you want to check it: ");
        int no_of_count = scanner.nextInt();
        int[] nums = new int[no_of_count];
        for (int i=0; i<no_of_count;i++) {
            System.out.print("Enter the Number: ");
            int userValue = scanner.nextInt();
            nums[i] = userValue;
        }
        int small = nums[0];

        for (int i=1;i<no_of_count;i++){
                if(small > nums[i]){
                    small=nums[i];
                }
            }

        System.out.println("The smallest number is: " + small);
    }
}
