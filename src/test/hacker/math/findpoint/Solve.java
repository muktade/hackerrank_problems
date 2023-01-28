package test.hacker.math.findpoint;

import java.util.List;
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            List<Integer> list = FindPoint.print(a,b,c,d);
            for (int aa: list) {
                System.out.print(aa+" ");
            }
            System.out.println();
        }
    }
}
