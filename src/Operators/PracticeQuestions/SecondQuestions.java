package Operators.PracticeQuestions;

import java.util.Scanner;

public class SecondQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of X: ");
        int x = input.nextInt();
        System.out.print("Enter the value of Y: ");
        int y = input.nextInt();
        System.out.print("Enter the Value of Z: ");
        int z = input.nextInt();

        if(x>y && y>z){
            System.out.println("Hello");
        }
        if (z>y && z<x){
            System.out.println("Java");
        }
        if ((y+200)<x && (y+150)<z){
            System.out.println("Hello Java");
        }
    }
}
