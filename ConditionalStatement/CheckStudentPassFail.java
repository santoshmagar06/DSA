package ConditionalStatement;
import java.util.Scanner;
public class CheckStudentPassFail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks : ");
        int marks =sc.nextInt();

        String ReportCard = marks>=33? "Pass" :"Fail";
        System.out.println(ReportCard);
    }
}
