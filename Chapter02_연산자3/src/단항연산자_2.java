//형변환 연산자
/*
 * (int)값
 * 
 */

import java.util.Scanner;

public interface 단항연산자_2 {
	public static void main(String[] args) {
		int a =65;
		double d = (double)a;
		//생략이 가능
		char c = (char)a; // 변수대입이므로 형변환 필요
		//특수한 경우 => 생략이 가능 (실제 값 대입 char = 65;)
		//연산처리가 되면 생략할 수 없다
		System.out.println("a=" +a);
		System.out.println("d=" +d);
		System.out.println("c=" +c);
		c = 0;
		System.out.println(c);
	}

}
