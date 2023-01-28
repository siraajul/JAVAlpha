package ConditionalStatements;

import java.util.Scanner;

public class largesttwonumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        if(A >= B){
            System.out.println("A is Largest of 2");
        }

        else{
            System.out.println("B is Largest of 2");
        }
    }


}
