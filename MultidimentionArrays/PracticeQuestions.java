package MultidimentionArrays;

public class PracticeQuestions {
    public static boolean repeatataion(int matrix[][],int key){
     int row = 0;
     int col = 0;
     int count =0;
     while (row<matrix.length) {
         for(col=0;col<matrix[0].length-1;col++){}
          if(matrix[row][col]==key){ 
            count++;
            
           
            return true;
            
          }
          
             row++;
             col++;
          
          
         
        
     }
      System.out.print("The "+key+"s are in matrix: "+count);
     System.out.print("Not found");
     return false;
    }
    //Q.no 2, Sum of second row
    public static int sumOfRow(int matrix[][]){
        int sum=0;
        for(int i = 0;i<matrix[0].length;i++){
      
        sum+= matrix[1][i];
    }

        return sum;
    }


    //Q.no.3 Transpose matrix;
    public static void Transpose(int matrix[][]){
        int row = 2;
        int col = 3;
        int Transpose[][]= new int [col][row];
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++)
            Transpose[j][i]=matrix[i][j];
        }
                printMatrix(Transpose);
    }
 
     //print Matrix
     public static void printMatrix(int matrix[][]){
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
     }
    public static void main(String[] args) {
         int matrix[][]={{1,3,7},
                    {2,3,7}};
    int key = 7;
   // repeatataion(matrix, key);
    //System.out.print(sumOfRow(matrix));
    printMatrix(matrix);
    Transpose(matrix);
    }
   
}
