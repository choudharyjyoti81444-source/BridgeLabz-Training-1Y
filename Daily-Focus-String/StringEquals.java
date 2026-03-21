package DailyFocusString;
import java.util.Scanner;
public class StringEquals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter s1");
        String s1 = sc.next();    //Hello

        System.out.println("Enter s2");
        String s2 = sc.next();    //Hello

        System.out.println("Enter s3");
        String s3 = sc.next();  //new String("Hello")

        System.out.println(s1.equals(s3));
    }
}
