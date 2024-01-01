package Arrays;

public class PairsCC {
    public static void pair(int number[]){
        int totalpairs = 0;
        for(int i = 0;i<number.length;i++)
        {
           // int current = number[i];
            for(int j = i+1; j<number.length;j++)
            {
                System.out.print("("+number[i]+","+number[j]+")");
                //System.out.println(number[j]);
                 totalpairs++;
            }
            System.out.println();
           


        }
                    System.out.println("Total number of pairs is:"+totalpairs);

    }

    public static void main(String[] args) {
        
    
    int num[]= {1,2,3,4,5,6,8};

    pair(num );
}
}