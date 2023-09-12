/*
 *   25page 관리할 데이터를 저장하는 공간
 *        -------------------1개만 저장이 가능하다
 *   변수: 변수명 => 소문자로 시작
 *        식별자 (명명규칙)
 *        1. 알파벳이나 한글로 시작
 *           ---- 대소문자 구분
 *           ABC , abc, ABc (다 다름)
 *        2. 명칭의 글자 수는 제한하지 않는다
 *           => 3~7 로 압푹
 *           a, b, c => kor, eng, math
 *        3. 숫자는 사용이 가능
 *           앞에 사용은 불가능
 *        4. 특수문자 사용 가능( $ , _ )
 *           file_name
 *           _name , _count => 임시변수
 *        5. 변수명에는 공백을 줄 수 없다
 *        6. 키워드는 사용할 수 없다
 *           ----- 자바에서 사용하는 언어 (int int (x))
 *        
 *   변수
 *      1) 선언
 *         데이터형 변수명;
 *         ------
 *         int a ==> 4byte 메모리 공간을 만들고 이름을 a로 부여한다
 *      2) 초기값을 부여
 *         a = 100;
 *      3) 동시 => int a=100;
 *      4) 값 읽기 / 값 변경
 *         -------------- 읽기(값을 가지고 온다)/ 쓰기((저장)/수정
 *      26page
 *      형식) 
 *      데이터형 변수명
 *      ------ ---- 명명규칙
 *      fileName , file_name
 *      
 *      정수값을 저장한다 (200)
 *      int num = 200
 *      --- ---   ---
 *       ㅣ  변수    ㅣ
 *      데이터형     리터럴
 *  
 *  => 프로그램 개발 : 가독성, 퍼포먼스 (속도)
 *                  ---- 리팩토링
 *     수정이 없으면 간단하게 고정시켜놓으면 됨 (굳이 유지보수 가능하게 짤 필요가 없음)
 *     
 *     float f = 10.5F (실수 디폴트는 더블인데 이게 더 큰 형이라 오류남 그래서 F 필요)
 *     long l = 100
 *     char = 65
 *     
 *     => 실수가 정수보다 크다
 *       1  <  1.0000001
 *     long < float < double
 *     ---------------------
 *     => 메모리 크기(x) => 수표현 / 범위로 따진다 
 *     
 *     byte b = 100; (127만 안넘으면 됨)
 *     int i = 100;
 *     long l = 100L;
 *     -----------------------------
 *     char c ='a' , char c = 97 ('a')
 *     ------------------------------
 *     double d = 'A';  d = 65.0
 *     (정수, 실수형에 문자 한글자 줘도 됨, 대신 숫자 출력)
 *     
 */
public class 자바변수 {

	public static void main(String[] args) {
	int _int = 20000;
	long _long = 20000; //2000L
	float _float = 10.5f;
	char _char = 65; //'A'
	boolean _boolean = true;
	}

}
