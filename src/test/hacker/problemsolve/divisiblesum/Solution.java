package test.hacker.problemsolve.divisiblesum;

import java.util.List;

public class Solution {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            int sum = ar.get(i);
            for (int j = i + 1; j < n; j++) {
                //sum = sum + ar.get(j);
                int ab= ar.get(j);
                if ((sum + ab) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
