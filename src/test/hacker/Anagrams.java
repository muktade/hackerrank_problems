package test.hacker;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        String a = "Abul";
        String b = "BulA";
        a=a.toLowerCase();
        b=b.toLowerCase();
        Map<Character , Integer> aa= new HashMap<>();
        Map<Character , Integer> bb = new HashMap<>();
        if(a.length()==b.length()){

            for (int i = 0; i<a.length(); i++){
                char t=a.charAt(i);
                if(!aa.containsKey(t)){
                    aa.put(t,1);
                }else {
                    aa.put(t, aa.get(t)+1);
                }
                char tt=b.charAt(i);
                if(!bb.containsKey(tt)){
                    bb.put(tt,1);
                }else {
                    bb.put(tt, bb.get(tt)+1);
                }
            }

        }
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(aa.equals(bb));
    }
}
