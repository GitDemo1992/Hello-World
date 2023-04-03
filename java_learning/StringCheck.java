package java_learning;

import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) {
        String password = "shark50";
        System.out.print("Enter the Password: ");
        Scanner scanner = new Scanner(System.in);
        String userPassword = scanner.next();

        while (! password.equals(userPassword)) {
            System.out.print("Password is wrong.. try again : ");
            userPassword = scanner.next();
        }

            System.out.println("Access Approved..");
        }

    }

