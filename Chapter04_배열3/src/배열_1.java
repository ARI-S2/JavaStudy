/*
 * 1. 86page
 *    new => 메모리 확보
 *           -------- 메모리 크기
 *             ㅣ
 *           메모리 주소를 전송
 *           => new를 사용할 때 마다 ㅁ모리 주소가 달라진다
 *    메모리 주소를 이용해서 데이터를 제어 => 참조변수
 *                                  -------
 *                                  1. 배열
 *                                  2. 클래스
 *    데이터형[] 배명명;
 *    => 복사
 *       얕은 복사: 참조(공유)
 *       깊은 복사: 새로운 배열을 만든다      
 */
public class 배열_1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		//얕은 복사 => 참조(공유)
		int[] arr2 = arr; //주소값 전달
		// ~> 같은 메모리 공간을 제어하므로 한 배열 값이 바뛰어도 같이 바뀜
		arr[0] = 100;
		arr[1] = 200;
		
		System.out.println("arr2[0]=>"+arr2[0]);
		System.out.println("arr2[1]=>"+arr2[1]);
		
	}

}
