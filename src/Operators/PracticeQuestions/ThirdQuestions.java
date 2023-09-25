package Operators.PracticeQuestions;

import java.util.Scanner;

public class ThirdQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int number=input.nextInt();
        int x,y,z;
        x=y=z=number;
        x+=y;
        y-=z;
        z/=(x+y);
        System.out.println(x+" "+y+" "+z);
    }
}
