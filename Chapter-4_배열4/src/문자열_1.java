/*
 * 자바 => 문자열(웹, 윈도우) => 가장 많이 사용되는 데이터형
 * 
 * 문자열 사용법
 * => 데이터형
 *    String : 일반 데이터형, 클래스형 사용 가능
 *             ** 문자열의 저장 갯수는 제한이 없다
 *    => 클래스형으로 만들어져 있다
 *    "01234567" --- 배열 형식 -> char[]
 *    
 *    클래스 => 상속 => 오버라이딩 / 오버로딩
 *    예외) java.lang에 있는  대부분의 클래스 final
 *                         -----------> String , Math , System
 *    ============================================
 *    변환 
 *    	toUpperCase() => 대문자 변환
 *    	toLowerCase() => 소문자 변환
 *    	*** valueOf() => 모든 데이터형을 String으로 변경 => String.valueOf(arr)
 *    제어
 *    	substring() : 문자 자르기
 *    변경
 *    	trim() : 공백 제거(좌우) => 로그린 처리할 떄
 *   	replace() : 문자, 준바열 변경
 *   	replaceAll() ㅣ 변경(정규식)
 *   	split() : 분리
 *    찾기
 *    	indexOf() : 인덱스 찾기 (앞에서) "java" => 1 출력 (가진 첫번째 인덱스)
 *    	lastIndexOf() : 인덱스 찾기 (뒤에서) "java" => 3 출력 (가진 마지막 인덱스)
 *    결합
 *    	concat() ==> 보다는 +로 분자열 결합
 *    비교
 *    	equals() L 같은 문자열 (로그인, 아이디 찾기)
 *    	contains() : 문자열 포함 여부 (검색)
 *    	startWith() : 시작 문자열이 같은 경우 ==> cookie에 저장했다가 뿌림
 *    	endsWith() 
 *    기타
 *    	charAt() : 문자열중에 하나의 char을 얻는다
 *    	toCharArray() ㅣ String을 한 글자씩 char[]로 변경
 */
import java.util.Arrays;
public class 문자열_1 {

	public static void main(String[] args) {
		// 기능 처리 => ㅁ[소드 : 기능 처리한 후에 반드시 결과값을 보내준다
		// 결과 값: 리턴형

		char[] arr = new char[10];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (char)((Math.random()*26)+65);
		}
		
		System.out.println(Arrays.toString(arr));
		String s = String.valueOf(arr); //배열을 문자열로 변환
		System.out.println(Arrays.toString(arr));
		// char[] ==> String valueOf()
		// String => char[] toCharArray()

	}

}
