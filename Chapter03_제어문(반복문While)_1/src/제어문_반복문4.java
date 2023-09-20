//사용자에게 정수 1게 => 구구단

import java.util.Scanner;

public class 제어문_반복문4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단 입력: ");
		int d = sc.nextInt();
		
		int i = 1;
		while(i<=9) {
			System.out.printf("%d * %d = %d\n",d,i,d*i);
			i++;
		}

	}

}
