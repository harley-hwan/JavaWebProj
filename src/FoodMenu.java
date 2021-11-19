
import java.util.*;

public class FoodMenu {
	public static void main(String args[]) {
		/* 뭐먹지 프로그램
		
		 * 메뉴를 추가 (프로그램 자체에서 메뉴 설정)
		 * 메뉴를 추가 (이 프로그램 사용자가 직접 입력)
		 * 메뉴들을 입력하고 저장된 메뉴들 중에 하나를 알아서 추천
		 * 추천 결과를 출력 */
		System.out.println("뭐먹지 프로그램 시작");
		
		System.out.println("몇 개의 메뉴를 추가할건가요?");
		
		ArrayList<String> menus = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		//String menu;
		int menuNum = sc.nextInt();
		
		for (int i = 0; i < menuNum; i++) {
			System.out.println((i+1) + ". 메뉴를 입력하세요.");
			//String menu = sc.next();
			menus.add(sc.next());
		}
		
		System.out.println("메뉴 목록: " + menus);
		
		double d = Math.random(); // 난수 생성 0 ~ 1사이 double 값
		int index = (int) (d * menuNum); // (0 ~ 1) * 10 => (0 ~ 10)
		
		String get_Menu = menus.get(index);
		
		System.out.println("오늘의 메뉴는 '" + get_Menu + "' 입니다.");
		
		sc.close();
	}
}
