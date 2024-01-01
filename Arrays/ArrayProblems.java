package Arrays;


import java.util.Arrays;

public class ArrayProblems {
    //Que no. 1
     public static boolean isRepeated(int number[]){
        for(int i =0;i<=number.length-1;i++){
             for(int j= i+1;j<number.length;j++){
            if(number[i]==number[j]){
                return true;
            }}
        }

        return false;
     }

     //Que no.2  index return of two number sum is equal to target
    public static int[] twoSum(int[] nums, int target) {
        
         
    for(int i =0;i<=nums.length-1;i++){
        for (int j =i+1;j<nums.length;j++){
            if(target ==nums[i]+nums[j]){
              

               return new int[]{i, j};
            }
          }
        }
    return new int[]{};
    }
  //q.n3 find the median of array
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int median =0;
        
        //merge the arrys into a single sorted array
        int [] merged = new int[ nums1.length+nums2.length];

        int k =0;
        for(int i = 0;i<nums1.length;i++){
            merged[k++]=nums1[i];
        }

        for(int j = 0;j<nums2.length;j++){
            merged[k++]=nums2[j];
        }
        //sort the merged array
        Arrays.sort(merged);
        //calculate the total number of elements in merged array
        int total = merged.length;

        if(total%2==1){
            //if the total number of element is odd,return the mid value as median
            return (double)merged[total/2];
        }

        else{
            //if the total number of element is even
            int middle1 =merged[total/2-1];
            int middle2 = merged[total/2];

            return ((double)middle1+(double)middle2)/2;
        }


        
    }
     
    public static void main(String[] args) {
        int nums[] = {1, 2,3,4};

        int nums1[]={4,3,5};

       // System.out.println(isRepeated(nums));
        // int []index =twoSum(nums, 7);
        // for (int i : index) {
        //     System.out.print(i+",");
        // }    

       System.out.print(findMedianSortedArrays(nums, nums1));
        }
}
