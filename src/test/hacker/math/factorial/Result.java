package test.hacker.math.factorial;

class Result {
    public static int maximumDraws(int n) {
        // Write your code here
        int a=fact(n*2);
        int b=fact(n);
        System.out.println(a+" "+b);
        return a/b;
    }
    public static int fact(int n){
        int a=1;
        if(n==0){
            a=a;
        }
        else{
            if(n>1){
                for(int i=n; i>1; i--){
                    a= a*i;
                }
            }
        }
        return a;
    }
}
