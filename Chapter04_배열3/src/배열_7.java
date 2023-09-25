/*
 * 년도 / 월 / 일 / => 요일 출력
 */

import java.util.Scanner;

public class 배열_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력");
		int y = sc.nextInt();
		
		System.out.println("월 입력");
		int m = sc.nextInt();
		
		System.out.println("일 입력");
		int d = sc.nextInt();
		
		/*
		 * 요일 구하기 방식
		 * ------------
		 * 1년 ~ 요청날까지 총날수 구한다 % 7 ==> 요일!!
		 */
		
		char[] strWeek = {'일','월','화','수','목','금','토'};
		int[] lastday = {
				31,28,31,30,31,30,
				31,31,30,31,30,31
		};
		// 1. 전년도까지 날수 => 12.31
		int total = (y-1) * 365
				   +(y-1) / 4
				   -(y-1) / 100
				   +(y-1) /400;
		// 윤년일 결우 변경 (2월 날짜 변경)
		if((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) 
			 lastday[1] = 29;
		else
			lastday[1] = 28;
		 
		// 2. 전달까지 날수
		for(int k = 0; k < m -1 ; k++) {
			total += lastday[k];
		}
		// 3. 요청 날 ==============> 1+2+3%7 => (0-6)
		total += d;
		
		//요일 구하기
		int week = total %7;
		
		System.out.println(y+"년도 "+m+"월 "+d+"일은 "+strWeek[week]+"요일이다");
		
		
	}

}
