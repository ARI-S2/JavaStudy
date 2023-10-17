// 사용자로부터 입력값(문자열) => 좌우대칭 여부 확인
// ABBA => 문자 갯수 => length()

import java.util.Scanner;

public class 문자열_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = ""; // char은 ''; 로 붙혀쓰면 오류
		while (true) {
			System.out.println("문자열 입력: ");
			msg = sc.next();
			if(msg.length()%2 == 0) { // 짝수여야 비교 가능 => 오류처리
				break;
			}
		}
		//대칭 확인
		boolean bc = true; //트루로 시작 -> 중간에 아니면 false변경
		/*
		 * 		AB BA
		 * 		-   -
		 *       - -
		 *      
		 */
		int j = msg.length()-1;
		for(int i = 0; i < msg.length()/2; i++) {
			
			char c = msg.charAt(i); //첫번째 문자 인덱스부터
			char c1 = msg.charAt(j); // 마지막 문자 인덱스부터
			if(c != c1) {
				bc = false;
				break;
			}
			j--;
		}
		if (bc == false) {
			System.out.println("대칭 구조가 아니다");
		}
		else {
			System.out.println("대칭 구조다");
		}
	}

}
