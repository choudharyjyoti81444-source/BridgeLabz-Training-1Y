package DailyFocusString;

import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Element");
        String str = sc.nextLine();

        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);

        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
