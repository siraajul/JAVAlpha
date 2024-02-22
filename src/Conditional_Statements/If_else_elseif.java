package Conditional_Statements;

public class If_else_elseif {
    public static void main(String[] args) {
        /*
        Syntax Of If Statements:

        if(boolean expression T of F){
            //body
        }else{
            //do this
        }
        */
        int salary = 25400;
        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }

        //Multiple If-Else Stateent
        if (salary > 10000) {
            salary += 2000;
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
