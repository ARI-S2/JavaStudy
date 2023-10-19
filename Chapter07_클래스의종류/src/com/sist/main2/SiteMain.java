package com.sist.main2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.border.Border;

// 같은 유형의 클래스를 모을때는 인터페이스 
// => object클래스로 안모으는 이유는 각자 사용자 정의 클래스 객체를 여러개 받을 수 있으나 
//                            => 서로 존재하는 변수, 메소드 다르기에 그 참조변수로 메소드 접근 불가능(호출 불가)!!!

// 인터페이스 자료형 = new 클래스 자료형(); => 생성자 메소드 실행됨 =/=> 하위 클래스에만 있는 메소드는 사용 X 
//  												    ==>> 인터페이스에 하위클래스에 필요할만한 메소드 default로 미리 선언해둠
// ~> 인터페이스의 하위 클래스는 독자적으로 메소드 선언해도 쓸 수 없기에 인터페이스 메소드만 사용!! 

/*
 * 인터페이스는 멤버변수 사용불가 (상수 static final 가능)
 * => 디폴트 메소드에는 변수 사용 가능 (지역변수니까) => 매개변수도 O
 * ==> 디폴트 메소드를 하위 클래스에서 오버라이드해서 변수 값 변경 시 그 바뀐 값 출력
 * 
 * 인터페이스에 있는 추상메소드는 전부 구현해야됨
 * 디폴트는 오버라이드 하지 않아도 됨
 * 
 * class의 경우
 * super자료형 a = new sub자료형();
 * => 디폴트는 super의 변수(생성자는 상속이 안되므로) / sub의 메소드
 * ==> public sub(){ this.(); } 사용시 sub 변수로 초기화 가능
 */
// 진짜 공통된 기능만 가진 경우만 인터페이스 (디폴트메ㅗ드 추가가 비효율적이므로)
public class SiteMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Map map = new HashMap();
		// 컨트롤러형 객체만 값으로 받을 수 있음
		Map<String,Controller> map = new HashMap<String,Controller>();
		map.put("c1", new MemberController()); // 값 할당 컨트롤러거나 컨트롤러 하위 객체
		map.put("c2", new BoardController());
		map.put("c3", new MovieController());
		map.put("c4", new MusicController());
		map.put("c5", new SeoulController());
		map.put("c6", new MemberController());
		while(true) {
			System.out.println("====== 메뉴 ======");
			System.out.println("1. 회원 관리");
			System.out.println("2. 게시판");
			System.out.println("3. 영화");
			System.out.println("4. 음악");
			System.out.println("5. 서울 여향");
			System.out.println("6. 종료");
			System.out.println("=================");
			System.out.print("메뉴선택: ");
			int menu = sc.nextInt();
			
			//=> 조건문 없이 감
			Controller c = map.get("c"+menu); // 키에 해당하는 값(클래스객체) 반환
			//Controller c = (Controller)map.get("c"+menu);
			
//			if(menu == 1) {
//				MemberController mc = new MemberController();
//				mc.execute();
//			}else if (menu == 2) {
//				BoardController bc = new BoardController();
//				bc.execute();
//			}else if (menu == 3) {
//				MovieController mc = new MovieController();
//				mc.execute();
//			}else if (menu == 4) {
//				MusicController mc = new MusicController();
//				mc.execute();
//			}else if (menu == 5) {
//				SeoulController sc1 = new SeoulController();
//				sc1.execute();
//			}else if (menu == 6) {
//				System.out.println("프로그램 종료");
//			}
		}
	}

}
