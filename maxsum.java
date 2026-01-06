public class maxsum {

    public static int kadanes(int[] nums){
        int csum = 0;
        int maxsum = Integer.MIN_VALUE ; 
        for(int i =0 ; i<nums.length ;i ++){
          csum = nums[i] + csum;
          if(csum < 0) csum = 0 ;
          if(csum > maxsum) maxsum = csum ;
        }
        return maxsum ;
    }

    // modifying it for all negative values 
    public static  int maxSubArray(int[] nums) {
        int csum = 0;
        int largest = Integer.MIN_VALUE ;
        int maxsum = Integer.MIN_VALUE ; 
        boolean check = false;

        for(int i =0 ; i<nums.length ;i ++){
            if(nums[i]>0){
                check = true ;
            }
          largest = Math.max(largest , nums[i]);
          csum = nums[i] + csum;
          if(csum < 0) csum = 0 ;
          if(csum > maxsum) maxsum = csum ;
        }


        if(check == true){
            return maxsum ;
        }
        return largest ;
    }

    // final kadanes algo more appropriate  ;
    public static int finalmaxsubArray(int []nums){
        int csum = 0;
        int maxsum = nums[0] ;
        for(int i=0 ; i<nums.length ; i++){
            csum = Math.max(csum +nums[i] , nums[i]);
            maxsum = Math.max( csum ,maxsum );
        }
        return maxsum ;
    }
    public static void main(String[] args){
        int array[] = {-2, -1,-3,4,-1,2,1,-5,4};
        System.out.println(finalmaxsubArray(array));
        }
 }
