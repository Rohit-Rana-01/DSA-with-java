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
    public static void main(String[] args){
        int array[] = {-2, 1,-3,4,-1,2,1,-5,4};
        System.out.println(kadanes(array));
        }
 }
