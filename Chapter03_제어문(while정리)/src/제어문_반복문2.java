// while => 메뉴

import java.util.Scanner;

public class 제어문_반복문2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//프로그램 유지해야하니까 while(true)문 주고 선택하게 만들기
		while(true) {
			System.out.println("====메뉴=====");
			System.out.println("1. 노래 목록");
			System.out.println("2. 가수 찾기");
			System.out.println("3. 노래 찾기");
			System.out.println("4. 상세 보기");
			System.out.println("5. 종료");
			System.out.println("===========");
			System.out.println("메뉴 선택: ");
			int menu = sc.nextInt();
			if(menu == 5) {
				System.exit(0);//0번은 정상종료
			}
		}

	}

}
