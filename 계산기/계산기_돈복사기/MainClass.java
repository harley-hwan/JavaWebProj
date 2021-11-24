package 계산기_돈복사기;

import com.hsj.util.Util;

public class MainClass {

	public static void main(String[] args) {
		// 계산기를 만들어 보자
		System.out.println("계산기 프로그램");
		System.out.println("오늘날짜");
		System.out.println(Util.getCurrentDate("yyyyMMdd"));
		// 두개의 정수 입력받기

		// 계산기 클래스를 선언(객체생성, 인스턴스 생성)
//		Calc2 cc2 = new Calc2();
//		do {
//			// 두개의 숫자를 입력하시오
//			System.out.println("두개의 숫자를 입력하시오.");
//			cc2.inputNumber();
//			// 연산자를 입력하시오
//			System.out.println("연산자를 입력하시오.");
//			cc2.inputOper();
//		} while (!cc2.checkNum()); // 여기에서 수를 체크
		// 수 체크2
//		cc2.checkNum();
		// 결과
//		cc2.printResult();
		
		Calc3 cc3 = new Calc3();
		// 수를 입력
		cc3.inputNum();
		// 연산자를 입력 받고
		cc3.inputOp();
		// 출력
		cc3.printResult();

	}

}
		// 더하기
		
		/*
		int num1 = 10;
		int num2 = 2;
		
		int res_int = 0;
		double res_double = 0;
		
		Calc cc = new Calc();
		res_int = cc.plus(num1, num2);
		System.out.println("두수의 더하기: " + res_int);
		
		// 빼기
		res_int = cc.sub(num1, num2);
		System.out.println("두수의 빼기: " + res_int);
		
		// 곱하기
		res_int= cc.mult(num1, num2);
		System.out.println("두수의 곱하기: " + res_int);
		
		// 나누기
		res_double = cc.div(num1, num2);
		System.out.println("두수의 나누기: " + res_double);
		
		Test test = new Test();
		test.method();
		
		int myMoney = 5000;
		System.out.println("길을 가다가 돈 복사기를 주웠다.");
		System.out.println("내 돈 " + myMoney + "원을 넣어보자.");
		
		
		// 돈 복사기 호출
		int myMoney2 = cc.pung(myMoney);
		if (myMoney > myMoney2) {
			System.out.println(myMoney + "원이 " + myMoney2 + "원이 되었다.!!!");
			System.out.println("젠장!!");
		}
		else {
			System.out.println(myMoney + "원이 " + myMoney2 + "원이 되었다.!!!");
			System.out.println("아싸!!");
		}	
	}
}
*/