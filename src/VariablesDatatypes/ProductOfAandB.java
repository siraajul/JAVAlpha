package VariablesDatatypes;

import java.util.Scanner;

public class ProductOfAandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first_number = sc.nextInt();
        int second_number = sc.nextInt();

        int product = first_number*second_number;
        System.out.println(product);
    }
}
