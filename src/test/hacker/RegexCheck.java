package test.hacker;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexCheck {
    public static void main(String[] args) {
//        PatternSyntaxException ex = null;
//        String re = "([A-Z])(.+)";
//        try {
//            Pattern.compile(re);
//        } catch (PatternSyntaxException e) {
//            ex = e;
//        }
//        if(ex!=null){
//            System.out.println(ex.getMessage());
//        }else {
//            System.out.println("ok");
//        }

        ///////////
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            PatternSyntaxException ex= null;
            String pattern = in.nextLine();
            //Write your code
            try{
                Pattern.compile(pattern);
            }catch(PatternSyntaxException e){
                ex=e;
            }
            if(ex!=null){
                System.out.println(ex.getMessage());
                System.out.println("Invalid");
            }else{
                System.out.println("Valid");
            }
            testCases--;
        }
    }
}
