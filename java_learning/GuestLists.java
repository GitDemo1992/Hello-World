package java_learning;

import java.util.Scanner;

public class GuestLists {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        insertTestNames();
        do {
            displayGuests();
            displayMenu();
            int num = getOption();

            if (num == 1) {
                addGuests();
            }
            if (num == 2){
                addGuestsPosition();
            }
            else if (num == 3) {
                renameGuests();
            }
            else if(num == 4){
                removeGuests();
            }
            else if (num == 5) {
                System.out.println("Exiting...");
                break;
            }
        }while (true) ;
    }

    static void insertTestNames() {
        guests[0] = "Siva";
        guests[1] = "Venkat";
        guests[2] = "Ganesh";
        guests[3] = "Sathish";
    }

    static void displayGuests() {
        System.out.println("\n_____________________");
        System.out.println("- Guests - ");
        int count = 0;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.println((count + 1) + ". " + guests[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Guest lists is empty.");
        }
    }

    static void displayMenu() {
        System.out.println("_____________________");
        System.out.println("- Menu -");
        System.out.println("1. Add the Guest");
        System.out.println("2. Add the Guest on Particular position");
        System.out.println("3. Rename the Guest");
        System.out.println("4. Remove the Guest");
        System.out.println("5. Exit");
    }

    static int getOption() {
        System.out.print("\nOption: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    static void addGuests() {
        System.out.print("Enter the Guest Name you want to add: ");
        String name = scanner.nextLine();
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                guests[i] = name;
                break;
            }
        }
    }

    static void addGuestsPosition(){
        System.out.print("Enter the Position that you want to insert: ");
        int pos_no = scanner.nextInt();
        scanner.nextLine();
        if(pos_no > 0 && pos_no<= guests.length) {
            System.out.print("Enter the Guest Name: ");
            String name = scanner.nextLine();

            for (int i = guests.length - 1; i > pos_no - 1; i--) {
                    guests[i] = guests[i-1];
            }
            guests[pos_no - 1] = name;
        }
        else{
            System.out.println("We can add upto 10 Guests only.");
        }
    }

    static void renameGuests(){
        System.out.print("Enter the No of the guest you want to rename: ");
        int rename_no=scanner.nextInt();
        scanner.nextLine();
        if(rename_no >=1 && rename_no <= guests.length && guests[rename_no-1] != null){
            System.out.print("Enter the new name of the Guest: ");
            String rename_name = scanner.nextLine();
            guests[rename_no -1] = rename_name;
        }
        else{
            System.out.println("There is no guests with that number");
        }
    }
    static void removeGuests() {
        /* System.out.print("Enter the Guest Name you want to remove: ");
        String name = scanner.next();

        for (int i=0;i<guests.length;i++){
            if(guests[i] != null && guests[i].equals(name)){
                guests[i] = null;
                break;
            }
        }
        */

        while (true) {
            System.out.print("Enter the Guest no. that you want to remove: ");
            int guestNo = scanner.nextInt();

            if (guestNo < guests.length && guestNo >= 0 && guests[guestNo-1] != null) {
                guests[guestNo - 1] = null;

                String temp[] = new String[guests.length];
                int ti = 0;
                for (int i = 0; i < guests.length - 1; i++) {
                    if (guests[i] != null) {
                        temp[ti] = guests[i];
                        ti++;
                    }
                }
                guests = temp;
                break;
            }
            else{
                System.out.println("Error: There is no guest with that number.");
            }
        }
    }
}

