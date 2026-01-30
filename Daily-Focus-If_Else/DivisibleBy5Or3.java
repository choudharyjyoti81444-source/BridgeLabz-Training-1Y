import java.util.Scanner;
public class DivisibleBy5Or3{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number");
	int n=sc.nextInt();
	if(n%5==0 || n%3==0){
	    System.out.println("The Number is divisible by Either 5 or 3 :");}
    else{
	    System.out.println("The Number is not divisible by Either 5 or 3 :");}
	}
}	