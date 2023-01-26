package Operators;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter First Number: ");
        int A = input.nextInt();
        System.out.print("Enter Second Number: ");
        int B = input.nextInt();
        System.out.println("--------------------------------------");

        System.out.println("Addition is = "+(A+B));
        System.out.println("Subtraction is = "+(A-B));
        System.out.println("Multiplication is = "+(A*B));
        System.out.println("Division is = "+(A/B));
        System.out.println("Modulus is = "+(A%B));
    }
}
