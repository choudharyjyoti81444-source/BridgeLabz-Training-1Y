package DailyFocusString;
import java.util.*;
public class StringContains {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter an Element");
       String str = sc.nextLine();

       System.out.println("Enter searching elements");
       String n = sc.nextLine();
       System.out.println(str.contains(n));
    }
}
