
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

    // advance using auxilary arrays .....or temporary arrays ...
    public static int trapadv(int[] height ){
        int n = height.length ;
        int twater = 0 ;
        int waterl = 0 ;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n] ;

        // leftmax calc ..
        leftmax[0] = height[0] ;
        for(int i = 1 ; i< n ; i++){
            leftmax[i] = Math.max( height[i] , leftmax[i-1]);
        }

        //rightmax calc ....
        rightmax[n-1] = height[n-1] ;
        for(int i = n-2 ; i >=0 ; i --){
            rightmax[i] = Math.max(height[i] , rightmax[i+1]);
        }

        // loop 

        for(int i = 0 ; i<n ; i++){
            waterl = Math.min(leftmax[i] ,rightmax[i]) ;
            twater += waterl - height[i] ;

        }
        return twater ;
    }

    public static void main(String []args){

        int array[] ={ 4,2,0,6,3,2,5} ;
        System.out.println("the total rain water traped : "+trapadv(array));
    }
}
