package Patterns;

public class PrintStar {



    public static void PrintStar(int n){
      for(int i =0;i<n;i++)
        {
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();
        }
    }

     public static void PrintInvertedStar(int n){
      for(int i =1;i<=n;i++)
        {
            for(int j =1;j<=(n-i+1);j++){

                System.out.print("*");
            }
             System.out.println();
        }
    }

    public static void PrintHalfPyramid(int n){
      for(int i =1;i<=n;i++)
        {
            for(int j =1;j<=i;j++){

                System.out.print(j);
            }
             System.out.println();
        }
    }

    public static void PrintCharacterStar(int n){
        char ch ='A';
      for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){

                System.out.print(ch);
                ch++;
            }
             System.out.println();
        }
    }

///  Hallow rectangle 
     public static void HallowRectange(int totRows,int totCol){
        //for rows
    for(int i = 1;i<=totRows;i++){

        //for inner column
        for(int j = 1;j<=totCol;j++){
           if(i==1||i==totRows || j==1||j==totCol){
            System.out.print("*");
           }
           else
           {System.out.print(" ");}
        }
        System.out.println();
    }
     }
    //RotatedHalfPyramed
    public static void InvertedHalfPyramid(int rows){

        for(int i =1;i<=rows;i++){
            for(int j=1;j<=(rows-i);j++)/// when value of j is equal to n-1  printing the space
            {
                System.out.print("  ");
            }

            //for star;tnumbers of stars to be printed
            for(int j= 1;j<=i;j++)
            {
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }

    // Zero one triangle

    public static void zero_one_triangle(int n)
    {
         for(int i = 1;i<=n;i++)
         {
            for(int j = 1;j<=i;j++)
            {
                if((i+j )%2==0)
                {
                    System.out.print(1);
                }
                else
                {System.out.print(0);}
            }
            System.out.println();
         }
    }


    //printing the butterflypattern
    public static void  butterflypattern(int n)
    {
        for (int i = 1;i<=n;i++)
        {
            //first star
            for(int j = 1;j<=i;j++)
            { System.out.print("*");}

            //for spaces
            for(int j =1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }

            //for stars
             for(int j = 1;j<=i;j++)
            { System.out.print("*");}
           System.out.println();


          
           
        }
         //2nd half
          for (int i = n;i>=1;i--)
        {
            //first star
            for(int j = 1;j<=i;j++)
            { System.out.print("*");}

            //for spaces
            for(int j =1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }

            //for stars
             for(int j = 1;j<=i;j++)
            { System.out.print("*");}
           System.out.println();


          
           
        }
    }

    //Hallo Rhombus pattern
    public static void hallowRhombus(int n){
        for (int i=1;i<=n;i++)
        {
            //for printing space

            for (int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }

            //for the rhombus

            for(int j=0;j<=n;j++)
            {
                if(i==1 || i==n || j==1 ||j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
       //PrintInvertedStar(4);

    // PrintCharacterStar(5);   
    //HallowRectange(4,5 );
    //InvertedHalfPyramid(5);
   // zero_one_triangle(5);
   //butterflypattern(4);
   hallowRhombus(5);

}
}
