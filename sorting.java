public class sorting {
    public static void bubblesort(int [] array){
        
        for(int i = 0 ; i<array.length-1 ; i++){
            for(int j = 0 ; j<array.length-1-i ; j++){
                if(array[j] >array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp ;
                 }
            }
        }

        for(int i= 0 ; i<array.length ; i++){
            System.out.print(" "+array[i]);
        }
    }


    public static void selectionsort(int [] array){
        for(int i = 0 ; i<array.length ; i++){
            int min = i ;
            for(int j=i+1; j<array.length ; j++ ){
                  if(array[j] < array[i]){
                    min = j;
                  }
            }
            if(min != i){
                int temp = array[i] ;
                array[i] = array[min];
                array[min] = temp ;
            }
        }
        for(int i = 0 ; i<array.length ; i++){
            System.out.print(" "+array[i]);
        }
    }


    public static void insertionsort(int [] array){
        for(int i= 0 ; i<array.length ; i++){
          int prev =i-1;
          int curr = array[i] ;
          while(prev >= 0 && array[prev]>curr){
            array[prev+1] = array[prev] ;
            prev-- ;
          }
          array[prev +1] = curr ;
        }
        for(int i = 0 ; i<array.length ; i++){
            System.out.print(" "+array[i]);
        }
    }
    public static void main(String[] args){
        int array[] = {1,3,4,2,9};
        // bubblesort(array);
        // selectionsort(array);
        insertionsort(array);
    }
}
