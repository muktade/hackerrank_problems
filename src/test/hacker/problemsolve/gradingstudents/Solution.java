package test.hacker.problemsolve.gradingstudents;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> ans = new ArrayList<>();
        for (Integer a : grades) {
            if (a >= 38) {
                int b = a % 5;
                if (b >= 3) {
                    switch (b) {
                        case 4:
                            ans.add(a + 1);
                            break;
                        case 3:
                            ans.add(a + 2);
                            break;
                    }
                } else {
                    ans.add(a);
                }
            } else {
                ans.add(a);
            }
        }
        return ans;
    }
}
