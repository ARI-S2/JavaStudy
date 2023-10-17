/*
 * 정렬
 * 알고리즘 : 정렬(선택 정렬, 버블 정렬)
 * 자료구조: 데이터 관리 (추가 => 가지고 오기)
 * 		   스택 / 큐 / 데큐 (양방향)
 * 		:메모리 :네트워크 :
 * 
 * 버블 정렬 (인접한 것 끼리 비교)
 * 30 10 20 50 40
 * -- --
 * 10 30
 *    -- --
 *    20 30
 *       -- --
 *       30 50
 *          -- --
 *          40 50
 * ================ 1라운드 종료 (arr-1 바퀴)
 *             고정!!
 * -- --
 *    -- --
 *       -- --
 * 
 * i  j
 * 0  4 => i+j = 4 => j = 4(arr.length-1)-i
 * 1  3
 * 2  2
 * 3  1
 */

import java.util.Arrays;

public class 배열_3 {

	public static void main(String[] args) {
		// 선택 정렬
		int[] arr = new int[5];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("====정렬 전====");
		System.out.println(Arrays.toString(arr));
		System.out.println("=====선택 정렬 후====");
		for(int i = 0; i<arr.length-1; i++) { // 왼쪽부터 정렬이므로 -1
			for(int j = i+1; j<arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}System.out.println("============"+(i+1)+"라운드 끝=============");
			System.out.println(Arrays.toString(arr));
		}
		
		// 버블 정렬
		int[] arr2 = new int[5];
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = (int)(Math.random()*100)+1;
		}
		System.out.println();
		System.out.println("====정렬 전====");
		System.out.println(Arrays.toString(arr2));
		System.out.println("=====버블 정렬 후====");
		for(int i = 1; i<arr2.length; i++) { // 4바퀴를 돌릴건데 length-1 할바에 i를 1로 시작 => 2차 for문에서 i안쓰이기 떄문
			for(int j = 0; j<arr2.length-i; j++) { // 0번 부터 전체 배열길이 - 정렬된 i번
				if (arr2[j] > arr2[j+1]) {
					int temp = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = temp;
				}
			}System.out.println("============"+(i)+"라운드 끝=============");
			System.out.println(Arrays.toString(arr2));
		}

	}

}
