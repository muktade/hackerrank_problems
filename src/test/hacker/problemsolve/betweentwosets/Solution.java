package test.hacker.problemsolve.betweentwosets;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int f1 = 0;
        int sm, bg;
        if(a.size()!=2){
            sm=0;
            bg=a.get(0);
        }else {
            sm=a.get(1);
            bg=a.get(0);
        }
        if (bg > sm) {
            f1 = factor(bg, sm);
        } else if (bg < sm) {
            int t = bg;
            bg=sm;
            sm=t;
            f1 = factor(bg, sm);
        }
        if(f1==0){
            f1=sm*bg;
        }
        int T = 20;
        TreeMap<Integer, Integer> m1 = new TreeMap<>();
        while (T-- > 1) {
            m1.put(T, f1 * T);
        }
        System.out.println(m1);
        if(m1.containsValue(sm)){
            m1.pollFirstEntry();
        }
        int res = 0;
        for (Integer n: m1.values()) {
            if(test(n,b)){
//                System.out.println(n);
                res++;
            }
        }
        return res;
    }

    public static boolean test(int a, List<Integer> b) {
            for (Integer m : b) {
                if (m % a != 0) {
                    return false;
                }
            }
        return true;
    }

    public static int factor(int a, int b) {
        int ans = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                ans = i;
            }
        }
        return ans;
    }

}
