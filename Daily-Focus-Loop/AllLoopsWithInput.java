import java.util.Scanner;

public class AllLoopsWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // FOR LOOP
        System.out.println("\nFor loop:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // WHILE LOOP
        System.out.println("\nWhile loop:");
        int j = 1;
        while (j <= n) {
            System.out.println(j);
            j++;
        }

        // DO-WHILE LOOP
        System.out.println("\nDo-While loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= n);

    }
}