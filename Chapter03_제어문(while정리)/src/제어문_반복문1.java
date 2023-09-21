/*
 * 제어문: 프로그램 제어 => 반복수행, 선택부분 출력
 * 		 사용자 요청 처리...
 * for: 반복 획수가 존재 => UI
 * 		 => 웹 프로그램 (프론트)
 * while: 반복 횟수 없을 떄 => 서버(백엔드)
 *       => 크롤링, 데베, 파일 읽기
 *       => 선조건 (수행을 못할 수도 있다)
 * do while: 무조건 한번이상 수행
 * 			do{ 
 * 
 * 			}whlie(조건문)
 * ---------
 */
public class 제어문_반복문1 {

	public static void main(String[] args) {
		System.out.println("=====for======");
		for(int i =1;i<=10;i++) {
			System.out.println(i+" ");
		}
		System.out.println("\n======while======");
		int i = 1;
		while(i<=10) {
			System.out.println(i+" ");
			i++;
		}
		System.out.println("\n======do while======");
		i=1;
		do {
			System.out.println(i+" ");
			i++;
		}while(i<=10);
	}

}
