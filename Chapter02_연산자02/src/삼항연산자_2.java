/*
 아이디 중복체크
 로그인
 ID 입력
 ID 찾기 /비밀번호 찾기

 */

import java.util.Scanner;

public class 삼항연산자_2 {

	public static void main(String[] args) {
		System.out.println("정수 세 개 입력: ");
		Scanner sc = new Scanner(System.in); 
		// import 안해도 스캐너만 치고 컨트롤 스페이스 / 커서 대면 자동완성
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(a * b + c);
	}

}
