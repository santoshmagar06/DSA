package ConditionalStatement;
import java.util.Scanner;
public class CheckLeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year =sc.nextInt();

        boolean x = year % 4==0;
        boolean y = (year %10 ) !=0;
        boolean z = (year%10==0) && (year%400==0);
        if(x && (y||z))

        // if(year%4==0 && year%10==0 && year %400==0)
        {System.out.println("entered year is leap year ");}

        else
        {
            System.out.println("Not leap year");
        }
    }

}
