package bridge;

//import java.util.ArrayList;
//import java.util.Random;
import java.util.*;

public class Bridge {
	public ArrayList<Integer> bList;
	private Scanner sc;
	
	private int step;
	// 살아있는 플레이어 수 설정 변수
	private int player;
	
	// 끝까지 성공이 아닌지를 체크하기 위한 임시 변수
	private boolean isSuccess = true;
	
	// 생성자가 눈에 안 보이지만 생성자라는게 존재
	public Bridge() {
//		setup();
	}
	
	public Bridge(int step) {
		System.out.println("생성자가 setup()을 호출");
		this.step = step;
		setup();
	}
	
//	public Bridge(int step, int player) {
//		System.out.println("생성자가 setup()을 호출");
//		this.step = step;
//		this.player = player;
//		setup();
//	}
	
	// 메소드
	// 다리를 건너야될 스텝의 값을 셋팅하는 메소드
	public void setStep(int step) {
		this.step = step;
	}
	
	// 살아있는 플레이어 수의 값을 세팅하는 메소드
	public void setPlayer(int player) {
		this.player = player;
	}
	
	// 다리 만들기
	public void setup() {
		bList = new ArrayList<Integer>();
		sc = new Scanner(System.in);
		Random rnd = new Random();
		
			
	}
	
	// 게임 플레이
	public void play() {
		
	}
	
	// 완료 메세지
	public void successMsg() {
		
	}
	
}
