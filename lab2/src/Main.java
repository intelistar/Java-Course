import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int m;
        do {
            m = scanner.nextInt();
        }while(m <= 0);
        System.out.print("Enter number of columns: ");
        int n;
        do {
            n = scanner.nextInt();
        }while(n <= 0);

        Matrix matrix = new Matrix(m, n);

        MatrixCreator mc = new MatrixCreator();

        mc.randomFill(matrix);

        Matrix m1 = matrix.clone();

        System.out.println("Original matrix:\n" + matrix);

        int k;
        System.out.print("Enter the index of the row to sort columns by: ");
        do {
            k = scanner.nextInt();
        }while(k >= m || k < 0);

        MatrixSort ms = new MatrixSort();
        ms.sortColumnsByRow(matrix, k);

        System.out.println("Matrix with sorted columns by row " + k + ":\n" + matrix);

        System.out.println("Cloned matrix \n" + m1);

    }
}

class Matrix implements Cloneable {

	private int[][] matrix;

    Matrix(){
        this(1,1);
    }
    Matrix(int m){
        this(m,m);
    }
    Matrix(int m, int n){
        if(m <= 0 || n <= 0){
         matrix = new int[1][1];
        } else matrix = new int[m][n];
    }

    public int getVerticalSize(){
        return matrix.length;
    }
    public int getHorizontalSize(){
        return matrix[0].length;
    }
    public void setElement(int i, int j, int value){
        if(i > 0 && i < matrix.length && j > 0 && j < matrix[0].length){
            matrix[i][j]=value;
        }
    }
    public int getElement(int i, int j){
        if(i > 0 && i < matrix.length && j > 0 && j < matrix[0].length){
            return matrix[i][j];
        }else return 0;
    }
    public Matrix clone() throws CloneNotSupportedException {
        Matrix clone = (Matrix) super.clone();
        clone.matrix = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            clone.matrix[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        }
        return clone;
    }

    public void swapColumns(int col1, int col2){
        int tmp;
        for(int i = 0; i < matrix.length; i++){
            tmp = matrix[i][col1];
            matrix[i][col1] = matrix[i][col2];
            matrix[i][col2] = tmp;
        }
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(int[] row: matrix){
            for(int value: row){
                result.append(value).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
    
    public int hashCode() {
        return Arrays.deepHashCode(matrix);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Matrix other = (Matrix) obj;
        return Arrays.deepEquals(matrix, other.matrix);
    }
}
class MatrixCreator {
    public void  randomFill(Matrix matrix){
        for(int i = 0; i < matrix.getVerticalSize(); i++) {
            for (int j = 0; j < matrix.getHorizontalSize(); j++) {
                matrix.setElement(i,j, (int)(Math.random() * 10));
            }
        }
    }
    void enter(Matrix matrix){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < matrix.getVerticalSize(); i++){
            for(int j = 0; j < matrix.getHorizontalSize(); j++){
                matrix.setElement(i,j,in.nextInt());
            }
            System.out.println();
        }
    }
}
class MatrixSort{
    public void sortColumnsByRow(Matrix matrix, int k){
        if(k >= matrix.getVerticalSize() || k < 0) return;
        for(int i = 0; i < matrix.getHorizontalSize(); i++){
            for(int j = 0; j < matrix.getHorizontalSize() - i - 1; j++) {
                if (matrix.getElement(k,j) > matrix.getElement(k,j + 1)) {
                    matrix.swapColumns(j, j + 1);
                }
            }
        }
    }
}