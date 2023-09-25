/*
 * 문자 10개를 저장
 * 자징된 문자 출력
 * 저장된 문자 거꾸로 출략
 * 
 * Arrays.sort() => 반전할 때 i = 배열의 길이 -1 ; 0까지 ; --
 */

import java.util.Arrays;

public class 배열_10 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;			
		}
		System.out.println("========원본=========");
		System.out.println(Arrays.toString(arr));

		System.out.println("========오름차순 정렬=========");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("========내림차순 정렬=========");
		for(int i = arr.length-1; i>= 0 ; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
