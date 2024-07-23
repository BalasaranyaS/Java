package lab2;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        LargeNum(num1,num2,num3);
    }
    public static void LargeNum(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("The largest number is:" + a);
        }
        else if(b>a && b>c){
            System.out.println("The larhgest number is:"+ b);
        }
        else{
            System.out.println("The largest number is:" + c);
        }
    }
}
