package Operators.PracticeQuestions;

import java.util.Scanner;

public class FourthQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Value of X: ");
        int x=input.nextInt();
        System.out.print("Enter the value of Y: ");
        int y=input.nextInt();

        System.out.print("Enter the value of A: ");
        int a=input.nextInt();
        System.out.print("Enter the value of B: ");
        int b=input.nextInt();
        System.out.print("Enter the value of C: ");
        int c=input.nextInt();

        int exp=4/3*(x+34)+9*(a+b*c)+(3+y*(2+a))/(a+b*y);

        System.out.print("Result is:"+exp);

    }
}
