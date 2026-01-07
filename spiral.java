
public class spiral {
    public static void spiralOrder(int[][] matrix){

        int sc = 0 ;
        int sr = 0;
        int ec = matrix[0].length-1 ;
        int er =matrix.length-1 ;

        while(sr <= er && sc<=ec){
            //top printing
            for(int i= sc ;i<=ec ;i++){
                System.out.print(matrix[sr][i]+" ");
            }
            // right side printing ..
            for(int i=sr+1 ; i<=er;i++){
                System.out.print(matrix[i][ec]+" ");
            }
            // bottum printing 
             for(int i=ec-1 ; i>=sc;i--){
                if(sr == er){
                    break ;
                }
                System.out.print(matrix[er][i]+" ");
            }
            //left side printing..
             for(int i=er-1 ; i>=sr+1;i--){
                if(sc == ec){
                    break;
                }
                System.out.print(matrix[i][sc]+" ");
            }
            sc++;
            sr++;
            er --;
            ec --;
        }
    }
    public static void main(String[] args){
        int matrix[][] ={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        spiralOrder(matrix);
    }
}
