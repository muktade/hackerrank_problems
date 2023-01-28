package test.hacker.math.handshake;

import java.util.Scanner;

public class HandShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        for(int i =1; i<n; i++){
            for(int j = i+1; j<=n; j++){
                a +=1;
            }
        }
        System.out.println(a);
    }
}
