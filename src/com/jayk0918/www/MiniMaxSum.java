package com.jayk0918.www;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
/*
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example

The minimum sum is  and the maximum sum is . The function prints

16 24
Function Description

Complete the miniMaxSum function in the editor below.

miniMaxSum has the following parameter(s):

arr: an array of  integers
Print

Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

Input Format

A single line of five space-separated integers.

Constraints


Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

The numbers are , , , , and . Calculate the following sums using four of the five integers:

Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Hints: Beware of integer overflow! Use 64-bit Integer.*/


//class Result {
    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

//    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here

//    }

//}


// integer 64bit 초과 시 대응책 필요
public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        
        int[] inputArray = new int[arr.size()];
        
        for(int i=0; i<arr.size(); i++) {
        	inputArray[i] = arr.get(i);
        }
        
        Arrays.sort(inputArray);
        
        int min = 0;
        int max = 0;
        
        for(int i=0; i<inputArray.length-1; i++) {
        	min += inputArray[i];
        }
        
        for(int i=1; i<inputArray.length; i++) {
        	max += inputArray[i];
        }
        
        System.out.println(min + " " + max);
        

        bufferedReader.close();
    }

}
