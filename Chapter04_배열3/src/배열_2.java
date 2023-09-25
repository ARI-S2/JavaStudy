/*
 * 
 */

import java.util.Arrays;

public class 배열_2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr2 = arr; // 같은 메모리 주소
		
		int[] arr3 = new int[5];
		for(int i = 0; i<arr.length; i++) {
			arr3[i] = arr[i]; // 값만 대입 => 다른 메모리 주소
		}
		System.out.println(arr);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println("=========arr=========");
		System.out.println(Arrays.toString(arr));
		System.out.println("=========arr2=========");
		System.out.println(Arrays.toString(arr2));
		System.out.println("=========arr3=========");
		System.out.println(Arrays.toString(arr3));
		
		arr3[0] = 1000;
		arr2[0] = 100;
		System.out.println();
		
		System.out.println("=========arr=========");
		System.out.println(Arrays.toString(arr));
		System.out.println("=========arr2=========");
		System.out.println(Arrays.toString(arr2));
		System.out.println("=========arr3=========");
		System.out.println(Arrays.toString(arr3));
	}

}
