package hello2method;
import java.util.*;
public class TreeClass {

	public void hello(String name) {
		// TODO Auto-generated method stub
		// 안녕하세요
		// 나는 누구입니다
		// 잘 부탁드립니다
		// String name = "퉁퉁이";	// 문자열 변수 선언
		int tree = 5;
		
		System.out.println("안녕하세요");
		System.out.println("나는 " + name + " 입니다");
		System.out.println(name + " 잘 부탁드립니다.");
		System.out.println(name + " 인사 드립니다.");
		System.out.println(name + " 집에 갑니다.");
		System.out.println(name + "가 집에 가다가 숲을 만났네");
		System.out.printf("나무가 ");
		System.out.print(tree);
		System.out.println(" 그루 있다\n");
	}
	
	
	public void play(int tree) {
		
		// 도끼질 횟수
		
		// 1번 나무는 2번
		// 2번 나무는 3번
		// 3번 나무는 1번
		// 4번 나무는 5번
		// 5번 나무는 10번
		
		//int one = 2, two = 3, three = 1, four = 5, five = 10;
		
		
		ArrayList<Integer> bList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for (int i = 0; i < tree; i++) {
			bList.add(rnd.nextInt(10) + 1);
		}
				
		System.out.println("bList >> " + bList);
		System.out.println();
		
		// int [] count = {2, 3, 1, 5, 10};
		int treeNum = 1;		// 나무 번호
		int hit;			// 도끼질 횟수
		
		for (int cnt : bList) {
			hit = 1;	// 도끼질 횟수 초기화
			System.out.println(treeNum + "번 나무를 쓰러트려보자!");
			
			while(true) {	// 
				System.out.println("나무를 도끼로 " + hit + "번 찍었다.");
				
				if (hit == cnt) {		// 1번 나무를 2번 치면
					System.out.println(treeNum + "번 나무가 쓰러졌다.");
					break;
				}
				hit++;	// 도끼질 횟수 1 증가
			}
			
			treeNum++;			
			System.out.println();
		}
	}

	public void successMsg() {	// 성공 메세지를 보여주는 메소드
		System.out.println("나무 베기를 성공했다.");
	}

}
