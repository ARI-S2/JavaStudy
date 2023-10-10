/*
 * 프로그램
 * 1. 데이터 관리 (메모리에 저장, 파일 저장, ***RDBMS 저장)
 *    --------
 *    1) 데이터 저장
 *       = 한개 저장 : 변수
 *       = 같은 데이터 저장 : 배열
 *       -----------------------------
 *       = 다른 데이터형 저장 : 클래스
 *         => 메모리 주소를 이용하는 프로그램
 *            -------- 참조 변수 => 사용자 정의 데이터형
 *       ----------------------------- 관련된 데이터를 모아서 관리
 *    2) 데이터 가공
 *    	 = 명령문
 *    	 = 연산자
 *     	 = 제어문 
 *     ------------- 메소드
 *    3) 가공된 데이터 출력
 *       = 명령 프롬프트 / 윈도우 => App
 *       **= 브라우저 => Web App
 *       -----------------------
 *       = 모바일 (코틀린)
 *       -----------------------
 *       = Front-end (react,vue)
 *                    ----- react-query
 * 2. 데이터 관리를 위한 사용자 정의 데이터형
 *    = 클래스의 구성 요소
 *    = 클래스의 변수의 종류
 *    = 메소드 처리 
 *    = 생성자
 *    = 초기화 블록
 *    = 클래스의 종류
 *    = 라이브러리
 *    = 예외처리
 *    
 * ** 한 파일 내에 public 클래스는 1개만 선언 가능 => 파일명이 되기 때문에
 * ** 같은 src폴더 안에 같은 이름의 class명 안됨 => 메모리 할당 시 문제 발생
 */
// 학생 = > 이름, 국어, 영어, 수학
// 모든 클래스는 변수 선언시 => 4byte (클래스의 주소값을 담은 변수)

import java.util.Scanner;
class Student {
	String[] names = new String[3];
	int[] kor = new int[3];
	int[] eng = new int[3];
	int[] math = new int[3];
}
public class MainClass {

	public static void main(String[] args) {
		String[] names = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i< kor.length; i++) {
			System.out.println((i+1)+"번째 학생 국어 점수 입력: ");
			kor[i] = sc.nextInt();
			System.out.println((i+1)+"번째 학생 영어 점수 입력: ");
			eng[i] = sc.nextInt();
			System.out.println((i+1)+"번째 학생 수학 점수 입력: ");
			math[i] = sc.nextInt();
		}
		
//		// 학점 출력
//		for(int i = 0; i< kor.length; i++) {
//			avg[i] = (kor[i] + eng[i] + math[i]) / 3.0;
//			if (avg[i] >= 90)
//				grade[i] = 'A';
//			else if(avg[i] >= 80)
//				grade[i] = 'C';
//			else if(avg[i] >= 70)
//				grade[i] = 'D';
//			else
//				grade[i] = 'F';
//
//		}
//		
//		//등수 출력
//		for(int i = 0; i< avg.length; i++) {
//			rank[i] = 1; //모두 1로 초기화
//			for(int j = 0; j< avg.length; j++) {
//				if (avg[i] < avg[j]) {
//					rank[i]++;
//				}
//			}
//		}
		
			
		
		for(int i = 0; i< kor.length; i++) {
		System.out.printf("%-5d%-5d%-5d%-5d%-7.2f%\n",
				kor[i], eng[i], math[i],
				kor[i]+eng[i]+math[i],
				kor[i]+eng[i]+math[i]/3.0);

	}
		
		//클래스 이용
		Student hong = new Student();
		
		Student shim = new Student();
		Student park = new Student();
		/*
		 * ** 클래스의 주소만 활용할 뿐 각 변수의 주소값은 필요 X
		 * 
		 * stack => 주소  | heap (실제 데이터) 
		 * ------------  | ---------------
		 * hong          | new student()
		 * = 0x100       | name 
		 *               | age  
		 * 
		 * 
		 *
		 */
		
		
	}

}
