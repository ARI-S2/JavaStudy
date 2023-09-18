/*
 * 사칙연산
 * 정수 2개 => 연산자 (문자열)
 * 정수 3개 => 1개 결과값
 * 
 */

import java.util.Scanner;

public class 선택문_2 {

	public static void main(String[] args) {
		int n1,n2; //나중에 입력값 받으므로 초기값 필요 x
		int res = 0; //제어문안에서 연산이 되므로 초기값 필수
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번재 정수 입력: ");
		n1 = sc.nextInt();
		System.out.println("두번재 정수 입력: ");
		n2 = sc.nextInt();
		
		System.out.println("연산자 입력(+,-,*,/)");
		switch(sc.next()) {
		case "+":
			res = n1 +n2;
			break;
		case "-":
			res = n1 - n2;
			break;
		case "*":
			res = n1 * n2;
			break;
		case "/":
			res = n1 / n2;
			break;
		default:
			System.out.println("잘못된 연산자 입니다");
		}
		System.out.println("결과값: "+res);

	}

}
