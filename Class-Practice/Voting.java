import java.util.Scanner;
class Voting{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your age: ");
	int age = sc.nextInt();
	if (age >= 18) { 
	System.out.println("you are eligible for voting.");}
	else{
	System.out.println("you are not eligible for voing.");
	}
  }
}  