import java.util.Scanner;
public class ArrayDuplicates{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter Array Element");
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();	
		}
		
		boolean found = false;
		
		for(int i=0; i<n; i++){
		   for(int j=i+1; j<n; j++){
		       if(arr[i] == arr[j]){
			   found = true;
			   break;
			}
		}
		if (found) break;
	    }
		
	    if(found){
		    System.out.println("Duplicate found");
		}
		else{
			System.out.println("Not Duplicates");
		}	
	}
	
}	