package 계산기_돈복사기;

public class MainClass {

	public static void main(String[] args) {
		// 계산기 만들기
		// 더하기
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
