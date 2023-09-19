/*
구구단 출혁
 */

import java.util.Scanner;

public class 제어문_반복문3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("정수 입력: ");
		int n = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %2d\n",n,i,n*i);
			//printf (" %2d \n ") ~> 오른쪽 정렬
		}
	}

}
