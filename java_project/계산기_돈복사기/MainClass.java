package 계산기_돈복사기;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		String scan = "스캐너";
		System.out.println("hello world");
		// 사용자로부터 입력을 받기 위해 사용하는 클래스 선언
		//Scanner sc = new Scanner(Sustem.in);
		// 숫자를 입력 받기
		// sc.nextInt();
//		MyScanner mc = new MyScanner();
//		
//		System.out.println(scan);
//		mc.nextInt();
//		
//		scan = "스캐너 장비";
//		System.out.println(scan);
//		mc.nextInt();
//		
//		scan = "태블릿";
//		System.out.println(scan);
//		mc.nextInt();
		
		MyScanner mc = new MyScanner("키보드");
//		mc.b = "스캐너";	// 좋지 않은 방법 (public 변수)
		mc.setB(scan);
		mc.nextInt();
		
		int aa = mc.getA();		// mc
		System.out.println("getA의 값은: " + aa);
		mc.setA(100);
		aa = mc.getA();
		System.out.println("getA의 값은: " + aa);
//-------------------------------------------------------
		
		MyScanner mc2 = new MyScanner("스캐너장비");
		mc2.nextInt();
		aa = mc2.getA();		// mc2
		System.out.println("getA의 값은: " + aa);
		
		
		MyScanner mc3 = new MyScanner("태블릿");
		mc3.nextInt();
		
		

	}

}
