/*
 * 컴퓨터랑 가위바위보
 * => 다중 조건문 => 경우의 수 9개
 *                ---------- 조건문
 *  com -2, 1
 *  user 2 -1
 * 
 */

import java.util.Scanner;

public class 제어문_조건문3_2 {
	public static void main(String[] args) {
		int com, user = 0;
		com = (int)(Math.random()*3);
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2): ");
		
		System.out.println("컴퓨터: ");
		if (com == 0) {
			System.out.println("가위");
		} else if (com == 1) {
			System.out.println("바위");
		}  else if (com == 2) {
			System.out.println("보");
		}
		System.out.println();
		
		System.out.println("사용자: ");
		user = sc.nextInt();
		
		//사용자 값 + 컴퓨터 값 의 결과!!
		int res = com - user;
		if(res == -2 || res == 1) {
			System.out.println("컴퓨터가 이김!");
		} else if(res == 2 || res == -1) {
			System.out.println("사용자가 이김!");
		} else {
			System.out.println("비겼다!");
		}
		
	/*	if (com == 0) {
			if (user == 0) {
				System.out.println("비겼다");
			} else if (user == 1) {
				System.out.println("사용자가 이겼다");
			} else if (user == 2) {
				System.out.println("컴퓨터가 이겼다");
			}
		} else if (com == 1) {
			if (user == 0) {
				System.out.println("컴퓨터가 이겼다");
			} else if (user == 1) {
				System.out.println("비겼다");
			} else if (user == 2) {
				System.out.println("사용자가 이겼다");
			}
		}  else if (com == 2) {
			if (user == 0) {
				System.out.println("사용자가 이겼다");
			} else if (user == 1) {
				System.out.println("컴츄터가 이겼다");
			} else if (user == 2) {
				System.out.println("비겼다");
			}
		} */
}
}
