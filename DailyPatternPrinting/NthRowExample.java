package DailyPatternPrinting;

import java.util.Scanner;

public class NthRowExample {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row Number");
        int n = sc.nextInt();

        int start = (n-1)*n/2+1;
        int end = n*(n+1)/2;

        for(int i=start; i<=end; i++){
            System.out.print(i+ " ");
        }
    }
}
