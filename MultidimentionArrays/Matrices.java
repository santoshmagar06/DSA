package MultidimentionArrays;

import java.util.Scanner;

public class Matrices {
    public static int largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int n = matrix.length; int m= matrix[0].length;
         for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(matrix[i][j]>largest){
                 largest=matrix[i][j];
                    
                }
            }
        }

        return largest;
    }
    public static boolean Search(int matrix[][],int key){
        int n = matrix.length; int m= matrix[0].length;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.print("The key found at("+i+","+j+")");
                    return true;
                    
                }
            }
        }
        System.out.print("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
       //inserting the value
        Scanner sc = new Scanner(System.in);
        int n = matrix.length; int m = matrix[0].length;

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //output
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
              System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Search(matrix, 5);
        System.out.print("The largest value in matrix is: "+largest(matrix));
    }
}
