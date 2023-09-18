/*
Question:In a program,input 3 numbers:A,B and C.You have to output the average of these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N)
 */
package VariableandDataTypes.PracticeQuestions;

import java.util.Scanner;

public class threenumberavarage {
    public static void main(String[] args){

        //This will help to taking input from user
        Scanner input = new Scanner(System.in);

        //taking 3 number as a input
    System.out.println("Enter the First Number: ");
    int first_number = input.nextInt();
    System.out.println("Enter the Second Number: ");
    int second_number = input.nextInt();
    System.out.println("Enter the Third Number: ");
    int third_number = input.nextInt();

    //finding the average of 3 numbers
    int average = (first_number+second_number+third_number)/3;
    System.out.println("Average of 3 Number is: "+average);
  }
}
