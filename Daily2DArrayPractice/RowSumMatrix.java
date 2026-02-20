package Daily2DArrayPractice;

import java.util.Scanner;

public class RowSumMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows:");
        int r = sc.nextInt();
        System.out.print("Enter Number of columns:");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter Number of Element:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<r; i++){
            int sum = 0;
            for(int j=0; j<c; j++){
                sum += arr[i][j];
            }
            System.out.println("Sum of row " +i+ " = " +sum);
        }
    }
}
