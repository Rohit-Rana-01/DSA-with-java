// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         List<Integer> result = new ArrayList<>();

//         int sc = 0 ;
//         int sr = 0;
//         int ec = matrix[0].length-1 ;
//         int er =matrix.length-1 ;

//         while(sr <= er && sc<=ec){
//             //top printing
//             for(int i= sc ;i<=ec ;i++){
//                result.add(matrix[sr][i]);
//             }
//             // right side printing ..
//             for(int i=sr+1 ; i<=er;i++){
//                result.add(matrix[i][ec]);
//             }
//             // bottum printing 
//              for(int i=ec-1 ; i>=sc;i--){
//                 if(sr == er){
//                     break ;
//                 }
//                result.add(matrix[er][i]);
//             }
//             //left side printing..
//              for(int i=er-1 ; i>=sr+1;i--){
//                 if(sc == ec){
//                     break;
//                 }
//                result.add(matrix[i][sc]);
//             }
//             sc++;
//             sr++;
//             er --;
//             ec --;
//         }
//         return result ;
//     }
// }
