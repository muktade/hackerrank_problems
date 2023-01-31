package test.hacker.problemsolve.stairase;

public class Solve {
    public static void staircase(int n) {
        // Write your code here
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=1; j--){
                System.out.print(" ");
            }
            for (int k= i; k>0 ; k--){
                System.out.print("#");
            }
            System.out.println();
        }

    }

}
