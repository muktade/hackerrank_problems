package test.hacker.impliment;

public class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n) {
        int ds = n;
        for(int i =1; i<=n/2; i++){
            if(n%i==0){
                ds= ds+i;
            }
        }
        return ds;
    }
}
