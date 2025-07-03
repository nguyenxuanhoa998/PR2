package Assignment02;

public class Activity_4 {
    public static int [] [] transpose(int [][] matrix){
        int [][] result = new int[matrix[0].length][matrix.length];// cái này là đi vào luôn từ vị trí 0
        for  ( int i = 0 ; i <matrix[0].length ; i ++){
            for ( int j = 0; j < matrix.length; j ++){
                result [i] [j] = matrix[j][i];
            }
        }
        return result;
    }
    public static void print2DArray(int [][] matrix){
        for(int i = 0 ; i < matrix.length ; i ++){
            for (int j = 0 ; j < matrix[0].length ; j ++){
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

    }
    public static void main (String [] args){
        int [] [] matrix = {{1,2}, {4,5},{7,8}};
        System.out.println("Original Matrix");
        print2DArray(matrix);
        // compute the transpose
        int [][] transposeMatrix= transpose(matrix);
        System.out.println("\nTransposed Matrix : ");
        print2DArray(transposeMatrix);
    }

}
