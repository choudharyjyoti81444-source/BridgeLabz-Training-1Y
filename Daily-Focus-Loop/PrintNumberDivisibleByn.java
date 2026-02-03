import java.util.Scanner;

public class PrintNumberDivisibleByn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Starting number : ");
        int a = sc.nextInt();
		System.out.print("Enter ending number : ");
        int b = sc.nextInt();
		System.out.print("Enter divisible number : ");
        int n = sc.nextInt();

        for (int i=a; i<=b; i++) {
            if (i%n==0) {
                System.out.println(i);
            }
        }
    }
}