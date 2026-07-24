package Ternary_Conditions;

public class Ternary {
    public static void main(String[]args ){
        int a = 10;
        int b = 20;
        //Variable = (condition) ? expressionTrue : expressionFalse;
        int max = (a>b) ? a : b;
        System.out.println("The maximum value is: " + max);
    }
}

