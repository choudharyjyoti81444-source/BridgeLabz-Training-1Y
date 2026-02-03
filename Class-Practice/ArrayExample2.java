import java.util.Scanner;
public class ArrayExample2{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		int marks[] = {12,14,16,18,20};  //Array element
		
		System.out.println("Array element: ");
		for(int i=0; i<marks.length; i++){
		   System.out.println(marks[i]); //Printing elements
	    }
		System.out.println("updating elements:");
		marks[3]=100;
		System.out.println("Array elements:");
		
		for (int i=0; i<marks.length; i++){
		System.out.println(marks[i]);}
	}
}	