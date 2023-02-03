package Loops;

import java.util.Scanner;

public class firstNnaturalNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = input.nextInt();
        int sum = 0;
        int counter=1;
        while (counter<=n){
            sum+=counter;
            counter++;
        }
        System.out.println("Sum of "+n+" is "+sum);
    }
}
