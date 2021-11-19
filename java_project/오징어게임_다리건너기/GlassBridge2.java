package 오징어게임_다리건너기;

import java.util.Random;
import java.util.Scanner;

public class GlassBridge2 {

	
	public static void main(String[] args) {
		// 다리건너기 게임 생존자 수 카운트
		Random randNum = new Random();
		Scanner sc = new Scanner(System.in);
		
		int stepGlass = 10;		// 징검다리
		int countDead = 0;		// 생존자 수
		int people = 10;		// 참가자 수
		int step = 0;			// 내 직전의 사람이 건넌 다리 수
		
		System.out.println("이번 게임은 다리 건너기 게임입니다.");
		System.out.println("여러분은 총 10개의 징검다리를 건너시면 됩니다.");
		
		for (int i = 0; i < people; i++) {
			int ans = randNum.nextInt(2);
			int choice = randNum.nextInt(2);
			if (choice == 0) {
				System.out.println("왼쪽 징검다리를 선택합니다.");
				if (choice == ans) {
					System.out.println("생존했습니다.");
				}
				else {
					System.out.println("사망했습니다.");
					countDead++;
				}
			}
			else {
				System.out.println("오른쪽 징검다리를 선택합니다.");
				if (choice == ans) {
					System.out.println("생존했습니다.");
				}
				else {
					System.out.println("사망했습니다.");
					countDead++;
				}
			}
			step++; // 앞 사람이 사망하든 생존하든 징검다리를 건넌건 동일하기 때문에 한 사람의 턴이 지날 때마다 step을 증가
			
			System.out.println(step + "번째 다리를 건넜습니다.\n");
			
			if (step == stepGlass) break;	
		}
		
		System.out.println("이번 게임에서는 생존한 참가자는 " + (people - countDead) + "명입니다.");
	}
}
