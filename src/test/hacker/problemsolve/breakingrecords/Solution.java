package test.hacker.problemsolve.breakingrecords;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> list= new ArrayList<>();
        int min = scores.get(0), max = scores.get(0), minc=0,maxc=0;

        int i=1;
        while (i<scores.size()){
            int a= scores.get(i);
            i++;
            if(max<a){
                max=a;
                maxc++;
            } if (min>a){
                min=a;
                minc++;
            }
        }
        list.add(maxc);
        list.add(minc);
        return list;
    }
}
