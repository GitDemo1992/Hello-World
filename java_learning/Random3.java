package java_learning;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Random3 {
    public static void main(String[] args) {
        int randomNumber = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("You think the No. between 1 to 50. I will guess it !!!");
        System.out.println("Hope your have a number now in your mind..I started guessing...");
        System.out.println("When i guess it right, type correct, else type higher or lower");
        int min = 1;
        int max = 21;
        do {
            randomNumber = ThreadLocalRandom.current().nextInt(min,max);
            System.out.print("Is it " + randomNumber + "? ");
            String userInput = scanner.next();

            if (userInput.equals("lower")) {
                max = randomNumber;
            }
            else if (userInput.equals("higher")) {
                min = randomNumber + 1;
            }
            else {
                System.out.println("Finally i guessed it... ");
                break;
            }
        } while (true);

    }
}
