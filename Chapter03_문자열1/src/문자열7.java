//equals() => 대소문자 구분 
//equalsIgnoreCase=> 검색기는 대소문자 구분 안해도되기에 이걸 사용

import java.util.Scanner;

public class 문자열7 {

	public static void main(String[] args) {
		final String MID = "admin", MPWD="1234";
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력:  ");
		String id = sc.next();
		System.out.println("비밀번호 입력: ");
		String pwd = sc.next();
		if(id.equals(MID) && pwd.equals(MPWD)) {
			System.out.println(id+"님 로그린 되었습니다.");
		}else
		{
			System.out.println("id나 pwd가 틀립니다!");
		}

	}

}
