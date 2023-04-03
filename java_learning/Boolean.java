package java_learning;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        String[] questions = {"Working? ","Do u have bike? ","Married? ", "Loan need? ","do u have car? "};
        boolean[] answers = {true,true,true,false,false};
        boolean[] usrAnswers = new boolean[5];
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer true or false only for below questions..");

        for (int i=0;i<questions.length;i++) {
            System.out.print(questions[i]);
            usrAnswers[i] = scanner.nextBoolean();
        }

        for (int i=0;i< answers.length;i++){
            if ( usrAnswers[i] == answers[i] ){
                score = score + 1;
            }
        }

        System.out.println("Your pass score is: " + score);
    }
}
