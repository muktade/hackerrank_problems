package test.hacker.problemsolve.gradingstudents;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> grades= new ArrayList<>();
        int n = sc.nextInt();
        for (int i=0; i<n;i++){
            grades.add(sc.nextInt());
        }
        sc.close();
        System.out.println(Solution.gradingStudents(grades));
    }
}
