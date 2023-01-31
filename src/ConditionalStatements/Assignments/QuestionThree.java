package ConditionalStatements.Assignments;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number from 1...7 to see the week days");
        int number = input.nextInt();
        String day ="Today is ";

        switch (number){
            case 1 : System.out.println(day+"Saturday");
                    break;
            case 2 : System.out.println(day+"Sunday");
                    break;
            case 3 : System.out.println(day+"Monday");
                    break;
            case 4 : System.out.println(day+"Tuesday");
                    break;
            case 5 : System.out.println(day+"Wednesday");
                    break;
            case 6 : System.out.println(day+"Thursday");
                    break;
            case 7 : System.out.println(day+"Friday");
                    break;
            default: System.out.println("We have only 7 days in a calender");

        }

    }
}
