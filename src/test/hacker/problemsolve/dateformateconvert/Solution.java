package test.hacker.problemsolve.dateformateconvert;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static String timeConversion(String s) {
        // Write your code here
        DateFormat output=new SimpleDateFormat( "HH:mm:ss");
        DateFormat input=new SimpleDateFormat( "hh:mm:ssaa");
        String result=null;
        try {
            Date date = input.parse(s);
            result = output.format(date);
        }catch (ParseException p){
            p.printStackTrace();
        }

return result;
    }
}
