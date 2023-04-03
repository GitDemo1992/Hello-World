package java_learning;

public class ArrayCode {
    public static void main(String[] args) {

        /* int[] a = {1,2,3,4,5};
        for (int i=0; i<5;i++){
            System.out.println(a[i]);

        }
        System.out.println(a.length+ " is lenght of array");
         */

        int[] nums = {10,30,50,65,90,120};
        String[] words = {"oracle","java"};
        int sumofnums=0;
        int count=0;

        System.out.println(words[1]);

        for (int i=0;i<nums.length;i++){
            if (nums[i] > 50){
                count++;
            }
            sumofnums=sumofnums+nums[i];
        }
        System.out.println("Total sums of Arrary numbers: " + sumofnums);
        System.out.println("No. of Array numbers greater than 50: " +count);
    }
}
