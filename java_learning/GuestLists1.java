package java_learning;

import java.util.Scanner;

public class GuestLists1 {
    static String[] guests = new String[10];
    public static void main(String[] args) {


        guests[0] = "Siva";
        guests[1] = "Venkat";
        guests[2] = "Sathish";
        guests[3] = "Ganesh";
        guests[4] = "Madhu";
        System.out.println("\t\t\tGuest Lists Applicaton");
        System.out.println("\t\t\t#######################");
        do{

        displayGuests();

        System.out.println("-Menu-");
        System.out.println("_________________________");
        System.out.println("1. Add the Guest");
        System.out.println("2. Remove the Guest");
        System.out.println("3. Exit");
        System.out.print("\nEnter the Option: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();


            if(option == 1){
                for(int i=0;i< guests.length;i++){
                    if(guests[i] == null){
                        System.out.print("Enter the Name: ");
                        String name = scanner.next();
                        guests[i] = name;
                        break;
                    }
                }
            }
            else if(option == 2){
                System.out.print("Name you want to remove: ");
                String remove_name= scanner.next();
                for(int i=0;i<guests.length;i++){
                    if(guests[i] != null && guests[i].equals(remove_name)){
                        guests[i] = null;
                        System.out.println("Name Removed Successfully.");
                        break;
                    }
                }
            }
            else if(option == 3){
                System.out.println("Exiting.. Good Bye");
                break;
            }

        } while (true);


    }

    static void displayGuests(){
        System.out.println("\n________________________\n- Guests - \n");
        for (int i = 0; i < guests.length; i++) {
            System.out.println((guests[i] != null) ?guests[i] :"--");
        }
        System.out.println("");
    }
}
