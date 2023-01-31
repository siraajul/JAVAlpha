package ConditionalStatements.Assignments;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double temp = input.nextDouble();

        if(temp>=100){
            System.out.println("You Have Fever");
        }
    }
}
