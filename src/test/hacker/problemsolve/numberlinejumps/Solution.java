package test.hacker.problemsolve.numberlinejumps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here

        if (test(x1,v1,x2,v2)) {
            return "YES";
        } else {
            return "NO";
        }
    }
    public static boolean test(int x1, int v1, int x2, int v2) {
        int T = 10000;
        TreeMap<Integer, Long> map1= new TreeMap<Integer, Long>();
        TreeMap<Integer, Long> map2= new TreeMap<Integer, Long>();
        while (T-- > 1) {
            map1.put(T, (long) (x1+T*v1));
            map2.put(T, (long) x2+T*v2);
        }
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map1.get(42));
        System.out.println(map2.get(42));
        for(int i = 1; i<=map1.size(); i++){
            long aa = map1.get(i);
            long ab = map2.get(i);
            if(aa==ab){
                return true;
            }
        }
        return false;
    }
}
