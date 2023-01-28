package test.hacker.basicjava.primenumber;

public class Prime {
    void printPrime(int n1) {
        if (n1 > 1) {
            if (n1 == 2) {
                System.out.print(n1 + " ");
            } else if (test(n1)) {
                System.out.print(n1 + " ");
            }
        }
    }

    public void checkPrime(int n1, int... m) {
        if (m.length == 0) {
            printPrime(n1);
            System.out.println();
        } else {
            int s = m.length;
            printPrime(n1);
            for (int i = 0; i < s; i++) {
                printPrime(m[i]);
            }
            System.out.println();
        }
    }

    boolean test(int n1) {
        boolean a = true;
        for (int i = 2; i <= n1 / 2 + 1; i++) {
            if (n1 % i == 0) {
                a = false;
                break;
            }
        }
        return a;
    }
}
