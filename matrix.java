import java.util.*;
public class matrix {

    public static void main(String [] args){
        int m [][] = new int [3][3];
        Scanner sc = new Scanner(System.in);
    
        for(int i = 0 ; i<m.length ; i++){
            for(int j = 0 ; j<m[0].length ;j++){
                m[i][j] = sc.nextInt();
            }
            }
            sc.close();
           for(int i = 0 ; i<m.length ; i++){
            for(int j = 0 ; j<m[0].length ;j++){
                System.out.print(" " +m[i][j]);
            }
            System.out.println();
            } 
    }
}
