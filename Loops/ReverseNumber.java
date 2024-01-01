package Loops;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any digit numbers : ");
        int number =sc.nextInt();
        int rev =0;
         //rev of number
        // while (number>0) {
        //     int lastDigit = number%10;
        //     System.out.print(lastDigit);
        //     number=number/10;
        // }
        // System.out.println();



        //reverse number
        while (number >0) {
            int lastDigit = number%10;
            rev =(rev*10)+lastDigit;
            number=number/10;

        }

        System.out.println("Reverse number is :"+rev);
    }
}
