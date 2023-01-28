package test.hacker;

import java.util.ArrayList;

public class StringCompare {

        public static void main(String[] args) {
            String  a = "wellcometojava";
            int k =3;
            String sm ="", lrg="";
            ArrayList<String > an = new ArrayList<>();
            for (int i = 0; i<a.length()-k+1; i++) {
                String n = a.substring(i, k + i);
                if (sm == "" && lrg == "") {
                    sm = n;
                    lrg = n;
                } else {
                    if (sm.compareTo(n) > 0) {
                        sm = n;
                    }
                    if (lrg.compareTo(n) < 0) {
                        lrg = n;
                    }
                    System.out.println(n);
                    an.add(n);
                }
            }
            System.out.println(an);
            System.out.println("sall "+sm+" lrg "+lrg);


        }

}
