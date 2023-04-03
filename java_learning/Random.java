package java_learning;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Random {
    public static void main(String[] args) {
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        System.out.println("I am thinking of the number from 1 to 5");
        System.out.print("Guess the Number : ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if (randomNumber == userNumber) {
            System.out.println("Great.. Aren't you lucky...");
        } else {
            System.out.println("Better Luck Next time..");
        }
    }
}