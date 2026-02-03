import java.util.Scanner;

public class PrintTableOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Starting number : ");
        int a = sc.nextInt();
		System.out.print("Enter ending number : ");
        int b = sc.nextInt();
		System.out.print("Enter divisible number : ");
        int n = sc.nextInt();
		 
		for(int i=a; i<=b; i++){
		System.out.println(n + "x" + i + "=" +(n*i));}
	}
}	