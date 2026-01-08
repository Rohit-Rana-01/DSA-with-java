public class martixsearch {
     public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0 ;
        int col = matrix[0].length -1 ;

        while(row <matrix.length && col >=0 ){
            if(target == matrix[row][col]){
                return true ;
            }else if(target < matrix[row][col]){
                col -- ;
            }else{
                row ++ ;
            }
        }
        return false ;
    }
    public static void main(String[] args){
        int matrix[][] ={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}};
        System.out.println(searchMatrix(matrix,66));
    }
}
