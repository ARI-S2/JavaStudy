/*
 * ** 변수는 1개만 저장하는 공간 
	   --- 많은 경우에 변수를 제어하기 어렵다
	   --- 보완 => 한개의 이름으로 여러개의 변수를 제어 
	              -------- 배열명 ==> 인덱스 번호로 제어
	1. 배열 : 여러개의 변수를 하나로 묶어서 관리하는 역할 
	         1차원 배열 / 2차원 배열 ... 다차원배열 , 가변배열
	         -------- 웹에서는 1차원만 사용
	   장점 : 한개의 변수명으로 모아서 관리하기 때문에 반복문 사용이 쉽다
	         연속적인 메모리 구조 => 인덱스번호를 이용한다
	   단점 : 고정적이다 => 한번 메모리 할당을 하면 변경하기 어렵다
	         => 기존의 배열보다 크게 배열을 만들어 처리
	         => 보완 : 컬렉션 (가변형) ******
	                  -----------
	                  웹) 1. 기본문법
	                      2. 클래스 설계
	                      3. 데이터베이스 연동
	                      4. Front 
	        => 같은 데이터형 끼리만 모아서 관리
	   배열
	   	  1. 선언
	   	     데이터형[] 배열명;
	   	     데이터형 배열명[];
	   	  2. 초기값
	   	     = 생성 동시에 초기화
	   	     int[] arr = {1,2,3,4,5}
	   	     = 자동 초기화
	   	       int[] arr = new int[5];
	   	       -----------------------
	   	       boolean => false;
	   	       char => '\0' => null
	   	       string => null
	   	       			------ 주소가 없는 경우
	   	       			NullPotintException
	   	       			
	   	    스택(주소) 		힙(실제 데이터 저장)
	   	    arr 
	   	    --------       -----------------------
	   	    0x100    ==>    1  ㅣ 2 ㅣ 3 ㅣ 4 ㅣ 5
	   	    --------       -----------------------
	   	                 0x100             0x116
	   	                (시작주소)
	   	    * 인데스번호는 0번부터 시작
	   	    * 순차적으로 되어있음
	   	    * 배열의 인덱스 추가, 삭제 => 불가능
	   	    * 주의점: 인덱스 초과 => 에러
	   	    변수 ) 읽기, 저장, 수정
	   	    
	   	    배열 출력 
	   	    sys.println(arr)    => 주소값만 출력 => 배열명은 값이 아니다
	   	    sys.println(arr[0]) => 실제 값 출력
 
 			3. 활용
 			= 값을 변경, 수정 => 일반 for문
 			= 값을 출력 => for each (처리 속도 빠름)
 			
 */
public class 배열_1 {

	public static void main(String[] args) {
		//정수 5개
		int[] arr = new int[1000];
//		for(int i = 0; i<10; i++) {
//			arr[i] = i;
//			System.out.println(arr[i]);
//		}
//		
		System.out.println("======일반 for문=====");
		long s = System.currentTimeMillis();
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i;
		}
		long e = System.currentTimeMillis();
		System.out.println(e-s);

		System.out.println("======for each=====");
		s = System.currentTimeMillis();
		for(int i : arr) {
			arr[i] = i;
		}
		e = System.currentTimeMillis();
		System.out.println(e-s);
	}

}
