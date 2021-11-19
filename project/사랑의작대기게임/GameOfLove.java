package 사랑의작대기게임;


import java.util.Random;
import java.util.Scanner;

public class GameOfLove {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		
		// 고백 게임 참가자 이름을 입력 받기
		System.out.println("5:5 사랑의 작대기 게임 시작");
		// 이름을 입력하세요를 출력하고 이름 입력 받기(문자열)
		System.out.println("\n이름을 입력하세요");
		System.out.print("입력: ");
		name = sc.next();
		// 나이를 입력하세요를 출력하고 나이 입력 받기(숫자)
		System.out.println("\n나이를 입력하세요");
		System.out.print("입력: ");
		age = sc.nextInt();

		System.out.println("\n안녕하세요");
		System.out.println("저는 " + age + "살인 " + name + "입니다");	

		// 남자 몇 번
		int myNum;
		System.out.println("\n당신은 몇 번 남자인가요?");
		System.out.print("입력 (1~5): ");
		myNum = sc.nextInt();
		
		Random randNum = new Random();

		int[] girls = new int[5];
		
		int count = 0;
		
		for (int i = 0; i < girls.length; i++) {
			girls[i] = randNum.nextInt(5) + 1;
			if (girls[i] == myNum) count++;
		}  
		
		System.out.println("당신을 지목한 여성들은 " + count + "명입니다.");
		
		if (count > 0) {
			System.out.println("누군가가 당신을 좋아합니다. 상대방을 찾아보세요.");
		} else {
			System.out.println("성형외과로 가는 것을 추천합니다.");
		}
	}
		
}