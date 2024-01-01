package Flowchart_psedocode;
import java.util.Scanner;
//10,14,4

/**
 * CheckMax
 */
public class CheckMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number a : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number b : ");
        int b = sc.nextInt();
        System.out.println("Enter the third number c :");
         int c = sc.nextInt();

        if(a>b && a >c){
            System.out.println("A is the max number"+a);
        }
         else if(b>c&& b >c){
            System.out.println("B is the max number"+b);
        }
         else{
            System.out.println("C is the max number"+c);
        }


    }
}