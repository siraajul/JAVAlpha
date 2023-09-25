package Operators.PracticeQuestions;

import java.util.Scanner;

public class FifthQuestions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Value of X: ");
        int x = input.nextInt();
        System.out.print("Enter the Value of Y: ");
        int y = input.nextInt();

        int exp_1 = (y * (x / y + x / y));
        int exp_2 = (y * x / y + y * x / y);

        System.out.println("Result of First Expression is: "+exp_1);
        System.out.println("Result of Second Expression is: "+exp_2);
    }
}
