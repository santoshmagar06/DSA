package Flowchart_psedocode;
import java.util.Scanner;

/**
 * Main
 */
public class CheckPrimeNumber {

    public static void main(String[] args) {
        //System.out.println("Hello world");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        int div =2;
        while(div <=x){
                   if(x%div==0){
                        System.out.println("Number is not prime");
                         break;
                     }
                     else{
                        div = div +1;
                     }
                 System.out.println("Number is prime");
                 break;

        }
       
    }
    
}