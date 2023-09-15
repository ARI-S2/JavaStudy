/*
 * 알파벳을 받아서 대문자냐 소문자냐 숫자냐 다른문자냐

 */

import java.util.Scanner;

public class 단일조건문_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 입력: ");
		char ch = sc.next().charAt(0);
	
		if(ch>='A' && ch<='Z') {
			System.out.println(ch+"는 대문자입니다.");
		}else if(ch>='a' && ch<='z') {
			System.out.println(ch+"는 소문자입니다.");
		}else if(ch>='0' && ch<='9') {
			System.out.println(ch+"는 숫자입니다.");
		}else {
			System.out.println("기타");
		}
		// 알파벡 받기
		// 대문자
		// 소문자
		// 숫자
		// 기타
		
		

	}

}
