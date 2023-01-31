package ConditionalStatements;

import java.util.Scanner;
import java.lang.String;

public class calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("------Basic Calculator------");

        System.out.print("Enter First Number: ");
        int first_number = input.nextInt();
        System.out.print("Enter Second Number: ");
        int second_number = input.nextInt();
        System.out.print("Which Operation You Like to Perform? +,-,*,/,% : ");
        char operator = input.next().charAt(0);

        switch (operator){
            case '+' : System.out.println(first_number+second_number);
                        break;
            case '-' : System.out.println(first_number-second_number);
                        break;
            case '*' : System.out.println(first_number*second_number);
                        break;
            case '/' : System.out.println(first_number/second_number);
                        break;
            case '%' : System.out.println(first_number%second_number);
                        break;
            default:   System.out.println("Wrong Operator");





        }



    }
}
