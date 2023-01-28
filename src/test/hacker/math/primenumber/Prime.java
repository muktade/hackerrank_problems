package test.hacker.math.primenumber;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int upper=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int n=1; n<=upper; n++){
            int c = 0;
            for (int i = 1; i <= n; i++){
                if (n % i == 0)
                    c++;
            }
            if (c == 2){
                a.add(n);
            }
            else
                continue;
        }
        System.out.println(a);
    }
}
