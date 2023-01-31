package ConditionalStatements;

import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Age");
        int age = input.nextInt();

        if (age>=18){
            System.out.println("Adult");
        }
        else if(age>=13 && age<18){
            System.out.println("TeenAger");
        }
        else {
            System.out.println("Child");
        }

    }
}
