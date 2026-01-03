import java.util.*;
public class subarrays {
    public static int subinfo(int a[]){
        int largest = Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE ;
       
       

    
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
    public static void main(String []args){
        int array[] = {2,-5,-1,6,-2,8};
        System.out.print("total numbers of subarrays "+subinfo(array));
    }
}

