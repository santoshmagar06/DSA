package Strings;

public class Strings {

    public static void printLetters(String str){
        for(int i = 0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");

        }
        System.out.println();
    }


    ///check if pallindrome

    public static boolean isPallindrome( String str){
        for(int i = 0; i<str.length()/2;i++){
           int n = str.length();
            if(str.charAt(i)!= str.charAt(n-1-i)){
                return false;//Not a Pallindrome
            }
            else{
                return true;
            }

        }
        return true;
    }
    
    public static void main(String[] args) {
        String name= "Santosh";
        String lastname = "Magar";

        String fullname = name + lastname;

        //printLetters(fullname);

        String str = "racecar";
        System.out.print(isPallindrome(str));

    }
}
