package Arrays;
import java.util.*;
public class ArrayCC {



    //update array

    public static void update(int num[]){
        for (int i=0;i<num.length;i++){
            num[i] = num[i]+1;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creating array


        int number []= new int[40];

        int num[] = {1,2,3,4};

        String fruits[]= {"Apple","mango","jackfruit"};

//         System.out.println("Enter a marks:");
//         int marks[]= new int[100];
//         marks[0]=sc.nextInt();//physics
//         marks[1]=sc.nextInt();//chem
//         marks[2]= sc.nextInt();//bio
// ;
//        // System.out.println(fruits[0]);//printing array
//         int percentage = (marks[0]+marks[1]+marks[2])/3;


//        System.out.println("Marks of physics :"+marks[0]);
//        System.out.println("Marks of chem :"+marks[1]);
//        System.out.println("Marks of bio :"+marks[2]);


//        System.out.print("Percentage is :"+percentage+"%");
         update(num);

       for(int i = 0;i<num.length;i++){
        System.out.println(num[i]);
       }
    }
}
