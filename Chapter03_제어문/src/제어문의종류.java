/*
 * 변수 => 저장(데이터)
 * 연산자 => 결과값 , 사용처, 형식
 *  제어문 => 흐름(동작), 사용처, 형식
 *  1. 제어문의 종류
 *    = 조건문
 *      = 단일 조건문
 *        형식)
 *            if(조건문) => 조건문 (비교, 논리, 부정 연산자) {
 *            	문장 1
 *              문장 2
 *            }
 *            => 명령문을 제어한다 (수행 o,x)
 *            => 속도가 느려지는 단점
 *            => 중복이 있는 경우 사용 가능 (1-100 중에 3,5,7 배수)
 *            	 if -> if 는 
 *               if가 T여도 아래 조건문 수행
 *               int a = 15;
 *               if(a%3 == 0)
 *               if(a%5 == 0) // else if 안됨 ! ! !
 *               if(a%7 == 0)
 *      = 선택 조건문
 *        => 
 *        if (s = 80)
 *        else if (s = 70) // if if 안됨 ! ! !
 *        if(조건문){
 *           ㄴ F면 아래 조건문 수행  
 *           // if -> if 는 if가 T여도 아래 조건문 수행
 *        }
 *        else if ( ){
 *        }
 *        else{
 *        }
 *        = 다중 조건문
 *          => 계산기 : +, -, /, *
 *    = 선택문
 *    = 반복문
 *    = 반복제어문
 *    
 *  단일 조건문 : 조건식 (비교연산식, 논리연산자, 부정연산자)
 *  1. 정수 한개를 입력 받아서 짝수/홀수 
 */

import java.util.Scanner;

public class 제어문의종류 {

	public static void main(String[] args) {
		//Scanner는 클래스 => 키보드로 입력해서 저장 =? 엔터 후 메모리에 저장
		/*
		 * 기능(메소드)
		 * 정수: nextImt()
		 * 문자열: next() // 문자는 charAt()
		 * 실수: nextDouble()
		 * 불린: nextBoolean
		 * 문자: System.in => 정수 ('a' 입력시 65 저장)
		 */
		// Scanner클래스 저장 => 클래스를 저장(new) => 동적바인딩
		Scanner sc = new Scanner(System.in);
		// System.in / System.out => 자바 표준 입출력
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		if(n%2 == 0) {
			System.out.println(n + "은 짝수입니다");
		}
		else if(n%2 == 1) {
			System.out.println(n + "은 홀수입니다");
		}

	}

}
