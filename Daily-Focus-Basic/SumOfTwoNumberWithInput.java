import java.util.Scanner;
public class SumOfTwoNumberWithInput{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st Number :");
	int x = sc.nextInt();
	System.out.println("Enter 2nd Number :");
	int y = sc.nextInt();
	int sum = x+y;
	System.out.println("Sum Of Two Number is :" +sum);
	}
}	