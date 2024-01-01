package Arrays;

public class KadaneMaxSum {
    public static void subArraySum(int number[]){

        int ms = Integer.MIN_VALUE;
        int cs= 0;
        for(int i =0;i<number.length;i++){
            cs = cs+number[i];
            if(cs<0){
                cs=0;
            }

            ms = Math.max(ms, cs);
           
        }
         System.out.print("The maximum sum is :"+ms);
    }
    public static void main(String[] args) {
        int number [] = {1,-1,2,3,5,-5,-1};
        subArraySum(number);

        //Time complextity is 0(n);
    }
}
