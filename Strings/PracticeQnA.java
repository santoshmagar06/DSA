package Strings;

import java.util.Scanner;

public class PracticeQnA {
    public static void main(String[] args) {
        //count the entered number of vowels 
        System.out.println("Enter the strings : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }

       System.out.print("There are "+count+","+"vowels in entered string");
        
    }
}
