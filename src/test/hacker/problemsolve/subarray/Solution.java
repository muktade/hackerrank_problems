package test.hacker.problemsolve.subarray;

import java.util.List;

public class Solution {
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int a = 0;
        if (s.size() > 1) {
            for (int i = 0; i < s.size() - m+1; i++) {
                int sum= s.get(i);
                for (int j = i + 1; j < m + i; j++) {
                    sum = sum + s.get(j);
                }
                if (sum == d) {
                    a++;
                }
            }
        } else if (s.size() == 1 && m == 1) {
            if (s.get(0) == d) {
                a++;
            }
        }
        return a;
    }
}
