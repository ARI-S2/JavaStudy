/*
 * 
 */

import java.util.Scanner;

public class 제어문_반복문3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor,eng,math;
		int total;
		double avg;
		/*
		 * for(3)
		 * 	while(t)
		 * 		배열 안에 집어넣음!!
		 * 
		 */
		while(true) {
			System.out.println("국어 입력 ");
			kor = sc.nextInt();
			if (kor>=0 && kor <=100) {
				break;
			}
		}
		while(true) {
			System.out.println("영어 입력 ");
			eng = sc.nextInt();
			if (eng>=0 && eng <=100) {
				break;
			}
		}
		while(true) {
			System.out.println("수학 입력 ");
			math = sc.nextInt();
			if (math>=0 && math <=100) {
				break;
			}
		}
		total = kor+eng+math;
		avg=total/3.0;
		System.out.println("총점: "+total);
		System.out.printf("평균:%.2f"+avg);
	}

}
