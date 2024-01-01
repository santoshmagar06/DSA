package MultidimentionArrays;

public class SpiralMatrics {
    public static void printSpiral(int spiralmatrix[][]){
        int startRow=0;
        int endRow=spiralmatrix.length-1;
        int startCol=0;
        int endCol=spiralmatrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
              //for top
              for(int j = startCol;j<=endCol;j++){
                System.out.print(spiralmatrix[startRow][j]+" ");
              }
              //right boundary
              for(int i = startRow+1;i<=endRow;i++){
                System.out.print(spiralmatrix[i][endCol]+" ");
              }

              //button
              for(int j = endCol-1;j>=startCol;j--){
                if(startRow==endRow){ 
                    break;
                }
                System.out.print(spiralmatrix[endRow][j]+" ");

              }
              //left
              for(int i = endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(spiralmatrix[i][startCol]+" ");
              }

             startRow++;
             startCol++;
             endRow--; 
             endCol--;
        }
        System.out.println();
    }
    //Staircase Search
    public static boolean staircaseSearch(int matrix[][],int key){
      int row = 0; int col = matrix[0].length-1;
      while (row<matrix.length && col >=0) {
        if(matrix[row][col]==key){
          System.out.print("Key found at ("+row+","+col+")");
          return true;
        }
        else if(key<matrix[row][col]){
          col--;
         // row++;
        }
        else{
          row++;
          //col--;
        }
        
      }
     return false;
    }
    public static int diagonalSum(int matrix[][]){
        int sum =0;
        int n = matrix.length-1;
        for(int i =0; i <matrix.length;i++){
            //primary diagonal
            sum+= matrix[i][i];
            //secondary diagonal
           if(i!=n-i){
            sum+=matrix[i][n-i];}
        }
        return sum;
    }
    public static void main(String[] args) {
        int spiralmatrix[][]={{1,2,3,4},
                              {5,6,7,8},
                              {9,10,11,12},
                              {13,14,15,16}};
        int key =9;
       // printSpiral(spiralmatrix);

       //System.out.println(diagonalSum(spiralmatrix));
       staircaseSearch(spiralmatrix, key);
}
}