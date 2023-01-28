package test.hacker.exseptio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExHandel {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            myMath(a, b);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }

    public static void myMath(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}
