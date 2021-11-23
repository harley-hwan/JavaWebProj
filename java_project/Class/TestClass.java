package Class;

public class TestClass {

	// 생성자라는 게 존재
	// 변수
	// 메소드
	// 클래스에는 위와 같이 존재한다.
	
	// 멤버 변수(인스턴스 변수, 클래스 변수)는
	// 보통 접근 제어자를 private으로 선언한다.
	private int a;		// 값을 초기화 하지 않으면 0으로 초기화
	private String b;	// 값을 초기화 하지 않으면 null로 초기화

	// 변수는 그냥 데이터
	// 메소드는 동작 또는 기능을 수행
	// 보통 접근 제어자(public, private...)를 private으로 선언한다
	// public 접근제어, void(int, String, ...) 반환값의 타입, m1 메소드 이름, () 매개변수(파라미터) 넣는곳
	// hello world를 출력하는 기능을 정의하라
	public void m1() {
		System.out.println("hello world");
	}
	
	// 이름이 들어오면 안녕하세요 이름 입니다를 출력 하는 기능을 정의해라
	public void m2() {
		System.out.println("안녕하세요 이름 입니다");
	}
	
	
}
