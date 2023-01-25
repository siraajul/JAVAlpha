package VariablesDatatypes.Assignment;

import java.util.Scanner;

public class GSTofBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Pencil Price");
        float pencil = sc.nextFloat();
        System.out.println("Enter the Pen Price");
        float pen = sc.nextFloat();
        System.out.println("Enter the Eraser Price");
        float eraser = sc.nextFloat();

        float TotalCost= pencil+pen+eraser;

        float newTotal = TotalCost+(0.18f * TotalCost);
        System.out.println("Total Bill is "+TotalCost);
        System.out.println("Billed with GST is "+newTotal);
    }
}
