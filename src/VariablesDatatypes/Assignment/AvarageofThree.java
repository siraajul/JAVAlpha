package VariablesDatatypes.Assignment;

import java.util.Scanner;

public class AvarageofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number");
        int numberone = sc.nextInt();
        System.out.println("Enter the Second Number");
        int numbertwo = sc.nextInt();
        System.out.println("Enter the Third Number");
        int numberthree = sc.nextInt();
        int avarage = (numberone+numbertwo+numberthree)/3;
        System.out.println("Avarage number is:" + avarage);
    }
}
