package Arrays;

public class SubArrays {

    public static void printSubArray(int number[]){
        int sum =0;
        for (int i =0;i<number.length;i++){
            for(int j = 0;j<number.length;j++){
                  //for the subarays 
                  //i as start and j as end
                  for(int k = i;k<=j;k++){
                    System.out.print(number[k]+" ");

                     sum  +=number[k];
                  }
                  System.out.println(sum);


            }
        }
    }
    public static void main(String[] args) {
        int number []= {2,4,6,8,10};

        printSubArray(number);

           /// for sum -> n(n+1)/2;
        //time complexibility will be 
    }
}
