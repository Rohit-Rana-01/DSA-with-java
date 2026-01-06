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
    public static void main(String[] args){
        int array[] = {-2};
        System.out.println(maxSubArray(array));
        }
 }
