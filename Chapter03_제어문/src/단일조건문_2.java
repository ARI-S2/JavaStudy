/*
 * 정수 입력을 1개를 받는다
 * >>11
 * 같은 숫자이다
 */

import java.util.Scanner;

public class 단일조건문_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - 99까지 정수 입력: ");
		int n = sc.nextInt();
		if(n >= 1 && n < 100) {
			if(n%11==0) {
				System.out.println("같은 숫자이다");
			} else {
				System.out.println("다른 숫자이다");
			}
		} else if(n < 1 || n > 99){
			System.out.println("범위 외 숫자이다");
		}
		


	}

}
