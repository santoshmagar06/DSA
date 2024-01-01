package Strings;

public class ShortestPath {
    public static float getShortestPath(String str){
        int x= 0,y=0;
        for(int i = 0;i<str.length();i++){
            char direction = str.charAt(i);
            if(direction =='N'){
                y++;
            }
            else if(direction=='S'){
                y--;
            }
            else if(direction=='w'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2 =x*x;
        int Y2 = y*y;
         
        return  (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String str = "WNESSE";


        System.out.print(getShortestPath(str));
    }
}
