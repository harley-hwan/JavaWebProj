package hello2;

import java.util.*;

public class GlassBridge {

	public static void main(String[] args) {
		// 오징어 게임 - 다리 건너기

		Random randNum = new Random();
		Scanner sc = new Scanner(System.in);

		int step = 0;
		int steps = 16;
		int choose; // 내 선택
		int ans; // 유리 징검다리 정답
		
		System.out.println("이번 게임은 징검다리 건너기입니다.");
		System.out.println("여러분은 15개의 징검다리를 건너시면 됩니다.\n");
		
		while (true) {
			if (randNum.nextInt(2) == 0) {
				ans = 1; // left (왼쪽 징검다리)
			} else {
				ans = 2; // right (오른쪽 징검다리)
			}
			
			while (true) {
				step++;
				
				System.out.println("왼쪽(1) or 오른쪽(2) ?");
				choose = sc.nextInt();
				if (choose == 1 || choose == 2)
					break;

				System.out.println("1 혹은 2 둘 중 하나만 고르시오.");
			}

			if (ans != choose) {
				System.out.println("사망!");
				break;
			}
			System.out.println(step + "번째 징검다리를 통과하였습니다.");
			if (step == steps) {
				System.out.println("당신은 이번 게임에서 생존하였습니다.");
				break;
			}
		}	
	}
}
