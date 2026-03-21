package DailyFocusString;

import java.util.Scanner;
public class StringVowelConsonantWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Element");
        String str = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int words = 1;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            ch = Character.toLowerCase(ch);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }
            else if (ch>='a' && ch<='z') {
                consonants++;
            }
            if(ch==' '){
                words++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Words: " + words);
    }
}
