// 1. 매개변수(X) , 리턴형(O)
// => 아이디 찾기

import java.util.Scanner;

public class 메소드_2 {
	// 아이디 입력
	static String idInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("id 입력: ");
		String id = sc.next();
		return id;
	}
	
	// 아이디 중복체크
	static boolean idCheck(String id) {
		boolean bCheck = false;
		//오라클
		String[] ids = {
				"hong","admin","lee","park","shin"
		};
		for(String i : ids) {
			if(id.equals(i)) {
				bCheck = true;
				break;
			}
		}
		return bCheck;
	}
	
	// 모든 메소드를 조립 (깁ㄴ)=> 다른 클래스가 사용이 가능하게
	static void process() {
		//사용자가 입력한 값
		String id = idInput();
		
		boolean bCheck = idCheck(id);
		
		if(bCheck)
			System.out.println(id+"는 이미 사용중인 이이디이다");
		else
			System.out.println(id+"는 사용가능한 아이디이다");
		
	}
	public static void main(String[] args) {
		process();

	}
}