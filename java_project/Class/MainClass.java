package Class;
/*
 * 
 * 실행이 되는 클래스
 * TestClass 클래스는
 * m1() 메소드는 헬로월드 출력 기능
 * m2() 메소드는 안녕하세요 이름 입니다 출력 기능
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.m1();  // TestClass 안에 m1 메소드를 호출 (m1을 불러낸다)
		tc.m2();
		
	}	

}
