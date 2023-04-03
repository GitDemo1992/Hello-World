package java_learning;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the No. of the Students attended the exam: ");
        int no_of_students = scanner.nextInt();
        System.out.print("Enter the Max marks for this Exam: ");
        int maxMarks = scanner.nextInt();

        int[] score = new int[no_of_students];

        for (int i=0; i<no_of_students;i++){
            System.out.print("Enter the Marks for Student" + (i+1) +": ");
            int marks = scanner.nextInt();
            score[i] =  marks;
        }
        for (int i=0; i<no_of_students;i++){
            double percentage =  (double) score[i] / maxMarks * 100;
            System.out.println("Student" +(i+1) +": scores: " +score[i] + " , Percentage: " +percentage);
        }
    }
}
