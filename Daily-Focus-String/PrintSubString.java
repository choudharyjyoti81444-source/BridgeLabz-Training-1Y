package DailyFocusString;
import java.util.Scanner;
public class PrintSubString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter an Element");
        String str = sc.nextLine();

        for(int  i=0; i<=str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
             String result = str.substring(i,j);
             System.out.print(result+" ");
            }
        }
    }
}
