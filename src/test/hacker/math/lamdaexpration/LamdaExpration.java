package test.hacker.math.lamdaexpration;

public class LamdaExpration {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return (int a) -> a % 2 == 0 ? false : true;
    }

    public PerformOperation isPrime() {
        var lambdaContext = new Object() {
            int i = 0;
        };
        return (int a)->{
            int an =a;
            while (a-->0){
                if(an%(a+1)==0){
                    lambdaContext.i = lambdaContext.i +1;
                }else {
                    continue;
                }
            }
            return lambdaContext.i==2?true:false;
        };
    }

    public PerformOperation isPalindrome() {
        return (int a)-> {
            String ma= "";
            String aa = String.valueOf(a);
            int i = aa.length();
            while (i-->0){
                ma = ma+aa.charAt(i);
            }return aa.matches(ma)?true:false;
        };
    }

    // Write your code here
}
