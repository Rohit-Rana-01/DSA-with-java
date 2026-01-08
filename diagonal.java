public class diagonal {
      public static int diagonalSum(int[][] mat) {
        int primary = 0 ;
        int secondary = 0 ;
        for(int i =0 ; i<mat.length ; i++){
            primary += mat[i][i];
            secondary += mat[i][mat.length-i -1];
        }
        int ans =primary +secondary ;
        if(mat.length % 2 == 0){
            return ans ;
        }else{
            int i= mat.length /2 ;
            ans = primary +secondary -mat[i][i];
        }
        return  ans;
    }
    public static void main(String[] args){
        int matrix[ ][] = {{1,2,3}
    ,{4,5,6},
    {7,8,9}};
        int ar = diagonalSum(matrix) ;
        System.out.println(ar);
    }

}
