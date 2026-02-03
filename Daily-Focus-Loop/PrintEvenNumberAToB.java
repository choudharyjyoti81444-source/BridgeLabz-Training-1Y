import java.util.Scanner;

public class PrintEvenNumberAToB{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter ending number (b): ");
        int b = sc.nextInt();

        for (int i=a; i<=b; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}