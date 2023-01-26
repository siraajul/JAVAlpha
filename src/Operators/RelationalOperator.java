package Operators;

import java.util.Scanner;

public class RelationalOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Check Tow Number Equal or Not,\nIf Equal will Return True If Not Equal Will Return False");
        System.out.println("-----------------------------");
        System.out.print("Enter First Number: ");
        int A = input.nextInt();
        System.out.print("Enter Second Number: ");
        int B = input.nextInt();
        System.out.println((A >= B));


    }
}
