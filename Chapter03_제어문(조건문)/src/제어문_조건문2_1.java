/*
 * if else
 * 예상되는 결과값이 2개로 나눠서 나올 떄
 * 
 * if if ... (단일)
 * 여러개가 동시에 결과값이 있는 경우
 * 
 * if else if ... (다중)
 * 여러개중에 1개만 수행
 * 
 * 국어, 영어, 수학 => 평균 , 총점 => 평균이 60이상 60미만
 */
import java.util.Scanner;
public class 제어문_조건문2_1 {

	public static void main(String[] args) {
		/*
		 * 변수 선언
		 * 초기화 => 명시적 초기화, 입력값 박아서 저장, 임의 발생
		 * 
		 * 결과값 도출
		 * 
		 */

		int kor, eng, math, total = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수 : ");
		eng = sc.nextInt();
		System.out.println("수학 점수 : ");
		math = sc.nextInt();
		total = kor+eng+math;
		avg = total/3.0;
		System.out.println("========결과값=========");
		System.out.println("국어 점수 :"+kor);
		System.out.println("영어 점수 :"+eng);
		System.out.println("수학 점수 :"+math);
		System.out.println("총점 점수 :"+total);
		System.out.printf("평균:%.2\n",avg);
		if(avg>=60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}

	}

}
