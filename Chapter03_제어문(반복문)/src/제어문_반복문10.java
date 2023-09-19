/*
 *  *  *  * ===================================
 * n번째까지 순서대로 666과 조합

9666

10666

11666

15666

16660 ~

16661

16669 ~

17666

19666

20666

166699


스프링 부트 msa, cicd , 스프링 아파치, 스프링 데이터
리액트 뷰엑스 타입스크립트

 */
//사용자가 정수 1입력 => 입력받은 수까지의 합을 10 1-19
import java.util.Scanner;

public class 제어문_반복문10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int ip = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum+=i;
		}
		System.out.println("1~"+ip+"까지 합= "+sum);

}
}