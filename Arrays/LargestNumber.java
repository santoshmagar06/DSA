package Arrays;

public class LargestNumber {

    public static int largestNum(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        
        int number[]= {1,2,4,6,7};

        System.out.print(largestNum(number));
    }
}
