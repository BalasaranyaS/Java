package ExceptionHandling;

import java.sql.SQLOutput;

public class ExceptionPropagation {
    public static void main(String[] args) {
        String textString="welcome";
        String upperCase=textString.toUpperCase();
        System.out.println(upperCase);
        System.out.println("Caller begin...");
        called();
        System.out.println("Back to caller...");
    }
    public static void called(){
        System.err.println(" The calculator app");
        int num1=0,num2=200;
        int result=num2/num1;
        System.err.println(result);
        System.err.println("shutting down");
    }
}
