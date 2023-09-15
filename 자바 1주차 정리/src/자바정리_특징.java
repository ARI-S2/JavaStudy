/*
 * 자바
 * -----
 * 1. 데이터 저장
 *    변수 : 한개만 저장 (메모리 저장)
 *    => 변수 : 프로그램에 따라 변경이 가능
 *    => 상수 : 고정 (final)
 * 2. 저장 방법 : 메모리 크기 (기본형, 데이터형)
 *    정수
 *       1byte(-128~127) => byte
 *       => 네트워크(송수신). 파일업로드. 다운로드 , 웹
 *       int : 기본값
 *       ---- 4byte(32bit)
 *       long : 62bit (큰 숫자를 저장) : 금융권...
 *       -------- 정수
 *       정수 저장 => 10
 *       int 메모리 공간 = 10
 *           -------- {}종료시 , 프로그램 종료 => 사라짐
 *    실수 
 *       double : 64bit => 15자리 소수점 저장이 가능
 *    문자
 *       char (0-65535) => 각 문자마다 고유번호가 있다
 *                      => 컴퓨터는 무조건 0,1(2진법)
 *       => 'A' => 65
 *          'a' => 97
 *          '0' => 48
 *    논리 : 1 byte => boolean
 *          => T/F
 *    데이터 가공
 *    -------- 점수 입력 (국,영,수)
 *    웹 => 조회수 증가 , 인기순위 (데이터 가공)
 *        hit = hit+1   sort
 *        => 연산자 , 제어문
 *           ----   ---- => 재사용
 *    연산자
 *    ----
 *      산술연산자 (+, -, %, *...)
 *      1. => 같은 데이터형끼리 연산
 *         => 자동 형변환 / 강제 형변환
 *      
 *      2. + (산술-<문자열 결합)
 *         +는 연산처리시 문자열이 존재하면 문자멸
 *      3. 0으로 나누면 에러
 *      4. % 왼쪽 부호가 남는다         
 *      5. int 크기 이하 자료형끼리 연산 시 결과값 int 
 *      
 *    단항 연산자
 *      = 증감 연산자
 *        = 전치 연산자
 *        = 후치 연산자
 *    	= 부정 연산자 (!)
 *      = 형변환 연산자
 *        = 자동 형변환
 *        = 강제 형변환
 *        => 클래스 형변환
 *    --------------
 *    boolean
 *    제어문 => 조건문 , 반복문
 *    비교 연산자 : < > == 문자열은 equals, compare
 *    논리 연산자 : ||  &&
 *    --------------
 *    대입 연산자 : += -= =
 *    삼항 연산자 : 조건 ? T : F
 *    
 */
public class 자바정리_특징 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
