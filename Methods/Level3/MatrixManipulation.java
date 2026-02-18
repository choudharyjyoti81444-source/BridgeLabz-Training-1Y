package com.gla.Methods.Level3;
import java.util.Random;
import java.util.Scanner;
public class MatrixManipulation {
    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10) + 1; // random 1-10
        return matrix;
    }

    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }

    public static double determinant2x2(double[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = {
                { m[1][1]/det, -m[0][1]/det },
                { -m[1][0]/det, m[0][0]/det }
        };
        return inv;
    }

    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;
        double[][] inv = new double[3][3];
        inv[0][0] = (m[1][1]*m[2][2]-m[1][2]*m[2][1])/det;
        inv[0][1] = -(m[0][1]*m[2][2]-m[0][2]*m[2][1])/det;
        inv[0][2] = (m[0][1]*m[1][2]-m[0][2]*m[1][1])/det;
        inv[1][0] = -(m[1][0]*m[2][2]-m[1][2]*m[2][0])/det;
        inv[1][1] = (m[0][0]*m[2][2]-m[0][2]*m[2][0])/det;
        inv[1][2] = -(m[0][0]*m[1][2]-m[0][2]*m[1][0])/det;
        inv[2][0] = (m[1][0]*m[2][1]-m[1][1]*m[2][0])/det;
        inv[2][1] = -(m[0][0]*m[2][1]-m[0][1]*m[2][0])/det;
        inv[2][2] = (m[0][0]*m[1][1]-m[0][1]*m[1][0])/det;
        return inv;
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%.2f\t", val);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix (2 or 3): ");
        int n = sc.nextInt();
        if (n != 2 && n != 3) {
            System.out.println("Only 2x2 or 3x3 supported.");
            return;
        }

        double[][] matrix = createRandomMatrix(n, n);
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        System.out.println("Transpose:");
        displayMatrix(transposeMatrix(matrix));

        double det = (n == 2) ? determinant2x2(matrix) : determinant3x3(matrix);
        System.out.println("Determinant: " + det);

        double[][] inv = (n == 2) ? inverse2x2(matrix) : inverse3x3(matrix);
        if (inv == null) System.out.println("Matrix is singular, inverse does not exist.");
        else {
            System.out.println("Inverse:");
            displayMatrix(inv);
        }
    }
}
