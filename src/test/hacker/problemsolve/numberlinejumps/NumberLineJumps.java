package test.hacker.problemsolve.numberlinejumps;


import java.io.IOException;
import java.util.Scanner;

public class NumberLineJumps {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x1=sc.nextInt();
        int v1=sc.nextInt();
        int x2=sc.nextInt();
        int v2=sc.nextInt();
        sc.close();
        String result = Solution.kangaroo(x1,v1,x2,v2);
        System.out.println(result);
    }
}
