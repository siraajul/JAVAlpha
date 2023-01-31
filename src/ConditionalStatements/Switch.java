package ConditionalStatements;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number From (1........9)");
        int number = input.nextInt();
        switch(number){
            case 1 : System.out.println("Samosa");
                    break;
            case 2 : System.out.println("Burger");
                    break;
            case 3 : System.out.println("Mango Shake");
                    break;
            default: System.out.println("Wake up dude !");

        }


    }
}
