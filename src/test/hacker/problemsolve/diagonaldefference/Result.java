package test.hacker.problemsolve.diagonaldefference;

import java.util.List;

class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int i =0, sum1 =0, sum2=0;

        for (List<Integer> list : arr) {
            sum1 = sum1+list.get(i);
            i++;
        }
        for(List<Integer> list: arr){
            i--;
            sum2= sum2+list.get(i);

        }
        return (sum1-sum2>0)?sum1-sum2:sum2-sum1;
    }

}