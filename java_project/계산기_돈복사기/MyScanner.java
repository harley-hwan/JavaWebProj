package 계산기_돈복사기;

public class MyScanner {	
	// 변수
	private int a;		// 숫자 변수
	private String b = "키보드"; 	// 문자열 변수

	// 생성자
	public MyScanner(String b) {
		this.b= b; 
	}
	
	// 메소드 만들자
	public void setA(int a) {
		//int a = 100;
		this.a = a;
	}
	
	// 값을 반환하는 메소드
	public int getA() {
		return this.a;
	}
	
	// b라는 멤버 변수를 메소드를 활용해서 변경하자
	public void setB(String b) {
		this.b = b;
	}
	
	// 메소드
	public void nextInt() {
		// 숫자를 입력받을 수 있게 뭔가가 만들어져 있겠지
		System.out.print(b + " 로 부터 ");
		System.out.println("숫자를 입력 받기");
	}
}
