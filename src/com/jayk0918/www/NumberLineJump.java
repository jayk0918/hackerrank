package com.jayk0918.www;

/*
 * Example
	x1 = 2 (1번째 캥커루 출발지점)
	v1 = 1 (1번째 캥커루의 점프력)
	x2 = 1 (2번째 캥커루 출발지점)
	v2 = 2 (2번째 캥커루의 점프력)
	
	After one jump, they are both at x=3, (x1 + v1 = 2 + 1) / (x2 + v2 = 1 + 2)
	so the answer is YES.
	
 * 0 3 4 2
 * 
 * 
 * 
 * */

public class NumberLineJump {
	public static void main(String[] args) {
		int position = Math.abs(x1 - x2);
        int velocity = Math.abs(v1 - v2);
        
        if (velocity == 0) {
            if (velocity == 0) {
                return "YES";
            } else {
                return "NO";
            }
        } else {
            if (position % velocity == 0) {
                return "YES";
            } else {
                return "NO";
            }
        }
		
	}
}
