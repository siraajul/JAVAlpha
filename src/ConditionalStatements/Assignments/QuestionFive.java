package ConditionalStatements.Assignments;

import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Year");
        int year = input.nextInt();

        boolean x = (year%4) == 0;
        boolean y = (year%100)!= 0;
        boolean z = (year%400) ==0;

        if(x &&(y||z)){
            System.out.println(year+" is a Leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
    }
}
