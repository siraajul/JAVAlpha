package VariablesDatatypes.Assignment;

import java.util.Scanner;

public class AreaofSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Side of Square");
        int square_input = sc.nextInt();
        int area_of_square = square_input*square_input;
        System.out.println("Area Of Square is: "+area_of_square);
    }
}
