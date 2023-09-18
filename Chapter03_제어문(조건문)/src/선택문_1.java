/*

 * 	선택문은 범위가 지정되는 것이 아니다 
 *  => 값 1개를 선택해서 사용
 *     ----- 정수, 문자, 문자열
 *  => 형식)
 *  	switch(정수,문자,문자열) // 정수만 사용(실수는 사용 불가)
 *  	{
 *  		case 1:
 *  		  실행문장
 *  		  break; ==> 실행문장 수행 후 종료
 *  		case 2:
 *  		  실행문장 
 *  		  break; ==> 실행문장 수행 후 종료 
 *  		case 3:
 *  		  실행문장 ==> 3을 수행하고 4번을 수행하고 종료 
 *  		case 4:
 *  		  실행문장 
 *  		  break; ==> 실행문장 수행 후 종료 
 *  	}
 *  	범위가 지정되면 다중 조건문 
 *  	범위가 없이 값이 1개일 때 => switch case 
 *  	switch => 메뉴 , 키보드 => 웹, 게임
 *  
 */

import java.util.Scanner;

public class 선택문_1 {
// 3개의 정수 => 평균, 총점, 학점
	public static void main(String[] args) {
		int kor, eng, math, total, avg = 0;
		double avg2 = 0;
		char s= ' ';
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 입력: ");
		kor = sc.nextInt();
		System.out.println("영어 입력: ");
		eng = sc.nextInt();
		System.out.println("수학 입력: ");
		math = sc.nextInt();
		total = kor+eng+math;
		avg2 = total/3.0;
		avg = (int)(avg2/10); //case의 수를 한계지음
		
		//switch문은 case별 break 필수
		switch(avg) {
		case 10:
		case 9:
			s='A';
			break;
		case 8:
			s='B';
			break;
		case 7:
			s='C';
			break;
		case 6:
			s='D';
			break;
		default: //나머지
			s='F';
		}
		System.out.println("========결과값=========");
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2\n",avg2);
		System.out.println("학점: "+s);

}
}
