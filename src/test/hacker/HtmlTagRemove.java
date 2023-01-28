package test.hacker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlTagRemove {
    public static void main(String[] args) {

//
        String ht = "<h1>Nayeem loves counseling</h1>";
        boolean b = false;
        String ou = "";
        char fs='\u0000', ls='\u0000';
        for (int i = 0; i < ht.length(); i++) {
            if (!b && ht.charAt(i) == '<') {
                if(ht.charAt(i+1)=='/'){
                    ls=ht.charAt(i+2);
                }else {
                    fs=ht.charAt(i+1);
                }

//                b = true;
//                continue;

            }
            if(ls==fs){
                b=true;
                continue;
            }else {

            }
            if(b&&ht.charAt(i)=='>'){
                b=false;
                continue;
            }
            if(!b){
                ou=ou+ht.charAt(i);
            }
        }
        System.out.println(ou);


    }
}
