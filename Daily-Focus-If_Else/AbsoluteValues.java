import java.util.Scanner;
public class AbsoluteValues{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a any integer:");
		int n = sc.nextInt(); 
		if(n<0){
		    n=n*(-1);
		    System.out.println("The Absolute Value is :"+n);}
		else{
		System.out.println("The Absolute Value is :"+n);}	
	}
}	