/*
 * => 정수 10개 저장 -> 3의 배수
 */
public class 배열_9 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		// 초기화
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1; //1-100
		}
		// 저장된 값 출력
		for(int i : arr) {
		System.out.print(i+" ");
	}
		System.out.println("\n======== 결과값 =========");
		for(int i :arr) {
			if(i % 3 == 0)
				System.out.print(i+" ");
		}
	}
}
