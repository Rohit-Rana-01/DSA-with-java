
public class subarrays {


    // mine approach ...
    public static int subinfo(int a[]){
        int largest = Integer.MIN_VALUE;

       
       

    
        for(int i = 0 ; i<a.length ; i++){

            for(int j = i ; j < a.length ; j++){
                System.out.print("(");
                  int sum = 0 ;
                for(int k = i; k<=j ; k++){
                   
                    sum = sum+a[k];
                    System.out.print(a[k]+" ");
                }
                System.out.print(")");
                if(sum > largest ) largest = sum ;
                System.out.println("");
            }
        }
        System.out.println("the largest sum of subarrays is  = "+largest);
        System.out.println("the smallest sum of subarrys is = :"+a[0]);
        int n =(a.length * (a.length+ 1))/2;
        return n ;
    }

    //prefix approach ...
    public static void subarrayprefix(int array[]){
        int largest = Integer.MIN_VALUE;
        int prefix[] = new int[array.length] ;

        // prefix calculation ...
        for ( int i = 0 ; i < prefix.length ; i++){
            prefix[i] = i == 0 ? array[i] :prefix[i-1] + array[i];
        }
        for(int i =0 ;i <array.length; i ++){
            int sum = 0 ;
            for(int j =i ; j< array.length; j++){
                sum = i== 0 ? prefix[j] : prefix[j] - prefix[i-1] ;
            }
                if(sum > largest ) largest = sum ;
                System.out.println(largest);
        }
    }

    // kadane's algo ...
    public static void kadanesubarray(int array[]){
        int cs = 0;
        int maxsum = Integer.MIN_VALUE ;

        for( int i = 0 ; i< array.length ; i++){
           cs = array[i] + cs ;
           if ( cs <= 0) cs = 0 ;
           if( cs >= maxsum )maxsum = cs ;
        }
        System.out.println("the max sum is " + maxsum);
    }

    public static void main(String []args){
        int array[] = {-5,-1,6,2};
        //System.out.print("total numbers of subarrays "+subinfo(array));
        // subarrayprefix(array);
        kadanesubarray(array);
    }
}

