package test.hacker.problemsolve.dateformateconvert;

import java.io.*;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner sc= new Scanner(System.in);

        String s = sc.nextLine();

        String result = Solution.timeConversion(s);
        System.out.println(result);
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
