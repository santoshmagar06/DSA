package Loops;

/**
 * DoWhile
 */
public class Loops {



    public static int bacteria(int a,int b){
        int timer= 0;

        while((a*2)<=b){


           
             timer =timer +20;
             a = a*2;
            
           
        }
        
        return timer;
    }

    public static void main(String[] args) {
        int counter =0;
        //doWhile loop
        // do{
        //     System.out.println("The day will come");
        //     counter++;
        // }
        // while(counter<10);

        //for loop

        for(counter=10;counter>=1;counter--){
         System.out.println("Hello,Santosh"+counter);
        }

        System.out.println(bacteria(1, 10));
    }
}