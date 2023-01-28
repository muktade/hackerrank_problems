package test.hacker.math.factorial;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner bufferedReader = new Scanner((System.in));

        int t = bufferedReader.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int n = bufferedReader.nextInt();
            int result = Result.maximumDraws(n);
            System.out.println(result);

        }

        bufferedReader.close();

    }
}

