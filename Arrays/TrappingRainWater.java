package Arrays;

public class TrappingRainWater {
     public static int trappedRainWater(int height[]){
        int trappedwater = 0;
        //calculate left max boundary-array

        int leftmaxboundary[]=new int[height.length];
        leftmaxboundary[0]=height[0];
        for(int i = 1;i<height.length;i++){
            leftmaxboundary[i]=Math.max(leftmaxboundary[i-1], height[i]);
           // System.out.print(leftmaxboundary[i]);
        }
        //calculate right max boundary - array

        int rightmaxboundary[] = new int[height.length];
        rightmaxboundary[height.length-1]=height[height.length-1];
        

        for (int i = height.length-2;i>=0;i--){
            rightmaxboundary[i]= Math.max(rightmaxboundary[i+1], height[i]);
         //   System.out.print(rightmaxboundary[i]);
        }
        //loop

        for(int i =0;i<height.length ;i++){
             //water leverl - min(leftmax,rightmax)
             int waterlevel = Math.min(leftmaxboundary[i], rightmaxboundary[i]);
            // System.out.print(waterlevel);
        //trapped water = water level -  height
                trappedwater +=waterlevel-height[i];

        }
       

        return trappedwater;
     }

    public static void main(String[] args) {
        int height []={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
           System.out.print( trappedRainWater(height) ) ;
          }
}

