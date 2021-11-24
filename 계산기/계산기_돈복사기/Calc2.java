package 계산기_돈복사기;

import java.util.Scanner;

public class Calc2 {

	// 두수의 변수를 선언(아래 메소드에 다 접근 가능 하게)
	private int num1;
	private int num2;
	private String op; // 연산자 변수

	// 두개의 수를 입력
	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		this.num1 = sc.nextInt();
		System.out.print("입력: ");
		this.num2 = sc.nextInt();
	}

	// 연산자를 입력
	public void inputOper() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		this.op = sc.next();
	}

	// 숫자를 체크 기능
	public boolean checkNum() {
		// 리턴값
		boolean isCheck = false;
		// 빼기할 때 체크(첫번째 수가 두번째 수보다 커야)
		// 나누기할 때 체크(첫번째 수가 두번째 수보다 커야 그리고 두번째 수가 0이 아니어야 된다)
		if (this.op.equals("-")) {
			if (this.num1 < this.num2) {
				System.out.println("첫번째 수가 두번째 수보다 커야합니다! 다시 입력해주세요!");
			} else {
				isCheck = true;
			}
		}
		// 나누기 할때(첫번째 수가 두번째 수보다 커야한다.나누는 숫자가 0이 아니어야 한다)
		else if (this.op.equals("/")) {
			if (this.num1 < this.num2) {// 두번째숫자가 0일때 더 클수가없다.
				System.out.println("첫번쨰 수가 두번째 수보다 커야합니다! 다시 입력해주세요!");
			} else if (this.num2 == 0) {
				System.out.println("두번째 수가 0이여서는 안되요! 다시 입력해주세요!");
			} else {
				isCheck = true;
			}
		} else {
			isCheck = true;
		}
		return isCheck;
	}

	// 결과를 출력해주는 기능
	public void printResult() {
		if (this.op.equals("+")) {
			System.out.println(this.num1 + " " + this.op + " " + this.num2 + " = " + plus());
		} else if (this.op.equals("-")) {
			System.out.println(this.num1 + " " + this.op + " " + this.num2 + " = " + minus());
		} else if (this.op.equals("*")) {
			System.out.println(this.num1 + " " + this.op + " " + this.num2 + " = " + mul());
		} else if (this.op.equals("/")) {
			System.out.println(this.num1 + " " + this.op + " " + this.num2 + " = " + div());
		} else {
			System.out.println("잘못된 연산자");
		}
	}

	// 더하기
	public int plus() {
		return this.num1 + this.num2;
	}

	// 빼기
	public int minus() {
		return this.num1 - this.num2;
	}

	// 곱하기
	public int mul() {
		return this.num1 * this.num2;
	}

	// 나누기
	public int div() {
		return this.num1 / this.num2;
	}

}