package Functions;
import java.util.Scanner;
public class JavaBasics {
    public static int calculateSum(int a, int b) // parameter or formal parameter
    {
        int sum =0;
        sum = a+b;
        return sum;
    }

    public static int factorial(int n){
       int fact =1;
        for(int i =1;i<n;i++){
            fact = fact*i;

        }
        return fact;
    }

    public static int product(int a, int b){
        return a*b;
    }
    public static float product(float a, float b,float c){
        return a*b*c;
    }

    public static int BinomialCoeff(int n,int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int bino_coeff = n_fact/(r_fact*nmr_fact);
        return bino_coeff;
    }

    public static boolean isPrime(int x){
          if(x==2){
            return true;
          }
        for(int i= 2;i<Math.sqrt(x);i++){
            if(x%i==0)
            {
             return false;
            }
        }
        return true;
    }

    // binary to decimal
    public static void BinToDec(int binNum){
        int pow =0;
        int decNum =0;

        while (binNum > 0) {
            int lastDigit = binNum%10;
            decNum = decNum +(lastDigit+(int)Math.pow(lastDigit, pow));

            pow++;
            binNum=binNum / 10;
        }
        System.out.println("Converted dec number is"+decNum);
    }
    //Prime Range
    public static void PrimeRange(int y)
    {
        for(int i = 2;i<=y;i++){
           if(isPrime(i)){
            System.out.println(i);
           };

        }
    }

    //
   
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

       // System.out.print(calculateSum(a, b));//passsing arguement or actual parameter

       //System.out.println(BinomialCoeff(a,b));
       // System.out.println(product(a, b));
       // System.out.println(product(1.2f, 1.3f,3.3f));
        //System.out.println(isPrime(8));
        //PrimeRange(4);

       
       
     //BinToDec(1001);




       
    }
}
