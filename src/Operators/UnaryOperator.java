package Operators;

import java.util.Scanner;

public class UnaryOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = --a;

        System.out.println(a);
        System.out.println(b);
    }
}
