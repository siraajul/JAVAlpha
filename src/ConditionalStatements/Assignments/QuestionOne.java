package ConditionalStatements.Assignments;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number Here: ");
        int number = input.nextInt();
        if(number<0){
            System.out.println("This is a Negative Number");
        }
        else {
            System.out.println("This is a Positive Number");
        }

    }
}
