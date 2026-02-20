package Daily2DArrayPractice;

import java.util.Scanner;

public class ColumnWiseTraversal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int r = sc.nextInt();
        System.out.println("Enter columns:");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter Matrix Element:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Column Wise Traversal:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
