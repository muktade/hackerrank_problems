package test.hacker.basicjava.cal;

public class MyCalculator {
    String power(int a, int b) throws Exception {
        int aa = 1;

        if ((a > 0 && b > 0)||(a==0 && b>0)||(a>0&&b==0)) {
            for (int i = 1; i <= b; i++) {
                aa = aa * a;
            }
            return "" + aa;
        } else if (a == 0 && b == 0) {
            throw new Exception("java.lang.Exception: n and p should not be zero.");
        } else if (a<0 || b<0) {
            throw new Exception("n or p should not be negative.");
        }else {
            return null;

        }

    }
}
