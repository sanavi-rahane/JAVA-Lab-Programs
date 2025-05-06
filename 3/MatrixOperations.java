import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        System.out.println("Enter a 3x3 matrix:");

        // Step 1: Input matrix from user
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        // Step 2: Transpose
        int[][] transpose = getTranspose(matrix);
        System.out.println("\nTranspose:");
        printMatrix(transpose);

        // Step 3: Determinant
        int det = getDeterminant(matrix);
        System.out.println("\nDeterminant: " + det);

        // Step 4: Inverse (only if determinant != 0)
        if (det != 0) {
            double[][] inverse = getInverse(matrix, det);
            System.out.println("\nInverse:");
            printMatrix(inverse);
        } else {
            System.out.println("\nInverse does not exist (determinant is 0).");
        }

        scanner.close();
    }

    // Method to get transpose
    public static int[][] getTranspose(int[][] m) {
        int[][] t = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                t[i][j] = m[j][i];
        return t;
    }

    // Method to calculate determinant
    public static int getDeterminant(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Method to calculate inverse
    public static double[][] getInverse(int[][] m, int det) {
        double[][] inverse = new double[3][3];

        // Calculate cofactors manually
        inverse[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / (double)det;
        inverse[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / (double)det;
        inverse[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / (double)det;

        inverse[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / (double)det;
        inverse[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / (double)det;
        inverse[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / (double)det;

        inverse[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / (double)det;
        inverse[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / (double)det;
        inverse[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / (double)det;

        return transposeDouble(inverse); // Because we need adjugate (transpose of cofactor matrix)
    }

    // Helper method to transpose double matrix
    public static double[][] transposeDouble(double[][] m) {
        double[][] t = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                t[i][j] = m[j][i];
        return t;
    }

    // Print int matrix
    public static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Print double matrix
    public static void printMatrix(double[][] m) {
        for (double[] row : m) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }
}
