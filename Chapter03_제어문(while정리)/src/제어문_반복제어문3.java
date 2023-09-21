/*
 * 함수 vs 메소드
 * ----------- 한가지 기능을 수행
 * 함수 : 독립적으로 사용
 * 메소드 : 클래스 종속
 * ----------- 종료하는 시점 ==> return; => 메소드 선언부에 종속적 void / string / int 각 형식별로 리턴값 줘야함
 * 배열 / 메소드
 * ---------- 클래스
 *            ---- 객체지향에 맞게
 *                 데이터 보호(캡슐화)
 *                 재사용 (상속, 포함)
 *                 		is-a , has-a
 *                 오버라이딩(수정), 오버로딩(추가)
 *                 ==> 유지보수가 쉽게 제작
 */
import java.util.Scanner;

public class 제어문_반복제어문3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴 선택: ");
			int m = sc.nextInt();
			if (m<1 || m>9) {
				System.out.println("없는 메뉴입니다");
				continue; //블록 빠져나와서 조건식 판별 후 다시 실행
			}
			if (m ==9) {
				//System.exit(0); 여기서 시스템을 끝내버리면 이 블록 외에는 명령문 불가
				break;
			}
			System.out.println(m+"번 메뉴를 선택했습니다");
		}
		System.out.println("프로그램 종료!");

	}

}
