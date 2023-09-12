/*
 *    2023-09-12
 *    1. 목표
 *    = 데이터 형 (메모리 공간의 크기)
 *    = 변수 / 상수
 *    = 연산자 (가공) 
 *    --------------- 제어문 / 객체지향 / 예외처리 / 클래스의 종류 / 재사용(is-a, has-a)
 *    1) 프로그램의 기본
 *       = 데이터 저장하는 방법
 *       = 데이터를 한개만 저장 : 변수 / 상수, 리터럴: 실제 저장할 값
 *                          ---- 메모리 저장 공간의 별칭
 *                               ----- 주소 (-0~...)
 *         자바 메모리 구조
 *         ------------------------------
 *           method 영역 => method, static
 *         ------------------------------
 *           stack => 지역변수, 매개변수 ==> 메모리 자체 관리
 *         -------------------
 *           heap => 클래스 블록 ==> 사용자가 관리 (자동 메모리 회수 : 가비지 컬렉션)
 *         ------------------------------
 *         
 *         프로그램 => 데이터 관리 (Vue, React => 데이터가 바뀌면 실시간으로 작용 => 변화 속도가 빠름)
 *         실제 메모리 (RAM) => 휘발성 메모리 => 프로그램이 종료괴면 저장된 메모리 사라짐
 *           100을 저장
 *         0-----------
 *            사용중
 *         4-----------
 *            사용중
 *         8-----------
 *            100 ==> 이름부여 => a
 *         12----------
 *         
 *         16----------
 *         메모리 크기 => 속도 (4byte가 기준이 된 이유: int가 가장 많이 쓰이므로 다른 형은 나누거나 합치는데 시간이 걸려서)
 *         
 *         => 자바에서 제공하는 메모리 크기9자료형, 데이터형)
 *            정수
 *               byte => 1byte (8bit) => 0,1을 8을 저장하는 공간
 *               -----------------------------------
 *               부호ㅣ 1 ㅣ 1 ㅣ 1 ㅣ 1 ㅣ 1 ㅣ 1 ㅣ 1 ㅣ => 8개
 *               -----------------------------------
 *                ㅣ
 *               양수(0) . 음수(1)  
 *               
 *               01111111
 *               -------- 
 *                       2^0*1 = 1
 *                       2^2*1 = 1
 *                       2^3*1 = 1
 *                       --
 *                       --
 *                       --
 *                       2^7*1 = 1
 *                      ------------ 127
 *                          2의 보수     1
 *                                   ---
 *                                  -128 => -128 ~ 127 (byte의 범위)
 *               => 주로 사용처
 *                  파일 읽기 / 파일 쓰기/ 업로드 / 다운로드시 사용
 *               short : 16bit(2byte) 
 *               int : 4byte => 일반적인 모든 숫자는 int
 *                           => default
 *                           => 숫자의 범위가 크면 long형으로 변경
 *               long : 8byte(64byte)
 *                      빅데이터 / 금융권                            
                  L(1) => 100L(long) 100(int)
              실수 
                 float : 4byte
                 double : 8byte => default   
 *            문자 : char => 2byte (멀티 바이트)
 *                 -------------------------
 *                 1byte (아스키) , 2byte(Unicode)
 *                      ㅣ              ㅣ
 *                     C/C++          자바
 *                   => 범위(0~256)  (0~65535)
 *                   => 한글 (자음+모음) => 한글자당 2byte => UTF-8
 *            논리 : boolean (1byte) =? true/false
 *                  => 조건문         
 *            -------------------------------
 *            논리형 
 *                  boolean(1byte) => true/false
 *            --------------------------------
 *            정수형
 *                  byte (1byte) ==> (127을 초과하면 에러 발생) -128 ~ 127
 *                  int (1byte) ==> -21억 4천 ~ 21억 4천
 *                  long (1byte) ==> 제일 큼 => L(1)
 *            --------------------------------
 *            실수 
 *                  float : (4byte) => 10.5F(ㄹ)
 *                          => 소수점 이하 6자리
 *                  double : (8byte) => 10.5 ==> default
 *                          => 소수점 이하 15자리
 *            ---------------------------------
 *            문자형 : char (2byte) => 0~65535
 *                   => 한개의 문자만 사용이 가능 'A', '홍'
 *                   => 정수형 (글자마다 번호)
 *                   => A => 65 , a => 97
 *                   => 연산처리 => 정수형으로 자동 변환
 *                   =>> 'A'+1
 *                       ---
 *                       65+1 => 66
 *            ---------------------------------
 *            참조형(사용자 정의) 
 *            
 *            ---------------------------------      
 *              
 *            
 *         
 *         20----------
 */
public class 자바데이터형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
