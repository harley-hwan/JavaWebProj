package 계산기_돈복사기;

import java.util.Random;

/*
 * 사칙 연산 클래스
 */
public class Calc {
	// 더하기 메소드
	public int plus(int num1, int num2) {
		return num1 + num2;
	}
	
	// 빼기 메소드
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	// 곱하기 메소드
	public int mult(int num1, int num2) {
		return num1 * num2;
	}
	
	// 나누기 메소드
	public double div(int num1, int num2) {
		return (double)(num1 / num2);
	}
	
	// 돈 복사기
	public int pung(int m) {
		Random random = new Random();
		
		double dVal = Math.random();
		System.out.println("dVal = " + dVal );
		int plusMinus = random.nextInt(2);
		
		int iVal = (int)(dVal* (m/1000));
		
//		System.out.println("m = " + m);
		if (plusMinus == 1) 	return m + (iVal*1000);
		else 		return m - (iVal*1000);
	}
}
