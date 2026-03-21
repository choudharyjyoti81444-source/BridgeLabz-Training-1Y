package DailyFocusString;

import java.util.Arrays;
import java.util.Scanner;
public class AnagramCheck1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st String");
        String s1 = sc.nextLine();

        System.out.println("Enter 2nd String");
        String s2 = sc.nextLine();

        s1 = s1.trim().toUpperCase();
        s2 = s2.trim().toUpperCase();

        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            return;
        }

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
