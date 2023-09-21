/*
 * 문자열
 * ---- String 기능
 * 1. 문자 갯수 확인 : length()
 * 2. 검색
 *    ---
 *    startWith: 시작하는 문자열이 같은 경우
 *    endWith: 끝나는 문자열이 같은 경우 => cookie
 *    ***contains: 포함된 문자열이 있는지
 *    ----------- 추천
 *    ***equals: 같은 값 = if&ps
 *       ------ 대소문자 구분
 * 3. 문자열 제어
 *    = 변경 : replace() , replaceAll()
 *    		  replace('a','b')
 *            replaceAll("[가-힣]","")
 *            replaceAll("[0-9A-Za-z]","")
 *    = 문자 자르기 : substring(1) => 인덱스번호부터 자름
 *                 substring(4,7) => 마지막 인덱스 -1까지
 *    = 대문자: toUpperCase
 *      소문자: toLowerCase
 * 4. 모든 데이터형을 문자열로 변경
 * 	  = valueOf(1) => "1" ==> 윈도우, 웹 
 * 5. 분리: split() => Spring[]
 *    charAt()
 *    @ 오라클은 인덱스가 1부터 시작
 * 
 * String => 일반형
 * 값에 의한 요청 / 참조에 의한 요청
 *      ㅣ             ㅣ 
 *    String        클래스 / 배열
 * 향식)
 * String s = "";
 * String s = new String("");
 * 
 */
public class 문자열2 {

	public static void main(String[] args) {
		String s = "Hello, Java!";
		System.out.println(s.length());
		if(s.startsWith("Hello")) { //서제스트 .startsWith( ) => 검색기 만들 떄 
			System.out.println("포함됨");
		}

	}

}
