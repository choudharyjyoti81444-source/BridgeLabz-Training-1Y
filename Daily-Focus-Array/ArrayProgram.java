import java.util.Scanner;
public class ArrayProgram{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		
	    int[] arr = new int[n];
		int sum = 0;
		
		System.out.println("Enter Array Element");
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<n; i++){
            if(arr[i] > max){
				max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
			}
		}

		double average = sum/(double) arr.length;
		
		System.out.println("sum: " +sum);
		System.out.println("Average: " +average);
		System.out.println("Maximum: " +max);
		System.out.println("Minimum: " +min);
		}
	}	