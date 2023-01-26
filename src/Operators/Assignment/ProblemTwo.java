package Operators.Assignment;

public class ProblemTwo {
    public static void main(String[] args) {
        int x=200;
        int y=50;
        int z=100;

        if(x>y && y>z){
            System.out.println("Hello");
        }
        if(z>y && z<x){
            System.out.println("Java");
        }
        if((y+200)<x && (y+150)<z){
            System.out.println("Hello Java");
        }
    }
}
