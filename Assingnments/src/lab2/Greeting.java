package lab2;
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String name= sc.nextLine();

        Welcome(name);

    }
    public static void Welcome(String a){
        System.out.println("Hi " + a+ ", Welcome to Java Programming!");
    }

}
