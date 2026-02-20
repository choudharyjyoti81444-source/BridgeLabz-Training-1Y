package Daily2DArrayPractice;

import java.util.Scanner;

public class MatrixInputOutput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        int r = sc.nextInt();
        System.out.println("Enter Number Of columns:");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter matrix Elements:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}