package java_placement_course_alpha2;

public class Arrays_2D_transpose {
    public static void printMatrix(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row=2,col=3;
        int matrix[][]= { {2, 3, 7}, {5, 6, 7} };
        //original matrix
        System.out.println("original matrix");
        printMatrix(matrix);
        System.out.println("transpose matrix");

        int transpose[][]=new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i]=matrix[i][j];
            }
        }
        printMatrix(transpose);

    }
}
