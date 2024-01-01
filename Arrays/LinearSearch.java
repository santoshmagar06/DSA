package Arrays;

public class LinearSearch {
    
    public static int linearSearch(int number[],int key){

        for(int i = 0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }

           
        }
         return -1;
    }

    //return string
    public static  String returnString(String menu[],String key)
    {
        for(int i =0;i<menu.length;i++){

            if(menu[i]==key){
                return String.valueOf(i);
            }
        }

        return "-";
    }
    public static void main(String[] args) {
        
    String key ="dalbhat";

    int number []= {1,2,3,4,5,6,8,9};

    String menu[] = {"Biryani","dalbhat","momo"};

    // int location = linearSearch(number, key);

    // if(location==1){
    //   System.out.println(location);
    // }

    // else{
    //     System.err.println("Key not found");
    // }

    String location = returnString(menu, key);
    if("-".equals(location))
    {
        System.out.println("Key not found");
    }
    else{
        System.out.print(location);
    }

    
   
}}
