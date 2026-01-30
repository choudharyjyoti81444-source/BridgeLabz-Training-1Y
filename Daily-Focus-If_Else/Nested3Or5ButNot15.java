import java.util.Scanner;
public class Nested3Or5ButNot15{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a Number");
	    int n=sc.nextInt();
	    if(n%5==0 || n%3==0){
		    if(n%15!=0){
			   System.out.println("The Number is divisible by 3 or 5 but not fifteen");}
			else{
			   System.out.println("condition is not matching");}
		}	   
		else{
		    System.out.println("condition is not matching");}
		}
}		