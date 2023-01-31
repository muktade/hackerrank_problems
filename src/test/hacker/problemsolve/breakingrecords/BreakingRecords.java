package test.hacker.problemsolve.breakingrecords;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BreakingRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> grades= new ArrayList<>();
        int n = sc.nextInt();
        for (int i=0; i<n;i++){
            grades.add(sc.nextInt());
        }
        sc.close();
        System.out.println(Solution.breakingRecords(grades));
    }
}
