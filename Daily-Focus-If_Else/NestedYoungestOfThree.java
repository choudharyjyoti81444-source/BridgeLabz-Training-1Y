import java.util.Scanner;
public class NestedYoungestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of first person: ");
        int a=sc.nextInt();

        System.out.print("Enter age of second person: ");
        int b=sc.nextInt();

        System.out.print("Enter age of third person: ");
        int c=sc.nextInt();

        if(a<b){
            if(a<c){
                System.out.println("First person is the youngest");}
            else {
                System.out.println("Third person is the youngest");}
        } 
		else{
            if(b<c){
                System.out.println("Second person is the youngest");}
            else {
                System.out.println("Third person is the youngest");}
        }
    }
}