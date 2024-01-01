package BasicSortingAlgo;
import java.util.*;

public class BasicSorting {
/// Bubble sort
    public static void BubbleSort(int arr[]){
      ///compare the element and push at the end
        for(int turn =0;turn< arr.length-1;turn++){
            for (int j =0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }}



    //selection Sort
    public static void SelectionSort(int arr[]){
        //pick the smallest and push at the begining
        
        for(int i = 0;i<arr.length-1;i++){
            int smallestPosi=i;
            for(int j= i+1;j<arr.length;j++){
                
                if(arr[smallestPosi]>arr[j]){
                    smallestPosi=j;
                }
            }
            //swap
            int temp = arr[smallestPosi];
            arr[smallestPosi]=arr[i];
            arr[i]=temp;
        }
    }
    public static void InsertionSort(int arr[]){
        //
        for (int i =1;i<arr.length;i++){
            int curr= arr[i];
            int prev = i-1;
            //finding out the current position
            while (prev>=0 && arr[prev]>curr) 
            {
                arr[prev+1]=arr[prev];
                prev--;
                
            }
            //insertion
            arr[prev+1]=arr[curr];
            curr++;
        }
    }
    public static void countingSort(int [] arr){
        int largest = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[]= new int[largest+1];
        for(int i = 0;i<arr.length;i++){
            count[arr[i]]++;
        }
         //sorting
         int j=0;
        for(int i = 0;i<count.length;i++){
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
                
            }
        }
    }
    public static void PrintArr(int arr[]){

         for (int i = 0;i<arr.length;i++){
            System.err.print(arr[i]);
         }
    }
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1,1};

       // BubbleSort(arr);
      // SelectionSort(arr);
      InsertionSort(arr); 

      //Arrays.sort(arr);//inbuilt sort
     // Arrays.sort(arr,0,3);
      // countingSort(arr);
     
        PrintArr(arr);
    }
}
