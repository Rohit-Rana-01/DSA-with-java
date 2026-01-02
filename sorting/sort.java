

public class sort{

    public static void display(int[] arr){
        for( int i = 0 ; i<= arr.length -1 ; i ++){
            System.out.print(arr[i]+ " ");
        }
    }

    // bubble sort   .......
    // time complexity = O(n^2) .
    public static int[] bubbleSort(int[] arr){
        for( int i = 0 ; i< arr.length - 1; i++ ){
            for( int j = 0 ; j < arr.length -i-1 ; j++){
                // swaping 
                if( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }
        return arr ;
    }

    // selection sort ....
    // time complexity = O(n^2) .
    public static int[] selectionSort(int[] arr){

        for( int i = 0 ;i < arr.length - 1 ; i ++){
            int smallest = i;
            for( int j = i+1 ; j < arr.length-1 ;j++){
                if( arr[smallest] > arr[j]){
                    arr[smallest] = j;
                }
            }
            if(smallest < arr[i]){
                int temp = smallest ;
                    arr[smallest] = arr[i];
                    arr[i] = arr[temp];
            }
        }
        return arr ;
    }

    //insetion sort ...
    // time complexity = O(n^2) .
    public static int[] insertionSort(int[] arr ){
          for( int i = 1 ; i < arr.length -1 ;i++){
            int current = arr[i];
            int j = i-1;
            while(j <= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j-- ;
            }
            //placement
            arr[j+1]  = current ;
        }
        return arr ;
    }

    public static void main(String[] args){
        int[] arr = new int[] {4 ,2,16,26,48,5,78,22};
        display(arr);
       
        System.out.println("");

        display( bubbleSort(arr));
        System.out.println("bubble sort .");
        
        display(selectionSort(arr));
        System.out.println("slection sort . ");
        
        display(insertionSort(arr));
        System.out.println("insertion sort  .");
    }
}   