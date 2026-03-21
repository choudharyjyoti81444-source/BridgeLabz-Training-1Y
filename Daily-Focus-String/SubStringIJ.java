package DailyFocusString;
import java.util.Scanner;
public class SubStringIJ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Element");
        String str = sc.nextLine();

        System.out.println("Enter  Starting index");
        int i = sc.nextInt();

        System.out.println("Enter ending index");
        int j = sc.nextInt();

        if(i>=0 && j<=str.length() && i<j){
            String result = str.substring(i,j);
            System.out.println("SubString is " +result);
        }
        else{
            System.out.println("Invalid");
        }
    }
}
