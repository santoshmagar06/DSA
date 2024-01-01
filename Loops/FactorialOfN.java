package Loops;
import java.util.Scanner;

public class FactorialOfN {

    public static void main(String[] args) {
        
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int fact =1;


    while(n>0){
        if(n==1 || n==0){
            n=1;
        }
        else{
            fact=n*fact;
                    

        }
        n --;
    }
    System.out.print("Factorial of number : "+fact );

}
}
