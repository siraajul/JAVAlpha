package Operators.PracticeQuestions;

import java.util.Scanner;

public class FirstQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Value of X: ");
        int x=input.nextInt();
        System.out.print("Enter the Value of Y: ");
        int y=input.nextInt();

        int first_expression=(x*y/x);
        int second_expression=(x*(y/x));

        System.out.print(first_expression+",");
        System.out.println(second_expression);
    }
}
