package hello2;

public class Hello2Class {

	public static void main(String[] args) {
		
		// int st;			// 변수명은 숫자로 시작할 수 없다.
		int tree;			// 변수명에 특수문자 사용할 수 없다.
		// int classa;		// 키워드를 변수명으로 사용할 수 없다.
		
		// 안녕하세요
		// 나는 누구입니다
		// 잘 부탁드립니다
		String name = "퉁퉁이";	// 문자열 변수 선언
		tree = 5;
		
		System.out.println("안녕하세요");
		System.out.println("나는 " + name + " 입니다");
		System.out.println(name + " 잘 부탁드립니다.");
		System.out.println(name + " 인사 드립니다.");
		System.out.println(name + " 집에 갑니다.");
		System.out.println(name + "가 집에 가다가 숲을 만났네");
		System.out.printf("나무가 ");
		System.out.print(tree);
		System.out.println(" 그루 있다\n");
		
		// 도끼질 횟수
		
		// 1번 나무는 2번
		// 2번 나무는 3번
		// 3번 나무는 1번
		// 4번 나무는 5번
		// 5번 나무는 10번
		
		//int one = 2, two = 3, three = 1, four = 5, five = 10;
		
		int [] count = {2, 3, 1, 5, 10};
		int treeNum;		// 나무 번호
		int hit;			// 도끼질 횟수
		
		for (treeNum = 1; treeNum <= tree; treeNum++) {
			hit = 1;	// 도끼질 횟수 초기화
			System.out.println(treeNum + "번 나무를 쓰러트려보자!");
			
			while(true) {	// 
				System.out.println("나무를 도끼로 " + hit + "번 찍었다.");
				
				if (hit == count[treeNum-1]) {		// 1번 나무를 2번 치면
					System.out.println(treeNum + "번 나무가 쓰러졌다.");
					break;
				}
				hit++;	// 도끼질 횟수 1 증가
			}
			
			System.out.println();
		}
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

