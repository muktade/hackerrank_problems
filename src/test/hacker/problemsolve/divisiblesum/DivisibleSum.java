package test.hacker.problemsolve.divisiblesum;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisibleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        System.out.println(Solution.divisibleSumPairs(n, k, list));
    }
}
