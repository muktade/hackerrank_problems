package test.hacker.math.lenonardosprime;

import java.math.BigInteger;
import java.util.Scanner;

public class LenonardosPrime {
    public static int primeCount(long n) {
        // Write your code here
        int[] ar = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59};
        int cont = 0;
        for (int i = 0; i < ar.length; i++) {
            if(n>=ar[i]){
                n = n/ar[i];
                cont++;
            }else {
                break;
            }


//            p =p * ar[i];
//            if (p > 0) {
//                if (p > n) {
//                    return i;
//                } else if (n > p) {
//                    cont = cont + 1;
//                }
//            }
        }
            return cont;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){

            System.out.println(primeCount(sc.nextLong()));
        }
        sc.close();
    }
}
