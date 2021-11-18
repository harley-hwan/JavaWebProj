package hello2;

import java.util.Random;
import java.util.Scanner;

public class mosol {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int a;
		String b = "쿠로미";
		String c = "마이멜로디";
		a = 10;
		
		// 고백 게임 참가자 이름을 입력 받기
		System.out.println("고백 게임 시작");
		// 이름을 입력하세요를 출력하고 이름 입력 받기(문자열)
		System.out.println("이름을 입력하세요");
		System.out.print("입력: ");
		b = sc.next();
		// 나이를 입력하세요를 출력하고 나이 입력 받기(숫자)
		System.out.println("나이를 입력하세요");
		System.out.print("입력: ");
		a = sc.nextInt();

		System.out.println("안녕하세요");
		System.out.println("저는" + b + "입니다");
		System.out.println("잘 부탁합니다");
		System.out.println(b + "의 친구는" + c + "입니다");
		System.out.print(c + "와 저는");
		System.out.print(a);
		System.out.println("살 입니다");

		// 사귈 수 있는 확률높은 고백 횟수
		// 1번 후보는 2번
		// 2번 후보는 3번
		// 3번 후보는 1번
		// 4번 후보는 5번
		// 5번 후보는 10번

		// 시도 횟수
		int tr;
		System.out.println();
		
		// 아래에 있는 숫자들은 고정이 되어 있다
		// 게임이 시작 될 때 마다 자동으로 무작위로 숫자들이 바꼈으면 좋겠다
		// 해결 해보자
		Random rd = new Random();

		// int[] odds = { 2, 3, 1, 5, 10 };
		int[] odds = new int[5];
//		odds[0] = rd.nextInt(10)+1; // 1~10번까지 숫자가 무작위로 들어가게 해보자
//		odds[1] = rd.nextInt(10)+1;
//		odds[2] = rd.nextInt(10)+1;
//		odds[3] = rd.nextInt(10)+1;
//		odds[4] = rd.nextInt(10)+1;
		for (int i=0; i<odds.length; i++) {
			odds[i] = rd.nextInt(10)+1;
//			System.out.println(odds[i]);  // 정답 가리기
		}  // for
		//  ... 총 5개의 배열 안에 각각 넣어 보자


		for (int j=0; j < odds.length; j++) {
			System.out.println("================================");
			System.out.print(j + 1 + "번 후보 고백 시도횟수를 맞춰 보세요: ");
			tr = sc.nextInt();
			for (int i = 1; i <= odds[j]; i++) {
				System.out.println(j + 1 + "번 후보는" + i + "회 고백을 시도했다");
				// if 고백 확률이 높을 때 고백하면
				if (i == odds[j]) {
					System.out.println("모솔 탈출");
				} else {
					System.out.println("솔로입니다");
				}
			}
			// 만약에 사용자 입력한 고백시도 횟수와 각 사람의 가진 숫자와 비교해서
			// 맞으면 맞다 틀리면 틀렸다
			if (tr == odds[j]) {
				System.out.println("당신 나와 함께 갑시다~");
			} else {
				System.out.println("나와 당신은 맞지 않네요~ 담에봐요");
			}
		}
		System.out.println("고백성공");
	}

}