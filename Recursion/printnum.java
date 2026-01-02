package Recursion;

public class printnum{

    public static void printtill(int n ){
        if(n == 0){
            return ;
        }
        printtill(n-1);
        System.out.println(n);
        
        }

    public static void main(String[] args ){
        int n = 5 ;
        printtill(n );
    }
}