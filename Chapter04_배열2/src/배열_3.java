/*
 * 3명의 학생 => 국어, 영어, 수랃 ㅣ 총점 , 평균, 학점, 등수
 */

import java.util.Scanner;

public class 배열_3 {

	public static void main(String[] args) {
		int kor[] = new int[3];
		int eng[] = new int[3];
		int math[] = new int[3];
		int rank[] = new int[3];
		double avg[] = new double[3];
		char[] grade = new char[3];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i< kor.length; i++) {
			System.out.println((i+1)+"번째 학생 국어 점수 입력: ");
			kor[i] = sc.nextInt();
			System.out.println((i+1)+"번째 학생 영어 점수 입력: ");
			eng[i] = sc.nextInt();
			System.out.println((i+1)+"번째 학생 수학 점수 입력: ");
			math[i] = sc.nextInt();
		}
		
		// 학점 출력
		for(int i = 0; i< kor.length; i++) {
			avg[i] = (kor[i] + eng[i] + math[i]) / 3.0;
			if (avg[i] >= 90)
				grade[i] = 'A';
			else if(avg[i] >= 80)
				grade[i] = 'C';
			else if(avg[i] >= 70)
				grade[i] = 'D';
			else
				grade[i] = 'F';

		}
		
		//등수 출력
		for(int i = 0; i< avg.length; i++) {
			rank[i] = 1; //모두 1로 초기화
			for(int j = 0; j< avg.length; j++) {
				if (avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}
		
			
		
		for(int i = 0; i< kor.length; i++) {
		System.out.printf("%-5d%-5d%-5d%-7.2f%-3c%-3d\n",
				kor[i], eng[i], math[i], avg[i], grade[i], rank[i]);

	}

}
}
