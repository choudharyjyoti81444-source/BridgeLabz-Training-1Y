import java.util.Scanner;
public class WhileLoop{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
	    System.out.print("Enter the Number: ");
        int n = sc.nextInt();
		
      /*  int i=1;
	    for(;1<=10;){  //usng for loop
	       System.out.println(i+" ");
		   i++;
	    }*/
	
	    int j=1;
	    while(j<=n){   //using while loop
	       System.out.println(j+" ");
		   j++;
	    }
	}
}	
	