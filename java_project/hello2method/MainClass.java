package hello2method;

/*
 * TreeClass 의 사용법
 * hello() 메소드는 헬로 메세지 출력
 * play() 메소드는 나무베기 게임하기
 * successMsg() 성공 메세지 출력
 */

public class MainClass {

	public static void main(String[] args) {
		
		
		TreeClass tc = new TreeClass();
		
		tc.hello("진구");	// 헬로 월드 메세지
		
		// 나무베기를 실행 해보자.
		tc.play(5);
		
		tc.successMsg();
	}
} 

		
//		int treeNum;	// 나무 번호
//		int hit	// 도끼질 횟수
//		
//		for (treeNum = 1; treeNum <= tree; treeNum++) {
//			hit = 1;	// 도끼질 횟수 초기화
//			System.out.println(treeNum + "번 나무를 쓰러트려보자!");
//			
//			while(true) {	// 
//				System.out.println("나무를 도끼로 " + hit + "번 찍었다.");
//				
//				if (treeNum == 1 && hit == 2) {		// 1번 나무를 2번 치면
//					System.out.println(treeNum + "번 나무가 쓰러졌다.");
//					break;
//				}
//				else if (treeNum == 2 && hit == 3) {	// 2번 나무를 3번 치면
//					System.out.println(treeNum + "번 나무가 쓰러졌다.");
//					break;
//				}
//				else if (treeNum == 3 && hit == 1) {	// 2번 나무를 3번 치면
//					System.out.println(treeNum + "번 나무가 쓰러졌다.");
//					break;
//				}
//				else if (treeNum == 4 && hit == 5) {	// 2번 나무를 3번 치면
//					System.out.println(treeNum + "번 나무가 쓰러졌다.");
//					break;
//				}
//				else if (treeNum == 5 && hit == 10) { 	// 5번 나무를 10번 치면
//					System.out.println(treeNum + "번 나무가 쓰러졌다.");
//					break;
//				}
//				hit++;	// 도끼질 횟수 1 증가
//			}
			
//			System.out.println();
//		}
//	}
//}
//		while (i < 5) {
//			System.out.println("while 문이 " + (i + 1) + "번째 반복 실행중입니다.");
//			i++;	// 1씩 증가
//		}	// while
//		System.out.println("while 문이 종료된 후 변수 i의 값은 " + i + "입니다.");
		
//		System.out.println((i+1) + "번 나무를 쓰러트려보자!");
//		int j = 0;
//		while(true) {
//			System.out.println("나무를 도끼로 " + (j+1) + "번 찍었다.");
//			if (j+1 == one) {
//				System.out.println((i+1) + "번 나무가 쓰러졌다.");
//				System.out.println();
//				i++;
//				break;
//			}
//			j++;
//		}
//		
//
//		System.out.println((i+1) + "번 나무를 쓰러트려보자!");
//		j = 0;
//		while(true) {
//			System.out.println("나무를 도끼로 " + (j+1) + "번 찍었다.");
//			if (j+1 == two) {
//				System.out.println((i+1) + "번 나무가 쓰러졌다.");
//				System.out.println();
//				i++;
//				break;
//			}
//			j++;
//		}
//		
//
//		System.out.println((i+1) + "번 나무를 쓰러트려보자!");
//		j = 0;
//		while(true) {
//			System.out.println("나무를 도끼로 " + (j+1) + "번 찍었다.");
//			if (j+1 == three) {
//				System.out.println((i+1) + "번 나무가 쓰러졌다.");
//				System.out.println();
//				i++;
//				break;
//			}
//			j++;
//		}
//		
//
//		System.out.println((i+1) + "번 나무를 쓰러트려보자!");
//		j = 0;
//		while(true) {
//			System.out.println("나무를 도끼로 " + (j+1) + "번 찍었다.");
//			if (j+1 == four) {
//				System.out.println((i+1) + "번 나무가 쓰러졌다.");
//				System.out.println();
//				i++;
//				break;
//			}
//			j++;
//		}
//		
//
//		System.out.println((i+1) + "번 나무를 쓰러트려보자!");
//		j = 0;
//		while(true) {
//			System.out.println("나무를 도끼로 " + (j+1) + "번 찍었다.");
//			if (j+1 == five) {
//				System.out.println((i+1) + "번 나무가 쓰러졌다.");
//				System.out.println();
//				i++;
//				break;
//			}
//			j++;
//		}
//	}
//
//}

