package VariableandDataTypes;

import java.util.Scanner;

public class sum_of_a_and_b {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    System.out.println("Enter the Number a: ");
    int number_a = input.nextInt();
    System.out.println("Enter the Number b: ");
    int number_b = input.nextInt();
    int sum=number_a+number_b;
    System.out.println("Sum of A and B is : "+sum);
    }
}
