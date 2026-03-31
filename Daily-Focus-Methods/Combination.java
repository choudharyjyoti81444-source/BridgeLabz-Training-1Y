package Daily_Focus_Methods;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter n-factorial");
        int n = sc.nextInt();

        System.out.println("ENter r-factorial");
        int r = sc.nextInt();

        int n_fact = 1;
        for(int i=1; i<=n; i++){
            n_fact *= i;
        }

        int r_fact = 1;
        for(int i=1; i<=r; i++){
            r_fact *= i;
        }

        int n_r__fact = 1;
        for(int i=1; i<=n-r; i++){
            n_r__fact *= i;
        }

        System.out.println(n_fact/(r_fact*n_r__fact));
    }
}
