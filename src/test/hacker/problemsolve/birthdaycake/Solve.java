package test.hacker.problemsolve.birthdaycake;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solve {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        int res=0;
        for (Integer a: candles) {
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else {
                map.put(a,1);
            }
        }
        for(Integer b : map.values()){
            if(res<b){
                res=b;
            }
        }
        return res;
    }
}
