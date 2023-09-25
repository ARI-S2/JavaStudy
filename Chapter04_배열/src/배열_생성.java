/*
 * 배열
 * --- 묶어서 관리
 *     1) 변수 => 같은 유형의 변수가 3개 이상=> 묶어서 관리
 *           => 같은 데어터형
 *           => 다른 데이터형(****)
 *               (Spring)
 *              => ~VO , ~DTO , ~Bean
 *                     (MyBatis) (JSP)
 *              한명의 사원에 대한 정보 저장
 *                   ---
 *     2) 명령문: 관련된 명령끼리 묶어서 구조적 프로그램
 *              => 메소드 -> 단락
 * 기본문법 -----
 * 데이터 묶기 (변수)
 * 명령문 묶기 (명령문) => 소스코딩
 *             ㅣ
 *            입력
 *            처리
 *            출력
 * 배열
 * 1) 장점
 *    여러개의 변수명 => 한개로 합쳐서 사용
 *    => 데이터마다 구분 => 인덱스 (순차적) => 반복문
 * 2) 단점
 *    정적임 => 메모리 할당 (10)
 *    ---- 크기변경이 불가능 => 큰 배열을 생성
 *    같은 데이터형          
 * --------------------------------------
 * 1. 배열선언
 *    데이터형[] 배열명; 자바(권장)
 *    데이터형 배열명[]; C
 * --------------------------------------
 * 2. 초기화
 * 	  int[] arr = {1,2,3,4,5};
 *  =
 *    int[] arr = new int[5]; => 자동 초기회
 * ~> 스택에 배열명 저장
 * ~> 힙에 실제 배열 데이터 연속적 주소에 저장 (값 바뀔수도 있으므로)
 * 3. 값 변경
 *    => 1번째 값 변경
 *       arr[0] = 100;
 *       arr[1] = 200;
 * 4. 출력
 *    int[] arr;
 *    for(int a : arr){
 *    
 *    }
 */
//3명의 학생 => 국,영,수 => 총점, 평균

import java.util.Scanner;

public class 배열_생성 {
	public static void print(int dan) {
		 
	for(int i = 1; i<=9; i++) {
		System.out.println(dan+"*"+i+"="+dan*i);
	}
}

	public static void main(String[] args) {
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		double[] avg = new double[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<=3; i++) {
			System.out.println(i+1+"번째 학생 국어 점수 입력: ");
			kor[i] = sc.nextInt();
			System.out.println(i+1+"번째 학생 영어 점수 입력: ");
			eng[i] = sc.nextInt();
			System.out.println(i+1+"번째 학생 수학 점수 입력: ");
			math[i] = sc.nextInt();
			
			System.out.printf("%d번째 학생 평균: %.2f",i,kor[i]+eng[i]+math[i]/3.0);
			System.out.println();
			System.out.println("=======================");
		}
//%-5d

}
}
