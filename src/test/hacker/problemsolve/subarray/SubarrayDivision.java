package test.hacker.problemsolve.subarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubarrayDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(Solution.birthday(list, d, m));
    }
}
