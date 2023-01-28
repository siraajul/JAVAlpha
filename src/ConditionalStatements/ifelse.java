package ConditionalStatements;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Age:");
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("Your are adult");
        }
        else if(age > 13) {
            System.out.println("You age Teenager");
        }
        else {
            System.out.println("Your are not adult");
        }

    }

}
