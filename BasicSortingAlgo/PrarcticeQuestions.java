package BasicSortingAlgo;

public class PrarcticeQuestions {
    public static void bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j = 0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        printArray(arr);
    }

    //selection sort
    public static void selectionSort(int arr[]){
        int minPosition=0;
        for(int i =0;i<arr.length-1;i++){
            minPosition= i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[minPosition]>arr[j]){

                    minPosition=j;
                }
            }

            int temp= arr[minPosition];
            arr[minPosition]=arr[i];
            arr[i]=temp;
            
        }
        printArray(arr);
    }
    //insertion sort
    public static void InsertionSort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            int curr =i;
            int previous = i-1;
            //finding the current location
            while (previous>=0 && arr[previous]>arr[curr]) {
                arr[previous+1]=arr[previous];
                previous = previous-1;
                
            }
            //insertion
            arr[previous+1]=arr[curr];
           // curr++;
        }
        printArray(arr);
    }
    //print array
    public static void printArray(int arr[]){
        for(int i= 0; i<=arr.length-1;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int array []={1,2,3,4,5,7};
        //bubblesort(array);
       // selectionSort(array);
       InsertionSort(array);
    }
    
}
