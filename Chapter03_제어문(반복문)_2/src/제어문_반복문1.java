/*
 * 프로젝트 => 없는 기능 추가 / 동작 줄이기, 늘리기
 * 1차: DB연결
 * 2차: Spring 기능 구현
 * 3차: 차세대 개발
 * 
 * => 서버(Spring)에서 요청처리 ==> 화면 변경 (구시대)
 * => 차세대
 * 	  Spring Boot (서버) <===> Front
 *       Restful (Json)      ------- 처리속도(Vue, React)
 *         ㅣ
 *         통합 => 각 프로그램마다 따로 서버를 돌린다 (MSA/Kafka)
 *    => AI => 머신러닝/딥러닝
 *    
 *    ===> 반복문
 *         = for: 브라우저 화면 출력
 *                페이지 나누기
 *                ---------- 사용자가 한눈에 볼 수 있는게 15개 한정
 *         = while: 파일 / DB
 *         
 */
public class 제어문_반복문1 {

	public static void main(String[] args) {
		for(int i=1; i <=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%2d * %2d = %2d\t",j,i,j*i);
			}
			System.out.println();
		}

	}

}
