/*
 * 정수 2개 입력, 연산자(사칙연산) -> 연산처리
 * 다중 조건문 사용
 */

import java.util.Scanner;

public class 제어문_조건문3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("첫번재 정수 입력: ");
		int a = sc.nextInt();
		System.out.println("두번재 정수 입력: ");
		int b = sc.nextInt();
		System.out.println("연산자 입력: ");
		char c = sc.next().charAt(0);
		
		if(!((c=='+')||(c=='-')||(c=='/')||(c=='*'))) {
			System.out.println("잘못된 연산자입니다");
		}
		else {	
			if(c == '+'){
				System.out.println(a+b);
			} else if(c == '-'){
				System.out.println(a-b);
			} else if(c == '*'){
				System.out.println(a*b);
			} else if(c == '/'){
				if(b == '0') {
					System.out.println("0으로는 나눌 수 없다");
				}
				else {
					System.out.println(a/b);
				}
			} else {
				System.out.println("연산 불가");
			}
		}

	}

}
