/*
 * 문자열
 * 일반 데이터형
 * 		string n = "";
 * ---------------------
 * 클래스형
 * 기능 => 메소드
 * => 웹은 데이터형이 존재하지 않는다 => 문자열
 * "1"
 * <input type = text>
 */

import java.util.Scanner;

public class 문자열1 {

	public static void main(String[] args) {
		String n = "홍길동";
		System.out.println(n);
		char a= '홍';
		char b= '길';
		char c= '동';
		System.out.println(a+b+c); //숫자로 연산돼서 이렇게하면 안됨
		Scanner sc = new Scanner(System.in);;
		System.out.println("검색어 : ");
		String fd = sc.next();
		System.out.println(fd);

	}

}
