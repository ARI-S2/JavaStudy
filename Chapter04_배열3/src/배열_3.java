/*

 */

import java.util.Arrays;

public class 배열_3 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr2 = arr.clone(); //깊은 복사 => 값만 복사

		System.out.println(arr);
		System.out.println(arr2);
		System.out.println("=========arr=========");
		System.out.println(Arrays.toString(arr));
		System.out.println("=========arr2=========");
		System.out.println(Arrays.toString(arr2));
		
		// clone => prototype ~> 배열을 더 큰 배열로 값 옮길대 => 주소값 복사 안됨
	}

}
