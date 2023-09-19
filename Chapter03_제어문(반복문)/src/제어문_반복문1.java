/*
 * 자바 제어문
 * ----------
 * 조건문
 *    = 선택문 ㅣ 값이 1개 => 키보드, 서버(네트워크)
 *    = 단일 조건문
 *      형식) 
 *          if(조건문){
 *             조건이 참일 때 실행문
 *          }
 *          => 상세보기, 로그인, 아이디 찾기
 *          => 독립적 (if문 마다 따로 수행)
 *    = 다중 조건문
  *          if(조건문){
 *             조건이 참일 때 실행문
 *          }else if (조건문){
 *          	위 조건문이 false일 떄 실행
 *          }else {
 *          	위 조건문 다아니면 실행
 *          }
 *          
 *    = 선택 조건문 
 *      t/f 나눠서 처리
 * 반복문
 * 반복조건문
 * 

 */
public class 제어문_반복문1 {

	public static void main(String[] args) {
		for(int i = 0; i < 10 ; i++ ){
			System.out.println("Hello For문");
		} 
		for(int j =10; j > 0; j--) {
			System.out.println(" ");
		}
	}
}
