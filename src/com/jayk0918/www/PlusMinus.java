package com.jayk0918.www;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;


class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int n = arr.size();
        int plusCount = 0;
        int minusCount = 0;
        int zeroCount = 0;
        
        
        for(int i=0; i<arr.size(); i++) {
            int test = arr.get(i);
            if(test == 0) {
                zeroCount++;
            }else if(test > 0) {
                plusCount++;
            }else {
                minusCount++;
            }
        }
        
        double plusResult;
        double minusResult;
        double zeroResult;
        
        plusResult = (double) plusCount / (double) n;
        minusResult = (double) minusCount / (double)n;
        zeroResult = (double) zeroCount / (double)n;
        
        String result1 = String.format("%.6f", plusResult);
        String result2 = String.format("%.6f", minusResult);
        String result3 = String.format("%.6f", zeroResult);
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
