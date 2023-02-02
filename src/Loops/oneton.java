package Loops;


import java.util.Scanner;

public class oneton {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Range of Number: ");
        int range = input.nextInt();
        int counter =1;
        while (counter<=range){
            System.out.print(counter+" ");
            counter++;
        }
    }

}
