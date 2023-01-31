package test.hacker.problemsolve.maximumminimum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solve {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        List<Long> re = new ArrayList<>();
        int mach = 0;
        for (int i = 0; i < arr.size(); i++) {
            long sum = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (j != mach) {
                    sum = sum + arr.get(j);
                }
            }
            re.add(sum);
            mach++;
        }
        Collections.sort(re);
        System.out.println(re);
        System.out.println(re.get(0) + " " + re.get(re.size() - 1)+" ami");
    }
}
