package Arrays;

public class MaxSubArraySumPrefix {

    public static void subarraySum(int number[]){
        int currentSum =0;

        int prefix[]=new int[number.length];
        prefix[0]= number[0];
        //Calcualte prefix array
        for(int i =1;i<prefix.length;i++){
            prefix[i]=prefix[i-1] + number[i];
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i =0;i<number.length;i++){
            for(int j = i;j<number.length;j++){
                  //for the subarays 
                  //i as start and j as end

                  currentSum = i==0?prefix[j]:prefix[j]-prefix[i-1];
                //   for(int k = i;k<=j;k++){
                //    // System.out.print(number[k]+" ");

                //      currentSum  +=number[k];
                     if(maxSum<currentSum){
                        maxSum=currentSum;
                     }
                 // }
                 // System.out.println(currentSum);


            }
        }
        System.out.print("Maximum subarrays sum :"+maxSum);
    }
    public static void main(String[] args) {
        int number[]= {1,2,3,-4,5};
        subarraySum(number);
    }
}
