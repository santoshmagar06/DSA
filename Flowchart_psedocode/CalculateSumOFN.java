package Flowchart_psedocode;
import java.util.Scanner;
/**
 * CalculateSumOFN
 */
public class CalculateSumOFN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int a =1;

        int sum =0;

        while (a<=n) {
            if(a<=n){
                 
                sum =sum + a;
                 a++;
               
            }
           
            
        }
        System.out.println("Sum of n natural number is : "+ sum);
    }
}