package VariablesDatatypes;

import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();
        float pi=3.1416F;

        float areaofcircle =  pi*(radius*radius);
        System.out.println(areaofcircle);

    }
}
