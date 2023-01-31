package ConditionalStatements;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        String type =((number%2)== 0) ? "even":"odd";
        System.out.println(type);
    }
}
