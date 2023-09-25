/*
 * 선택정렬 / 버블정렬
 * ------  -------
 * (ASC / DESC)
 * 
 * 0번 배열요소부터 0-1, 0-2, 0-3, 0-4 ==> 1라운드 끝
 * 1번 배열요소부터 1-2, 1-3, 1-4 ==> 2라운드 끝
 * 2번 배열요소부터 2-3, 2-4 ==> 3라운드 끝
 *  ...
 * arr.length-1 번 까지
 * 
 * i j ==> i+j = 4 ==> j = 4-i
 */
import java.util.Arrays;
public class 배열_5 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1; //1-100
}
		System.out.println("정렬 전: ");
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i<arr.length-1; i++) { //마지막 한바퀴는 안돌아감
			for(int j = i+1; j<arr.length; j++) {// 첫번째 요소는 필요 없음 & i전에는 이미 정렬됨
				if(arr[i] > arr[j]) { // i가 더 클때 오름차순
					int temp = arr[i]; // 임시변수 선언
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
	}
		System.out.println("========ASC 정렬후=========");
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i<arr.length-1; i++) { // j가 더 클때 오름차순
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i]; 
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
	}
		System.out.println("========DESC정렬후=========");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("========API 정렬후=========");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

}
}