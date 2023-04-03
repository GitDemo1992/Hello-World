public class Main {


    public static void main(String[] args) {

        //printSquareOfNumbers(5);
//        int c = sum(5,10);
//        System.out.println(c)

        Planet earth = new Planet();
        earth.Revolve();
        earth.ComingSoon();

        Planet venus = new Planet();
        venus.Revolve();
        venus.ComingSoon();
    }

     static void printSquareOfNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i * i);
        }

    }

    static int sum(int a, int b){
        return(a+b);
    }



}

