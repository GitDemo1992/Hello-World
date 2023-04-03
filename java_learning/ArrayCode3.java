package java_learning;

public class ArrayCode3 {
    public static void main(String[] args) {
        double[] nums = new double[5];
        nums[0] = 4.5;
        nums[1] = 5.5;
        nums[2] = 10.0;
        nums[3] = 15.5;
        nums[4] = 22.2;

        double sum = 0;
        for (int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        double Avgofelement = sum/nums.length;
        System.out.println("The sum of Array elements is : " + sum);
        System.out.format("The Average of Array element is %.2f",Avgofelement);

    }
}
