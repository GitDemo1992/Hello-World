package java_learning;

import java.util.Scanner;

public class StringCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fav_foods = new String[3];
        System.out.println("Hi..Enter your top 5 favourite food: ");
        for (int i=0; i<fav_foods.length;i++){
            System.out.print("Food " + (i+1) + ": ");
            fav_foods[i] = scanner.nextLine();
        }
        System.out.println("No more memory..");
        System.out.println("Your favourite foods are :");
        for(int i=0;i<fav_foods.length;i++){
            System.out.println(fav_foods[i]);
        }
    }
}
