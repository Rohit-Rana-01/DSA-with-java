

public class largest {
    public static int find(int a[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE ;

        for (int i = 0; i < a.length ; i ++){
            if ( a[i] < smallest ) smallest = a[i] ;
            if (a[i] > largest  ) largest = a[i];
        }
        System.out.println("the smallest value is  = " +smallest );
        return largest ;
    }
    public static void main(String[] args){
        int array [] = {34, 45,56,756,2,1};

        System.out.println("the largest number is  ="+ find(array));
    }
}
