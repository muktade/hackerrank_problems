package test.hacker;

import java.util.*;

public class DequeJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int size=0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
        }
        int s = deque.size();
        ArrayList test = new ArrayList(deque);
        ArrayList tst = test;
        for (int i = 0; i < s - m + 1; i++) {
            List<Integer> sblist= tst.subList(0,m);
            Set<Integer> list = new HashSet<>(sblist);
            if(size< list.size()){
                size= list.size();
            }
            test.remove(0);
            tst=test;
            list.clear();
        }
        System.out.println(size);
    }
}
