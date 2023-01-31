package ConditionalStatements.Assignments;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Body Temperature : ");
        double temp = input.nextDouble();

        if(temp>=100){
            System.out.println("You Have Fever");
        }
        else {
            System.out.println("You Don't Have Fever");
        }
    }
}
