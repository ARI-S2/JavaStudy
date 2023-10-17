/*
 * 1. 변수, 배열 => int, string
 * 2, 요청, 처리 => 연산자, 제어문(메소드화)
 *    제어문: for each => js, vue,react, redux
 *    		while => DB연동 (오라클에서 db읽기)
 * 배열 사용법)
 * 초기값 부여
 * 1) 명시적 초기화 => int, char
 * 2) 크롤링 초기화
 * 3) 파일
 * ------------- => String
 * 4) 입력 => int, char 
 * 5) 난수 => int, char    
 */

import java.util.Calendar;
import java.util.Scanner;

public class 배열_1 {

	public static void main(String[] args) {
		//변수 선언, y , m => 입력
		int y, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력: ");
		y = sc.nextInt();
		System.out.println("월 입력: ");
		m = sc.nextInt();		
		// 처리 => 달력을 만들기 위한 처리
		// => 1년 1월 1일 ~ 요청 날짜 => 총날수 % 7 => 요일 => 1일자에 대한 요일 확인
		// 1. 전년도까지의 합
		int total = (y-1) * 365
				  + (y-1) / 4
				  - (y-1) / 100
				  + (y-1) / 400; //윤년 조건
		// 2. 전달까지의 합
		// int lastday = cal.getActualMaximum(Calendar.DATE); => 각 달의 마지막날 가져옴 (배열할 필요 없음)
		int[] lastday = {
				31,28,31,30,31,30,
				31,31,30,31,30,31
		};
		// 문제 발생 => 1월(윤년 => 29 , 윤년(x) => 28)
		// 윤년 조건 => 프로그램에서 자주 등장
		if((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) 
			// 윤년이라면 => 2024 
			lastday[1] = 29;
		else
			lastday[1] = 28;
		for(int i = 0; i < m-1; i++) {
			total += lastday[i];
		}
		// 3. +1
		total++;
		// 요일 구하기
		int week = total % 7;
		char[] strWeek = {'일','월','화','수','목','금','토'};
		// 달력 출력 => 메소드
		//System.out.println(y+"년도 "+m+"월 "+d+"일은 "+strWeek[week]+"요일이다");
		System.out.println(y+"년도 "+m+"월 ");
		System.out.println();
		for(int i = 0; i <strWeek.length; i++) {
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();
		//해당 달의 마지막 일 출력
		for(int i = 1; i <= lastday[m-1]; i++) {
			if(i==1) { //어느 요일부터 1을 넣어서 출력할건지 탭...
				for(int j = 0 ;j < week; j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t", i); // 일 출력
			week++;
			if(week>6) {
				week =0;
				System.out.println();
			}
		}

}
}