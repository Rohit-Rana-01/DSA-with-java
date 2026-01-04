import java.util.*;
public class rainwater {
    
    public static int trap(int[] height ){
        int twater = 0 ;
        int waterl = 0 ;

        for(int i = 1; i<height.length-1 ; i++){
            // left max heigth check ...
            int leftmax = 0 ;
            for(int  j = i ; j>=0 ; j -- ){
                if (leftmax < height[j]) leftmax = height[j];
            }
            // right max height check  ...
            int rightmax =0 ;
            for( int k = i ; k <height.length ;k++){
                if(rightmax < height[k]) rightmax = height[k] ;
            }

            waterl = Math.min(rightmax ,leftmax) ;

            int diff = waterl -height[i];
            if(diff <= 0 ){
                diff = 0 ;
            }else{
                twater += diff;
            }
        }
        return twater ;
    }
    public static void main(String []args){

        int array[] ={ 4,2,0,6,3,2,5} ;
        System.out.println("the total rain water traped : "+trap(array));
    }
}
