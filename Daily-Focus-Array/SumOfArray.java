import java.util.Scanner;
public class SumOfArray{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter array size:");
		int n = sc.nextInt();
	
	    int[] arr = new int[n];
	    int sum = 0;
		
		System.out.println("Enter" + n + "Element");
		
		
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		}

        for(int i=0; i<n; i++){
			sum = sum + arr[i];
        }
		System.out.println("Sum of array = " +sum);
    }
}	