import java.util.Scanner;
public class SquareOfNumberWithInput{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System .in);
		System.out.println("Enter a Number :");
		int x = sc.nextInt();
		int square = x*x;
		System.out.println("square of Number is :" +square);
	}
}	