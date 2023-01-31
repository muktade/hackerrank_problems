package test.hacker.problemsolve.betweentwosets;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        for(int i=0; i<n; i++){
            a.add(sc.nextInt());
        }
        for(int i=0; i<m; i++){
            b.add(sc.nextInt());
        }

        int re = Solution.getTotalX(a,b);
        System.out.println(re);
    }


}
