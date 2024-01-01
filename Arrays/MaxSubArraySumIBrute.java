package Arrays;

import java.util.Currency;

public class MaxSubArraySumIBrute {
    
    public static void subarraySum(int number[]){
        int currentSum =0;
        int maxSum = Integer.MIN_VALUE;
        for (int i =0;i<number.length;i++){
            for(int j = i;j<number.length;j++){
                  //for the subarays 
                  //i as start and j as end
                  for(int k = i;k<=j;k++){
                   // System.out.print(number[k]+" ");

                     currentSum  +=number[k];
                     if(maxSum<currentSum){
                        maxSum=currentSum;
                     }
                  }
                 // System.out.println(currentSum);


            }
        }
        System.out.print("Maximum subarrays sum :"+maxSum);
    }


    public static void main(String[] args) {
        int number []= {2,4,6,4};
        subarraySum(number);


    }
    
}
