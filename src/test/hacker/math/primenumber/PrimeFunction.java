package test.hacker.math.primenumber;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimeFunction {
    public  static LongStream generate(long limit){
        return LongStream.range(2, Long.MAX_VALUE).filter(PrimeFunction::isPrime).limit(limit);
    }

    private static boolean isPrime(long i) {
        return IntStream.rangeClosed(2,(int) Math.sqrt(i)).noneMatch(a->i%a==0);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n = sc.nextInt();
        generate(n);
        if(isPrime(n)){
            System.out.println(n);
        }
    }
}
