public class transpose {
    //display original matrix
    public static void display(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            
                                      System.out.println();

        }
    }
    
    public static void main(String[] args) {
        int row =2,column =4;
        int matrix[][]= {{2,5,6,8},
                         {10,11,12,13}};
                         display(matrix);
                         // transpose of matrix 
                         int transpose[][] = new int[column][row];
                         for(int i =0;i<row;i++){
                            for(int j =0;j<column;j++){
                                transpose[j][i] = matrix[i][j];
                            }
                         }
                         display(transpose);

    }
}
