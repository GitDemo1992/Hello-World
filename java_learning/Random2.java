package java_learning;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Random2 {
    public static void main(String[] args) {
        int randomNumber = ThreadLocalRandom.current().nextInt(1,51);
        System.out.println("I am thinking the no. between 1 to 50..");
        System.out.print("Guest it now?: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        int count=1;
        while (randomNumber != userNumber){
            if(randomNumber>userNumber){
                System.out.print("Guess HIGHER than this: ");
                userNumber=scanner.nextInt();
            }
            else{
                System.out.print("Guess Lower than this: ");
                userNumber=scanner.nextInt();
            }
            count++;
        }
            System.out.println("Great.. You nailed it...");
            System.out.println("you took " + count + " attemps to found it...");

        }
    }
