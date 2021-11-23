package bridge;

/*
 * Bridge 클래스 사용법
 * Bridge 클래스 객체 생성시 꼭 다리 건너는 개수를 넣어야함.
 * new Bridge (다리 갯수)
 */

public class MainClass {

	public static void main(String[] args) {
		// 다리건너기 게임 클래스의 객체를 생성
		Bridge bridge = new Bridge();
		
		// 다리 스텝 설정
//		bridge.step = 18;
		bridge.setStep(10);
		bridge.setup();	
		
		// 플레이어 수
		bridge.setPlayer(5);
//		bridge.player = 10;
//		bridge.setup();			// 다리를 만들기
		
		
		// 다리를 만들기
		bridge.play();			// 게임 실행
		bridge.successMsg();	// 결과 확인

	}

}
