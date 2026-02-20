package Daily2DArrayPractice;

import java.util.Scanner;

public class RowWiseTraversal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows Element");
        int r = sc.nextInt();
        System.out.println("Enter Column Element");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter matrix Elements:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Row Wise Traversal:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
