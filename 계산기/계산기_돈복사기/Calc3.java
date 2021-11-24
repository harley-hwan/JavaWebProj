package 계산기_돈복사기;

import java.util.Scanner;

import dto.NumDto;
import dto.OpDto;

/*
 * 계산기 프로젝트 V3
 */

public class Calc3 {
	NumDto nDto = new NumDto();
	OpDto oDto = new OpDto();
	
	public void inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력: ");
//		num1 = sc.nextInt());
		nDto.setNum1(sc.nextInt());
		System.out.print("두번째 수를 입력: ");
		nDto.setNum2(sc.nextInt());
		
	}
	
	public void inputOp() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자 입력: ");
		oDto.setOp(sc.next());
	}
	
	public void printResult() {
		System.out.print(nDto.getNum1() + " ");
		System.out.print(oDto.getOp() + " ");
		System.out.print(nDto.getNum2() + " = ");
		if (oDto.getOp().equals("+")) {
			System.out.println(plus());
		} else if (oDto.getOp().equals("-")) {
			System.out.println(minus());
		}
	}
	
	public int plus() {
		return nDto.getNum1() + nDto.getNum2();
	}
	
	public int minus() {
		return nDto.getNum1() - nDto.getNum2();
	}
	
}

//public class Calc3 extends NumDto{
//	// 변수 선언
//	
//	// 메소드 만들기
//	public void test() {
//		// 숫자 하나를 넣는다.
//		setNum1(1);
//		int num = getNum1();
//	}
//
//}
