package lab2;
import java.util.Scanner;
    public class DigitToWord {

        private static final String[] digitWords = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };


        public static void printDigitsInWords(int number) {
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int ones = number % 10;

            System.out.print(digitWords[hundreds] + " ");
            System.out.print(digitWords[tens] + " ");
            System.out.print(digitWords[ones]);
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int number = sc.nextInt();
            System.out.print("Input number: " + number + "\nOutput: ");
            printDigitsInWords(number);
        }
    }

