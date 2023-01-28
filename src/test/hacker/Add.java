package test.hacker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Add{
    String ans="";
    int sum=0;
    public void add(int a, int b, int... c){
        int[] c1 = Arrays.stream(c).toArray();
        switch (c.length){
            case 0:
                ans = (a) +"+"+ (b);
                sum = (a+b);
                System.out.println(ans+"=" +sum);
                break;
            case 1:
                System.out.println(this.addMath(String.valueOf(c1[0]),c1[0]));
                break;
            case 3:
                this.addMath(String.valueOf(c1[1]), c1[1]);
                System.out.println(this.addMath(String.valueOf(c1[2]), c1[2]));
                break;
            case 4:
                System.out.println(this.addMath(String.valueOf(c1[3]),c1[3]));
                break;
        }
    }
    String addMath(String s, int sum){
        this.ans = this.ans+"+"+s;
        this.sum = this.sum+sum;
        return this.ans +"="+this.sum;
    }
}



class Solution {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }




}

