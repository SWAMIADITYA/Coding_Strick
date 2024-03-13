import java.util.Arrays;

public class Try {
    public static void main(String[] args) {
       int[][] matrix = {{1,1,1},
                         {1,0,1},
                         {1,1,1}};
       
       boolean fr=false, fc=false;
       
       for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            if(matrix[i][j]==0){
                if(i==0) fr=true;
                if(j==0) fc=true;
               matrix[0][j]=0;
               matrix[i][0]=0;
            }
        }
       }

       for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
       }

       if(fr){
        for(int j=0; j<matrix[0].length; j++){
            matrix[0][j]=0;
        }
       }

       if(fc){
        for(int i=0; i<matrix[0].length; i++){
            matrix[i][0]=0;
        }
       }


       for(int i=0; i<matrix[0].length; i++){
        System.out.println(Arrays.toString(matrix[i]));
       }

    }

   




}
