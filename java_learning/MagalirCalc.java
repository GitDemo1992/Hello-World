package java_learning;

import java.util.Scanner;

public class MagalirCalc {
    public static void main(String[] args) {
        System.out.println("\t  #################################");
        System.out.println("\t  ##  Magalir Kulzhu Calculator  ##");
        System.out.println("\t  #################################");
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nAmount: ");
        int amount = scanner.nextInt();
        System.out.print("");
        System.out.print("Tenure: ");
        int tenure = scanner.nextInt();
        System.out.println("");
        System.out.println("Month\tEMI");
        System.out.println("=====\t===");
        int noCostEmi = amount/tenure;
        int totalAmount = 0;
        int interest;
        int emi;
        int totalInterest=0;
        for (int i=1;i<=tenure;i++){
            interest = (amount * 2)/100;
            emi = noCostEmi+ interest;
            System.out.println(i + "\t\t" +emi);
            amount = amount - noCostEmi;
            totalAmount = totalAmount + emi;
            totalInterest = totalInterest+interest;
        }
        System.out.print("\n");
        System.out.printf("Total Amount: %s  Interest: %s",totalAmount,totalInterest);
        System.out.println("\n");
    }
}
