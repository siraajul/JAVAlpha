package ConditionalStatements;

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Students Marks");
        int marks= input.nextInt();

        String status =(marks>=33) ? "Pass":"Fail";
        System.out.println(status);


    }
}
