import java.util.Scanner;

public class Print1To100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number to start : ");
        int a =sc.nextInt(); 
		System.out.print("Enter any number to end : ");
        int b =sc.nextInt(); 

        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}