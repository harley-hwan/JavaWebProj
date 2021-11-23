package hello2method;

public class MyClass {
	// 메소드를 만들어보자.
	boolean flag = false;
	
	public void m1() {
		int a = 0;
		if (a < 10) {
			flag = true;
		}
	}
	
	public void m2() {
		if (flag) {
			System.out.println("성공");
		}
	}
	
	// 메소드를 만들어 보자
	public boolean m3() {
		boolean flag2 = false;
		int a = 0;
		if (a < 10) {
			flag2 = true;
		}
		
		return flag2;		
	}
	
	public void m4() {
//		boolean flag2 = m3();
//		if (flag2) {
			
		if (m3()) {
			System.out.println("성공");
		}
	}
}
