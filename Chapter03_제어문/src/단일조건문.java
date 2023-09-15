/*
 * if(조건문){
 *   true일 때만 수행
 * }
 * 
 * 두개의 정수, 연산자, +,-,*,/
 * => 간단한 계산기

 */

import java.util.Scanner;

public class 단일조건문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.err.println("첫번재 정수 입력: ");
		int a = sc.nextInt();
		System.err.println("두번재 정수 입력: ");
		int b = sc.nextInt();
		System.out.println("연산자 입력: ");
		char c = sc.next().charAt(0);
		
		if(!(c=='+')||(c=='-')||(c=='/')||(c=='*')) {
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
