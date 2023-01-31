package ConditionalStatements;

import java.util.Scanner;

public class largestofthreenumbers {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a= input.nextInt();
        System.out.print("Enter Second Number: ");
        int b= input.nextInt();
        System.out.print("Enter Third Number : ");
        int c= input.nextInt();

        if((a>=b) && (a>=c)){
            System.out.println(a+" is the largest.");
        } else if (b>=c) {
            System.out.println(b+" is the largest.");
        }
        else{
            System.out.println(c+" is the largest.");
        }


    }
}
