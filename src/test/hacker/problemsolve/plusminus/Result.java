package test.hacker.problemsolve.plusminus;

import java.util.List;

public class Result {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double p=0, n=0,z=0;
        for (Integer a : arr) {
            if(a>0){
                p++;
            }else if(a<0){
                n++;
            }else if(a==0){
                z++;
            }
        }
        System.out.println(p/arr.size());
        System.out.println(n/arr.size());
        System.out.println(z/arr.size());
    }
}
