package com.jayk0918.www;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example


Return '12:01:00'.


Return '00:01:00'.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

string s: a time in  hour format
Returns

string: the time in  hour format
Input Format

A single string  that represents a time in -hour clock format (i.e.:  or ).

Constraints

All input times are valid

Sample Input
07:05:45PM

Sample Output
19:05:45
 * 
 * */

// https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-week-day-one
class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    		
    		// am, pm 확인
            String index = s.substring(s.length()-2, s.length());
            
            // am, pm 제거
            s = removeIndex(s);
            
            // 시간 : integer형 변환
            int intHour = Integer.parseInt(s.substring(0, 2));
            
            // pm일 경우
            if(index.equals("PM")) {
            	// 12pm 이면 12시 출력
            	if(intHour == 12) {
                    return s;
                // 이외 시간은 +12를 더한 후 String 변환
            	}else {
                    intHour = intHour + 12;
                    String newHour = Integer.toString(intHour);
                    return hourChange(s, newHour);
            	}
            // am일 경우
            }else {
            	// am 12시면 00시로 변환
            	if(intHour == 12) {
            		String newHour = "00";
            		return hourChange(s, newHour);
            	}else {
            		return s;
            	}
            }
    }
    
    
    // am, pm 삭제
    public static String removeIndex(String target) {
    	StringBuilder sb = new StringBuilder(target);
    	
    	char removeTime = '\0';
        sb.setCharAt(target.length()-2, removeTime);
        sb.setCharAt(target.length()-1, removeTime);
    	
        target = sb.toString();
        
    	return target;
    }
    
    // 시간 변경 로직 (Stringbuilder)
    public static String hourChange(String target, String newHour) {
    	
    	StringBuilder sb = new StringBuilder(target);
    	
    	char i = newHour.charAt(0);
        char j = newHour.charAt(1);
        
        sb.setCharAt(0, i);
        sb.setCharAt(1, j);
        
        target = sb.toString();
        
        return target;
    }
    
}

public class TimeConversion {
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = bufferedReader.readLine();

	        String result = Result.timeConversion(s);
	        
	        bufferedWriter.write(result);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
}
