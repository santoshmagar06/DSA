package Strings;

public class StringBuilders {
    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("");
    for(char ch ='a';ch<='z';ch++){
        sb.append(ch);
        //add a to z
        //time complexity = O(26)
    }

    System.out.print(sb);
} 
    }
    
