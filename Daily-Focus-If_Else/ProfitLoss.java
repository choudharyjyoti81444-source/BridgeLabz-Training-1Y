import java.util.Scanner;
public class ProfitLoss{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a selling price :");
		int sp=sc.nextInt();
		System.out.println("Enter cost price :");
		int cp=sc.nextInt();
		if(sp>cp){         //Profit
		System.out.print("your profit is :");
		System.out.println(sp-cp);}
        else{              //Loss
		System.out.print("your loss is :");
		System.out.println(cp-sp);}
	}
}	
		