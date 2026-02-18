import java.util.Scanner;
public class Duplicate{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter Array Element");
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		}

        boolean flag = false;
 		int duplicate = 0;
		for(int i=0; i<n; i++){
		    for(int j=i+1; j<n; j++){
			    if(arr[i] == arr[j]){
				   flag = true;
				    duplicate = arr[i];
					break;
				}
			}
			if(flag) break;
		}
		
		if(flag){
		    System.out.println("Duplicate Number is" +duplicate);
		}
		else{
		    System.out.println("Not any Duplicate Find");
		}
	}
}	